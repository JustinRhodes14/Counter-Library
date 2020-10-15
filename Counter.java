//Author: Justin Rhodes
public class Counter{
    //Private variables used to construct our counter
    private int hours;
    private int minutes;
    private int seconds;
    private boolean morning;
    private boolean military;


    //Default constructor, uses military time and starts in the morning.
    public Counter() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
        this.morning = true;
        this.military = true;
    }
    

    //Parameterized constructor, takes in 5 arguments to fill all 5 of our instance variables
    public Counter(int hrs,int mins, int secs,boolean morn,boolean mil) {
        this.hours = ((mil) ? hrs % 24 : hrs % 12);//If a user inputs something larger than what our timer displays, we can take the modulus of 
        //it to ensure that we don't have to deal with out of bounds errors for our timer
        this.minutes = (mins % 60);//Same for mins and seconds
        this.seconds = (secs % 60);
        this.military = mil;

        if (getMilitary() && hrs >= 12) { //Book keeping
            morn = false;
        } else if (getMilitary()) {
            morn = true;
        }

        this.morning = morn;
    }


    //Incrementing functions for our counter
    public void incrHours() {
        if (getMilitary() && getHours() == 23) {//Check if we are at our limit
            setHours(0);
        } else if (!getMilitary() && getHours() == 12) {
            setHours(1); 
        } else if (!getMilitary() && getHours() == 11) {
            setMorning(!this.morning); //Change to opposite time
            this.hours++;
        }else {
            this.hours++;
        }
    }

    public void incrMins() {
        if (getMins() == 59) {
            incrHours();//Handle time changes inside of the hours function
            setMins(0);
        } else {
            this.minutes++;
        }
    }

    public void incrSecs() {
        if (getSecs() == 59) {
            incrMins();//Same applies as we said above
            setSecs(0);
        } else {
            this.seconds++;
        }
    }
    //End of incrementer functions


    //Decrementing functions for our counter
    public void decrHours() {
        if (getMilitary() && getHours() == 0) {
            setHours(23);
        } else if (!getMilitary() && getHours() == 1) {
            setHours(12);
        } else if (!getMilitary() && getHours() == 12) {
            setMorning(!this.morning);
            this.hours--;
        } else {
            this.hours--;
        }
    }

    public void decrMins() {
        if (getMins() == 0) {
            decrHours();
            setMins(59);
        } else {
            this.minutes--;
        }
    }
    
    public void decrSecs() {
        if (getSecs() == 0) {
            decrMins();
            setSecs(59);
        } else {
            this.seconds--;
        }
    }
    //End of decrementer functions


    public String toString() { //Stringify our time making it easier to read, if any numbers are 1 digit a 0 should be prepended to them
        String result = "";
        if (getHours() < 10) {
            result += ("0" + getHours());
        } else {
            result += getHours();
        }

        if (getMins() < 10) {
            result += (":0" + getMins());
        } else {
            result += (":" + getMins());
        }

        if (getSecs() < 10) {
            result += (":0" + getSecs());
        } else {
            result += (":" + getSecs());
        }

        if (getMorning() && !getMilitary()) { //No need to appened the time of day to our string if using military time
            result += " AM - ";
        } else if (!getMilitary()) {
            result += " PM - ";
        }

        if (getMilitary()) {
            result+= " - Military";
        } else {
            result+= "Standard";
        }

        return result;
    }

    public boolean equals(Counter c) {//Since it wasn't specified, for now I'm going to say two times are equal if all of their attributes are equal.
        return (getHours() == c.getHours() && getMins() == c.getMins() && getSecs() == c.getSecs() && getMilitary() == c.getMilitary() && getMorning() == c.getMorning());
    }


    //All getter functions for our instance variables
    public int getHours() {
        return this.hours;
    }

    public int getMins() {
        return this.minutes;
    }

    public int getSecs() {
        return this.seconds;
    }

    public boolean getMilitary() {//True if in military time, false if in standard time
        return this.military;
    }

    public boolean getMorning() {//True if morning, false if it's the afternoon
        return this.morning;
    }
    //End of getter functions


    //All setter functions for our instance variables if desirable in later iterations of our library
    public void setHours(int h) {
        this.hours = h;
    }

    public void setMins(int m) {
        this.minutes = m;
    }

    public void setSecs(int s) {
        this.seconds = s;
    }

    public void setMilitary(boolean m) {
        this.military = m;
    }

    public void setMorning(boolean m) {
        this.morning = m;
    }
    //End of setter functions

    
}