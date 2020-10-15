//Author: Justin Rhodes
public class CounterDriver {
    public static void main(String[] args) {
        System.out.println("Counter Library - Made by Justin Rhodes for the 2020 Maxeta Intern Project");
        System.out.println();
        System.out.println("We will have two counters made, one to test our standard time functionality, and one to test our military time functionality.");


        System.out.println();
        System.out.println();
        System.out.println("Now testing STANDARD counter - Incrementing");
        System.out.println();

        System.out.println("Initializing\n");
        Counter cStan = new Counter(1,0,0,true,false);
        System.out.println("Final value:");
        System.out.println(cStan.toString() + "\n");
        System.out.println("Incrementing seconds 59 times...\n");
        for (int i = 0; i < 59; i++) {
            cStan.incrSecs();
        }
        System.out.println("Final value:");
        System.out.println(cStan.toString() + "\n");

        System.out.println("Incrementing minutes 59 times...\n");
        for (int i = 0; i < 59; i++) {
            cStan.incrMins();
        }
        System.out.println("Final value:");
        System.out.println(cStan.toString() + "\n");

        System.out.println("Incrementing hours 11 times...\n");
        for (int i = 0; i < 11; i++) {
            cStan.incrHours();
        }
        System.out.println("Final value:");
        System.out.println(cStan.toString() + "\n");

        System.out.println("Incrementing seconds by 1...\n");
        cStan.incrSecs();
        System.out.println("Final value:");
        System.out.println(cStan.toString() + "\n");


        System.out.println();
        System.out.println();
        System.out.println("Now testing STANDARD counter - Decrementing");
        
        System.out.println("Testing: " + cStan.toString() + "\n");

        System.out.println("Decrementing seconds by 1...\n");
        cStan.decrSecs();
        System.out.println("Final value:");
        System.out.println(cStan.toString() + "\n");

        System.out.println("Decrementing hours by 1...\n");
        cStan.decrHours();
        System.out.println("Final value:");
        System.out.println(cStan.toString() + "\n");

        System.out.println("Decrementing hours 10 more times...\n");
        for (int i = 0; i <10; i++) {
            cStan.decrHours();
        }
        System.out.println("Final value:");
        System.out.println(cStan.toString() + "\n");

        System.out.println("Decrementing minutes 59 times...\n");
        for (int i = 0; i < 59; i++) {
            cStan.decrMins();
        }
        System.out.println("Final value:");
        System.out.println(cStan.toString() + "\n");

        System.out.println("Decrementing seconds 59 times...\n");
        for (int i = 0; i < 59; i++) {
            cStan.decrSecs();
        }
        System.out.println("Final value:");
        System.out.println(cStan.toString() + "\n");

        System.out.println("Decrementing seconds by 1...\n");
        cStan.decrSecs();
        System.out.println("Final value:");
        System.out.println(cStan.toString() + "\n");

        System.out.println("Testing 24 hour increments now...\n");
        cStan.incrSecs();
        System.out.println("Testing: " + cStan.toString() + "\n");

        System.out.println("Incrementing our time 24 hours...");
        for (int i = 0; i < 24; i++) {
            cStan.incrHours();
        }
        System.out.println("Final value:");
        System.out.println(cStan.toString() + "\n");

        System.out.println("Incrementing our time 1440 minutes...");
        for (int i = 0; i < 1440; i++) {
            cStan.incrMins();
        }
        System.out.println("Final value:");
        System.out.println(cStan.toString() + "\n");

        System.out.println("Incrementing our time 86400 seconds...");
        for (int i = 0; i < 86400; i++) {
            cStan.incrSecs();
        }
        System.out.println("Final value:");
        System.out.println(cStan.toString() + "\n");

        System.out.println("Incrementing our time 24 hours step by step");
        System.out.println(cStan.toString() + "\n");
        for (int i = 0; i < 24; i++) {
            cStan.incrHours();
            System.out.println(cStan.toString() + "\n");
        }

        System.out.println("Standard time working as expected, moving on to military time\n");




        System.out.println();
        System.out.println();
        System.out.println("Now testing MILITARY counter - Incrementing\n");

        System.out.println("Initializing...\n");
        Counter cMil = new Counter(1,0,0,false,true);
        System.out.println("Final value:");
        System.out.println(cMil.toString() + "\n");

        
        System.out.println("Testing: " + cMil.toString() + "\n");


        System.out.println("Incrementing seconds 59 times...\n");
        for (int i = 0; i < 59; i++) {
            cMil.incrSecs();
        }
        System.out.println("Final value:");
        System.out.println(cMil.toString() + "\n");

        System.out.println("Incrementing minutes 59 times...\n");
        for (int i = 0; i < 59; i++) {
            cMil.incrMins();
        }
        System.out.println("Final value:");
        System.out.println(cMil.toString() + "\n");

        System.out.println("Incrementing hours 11 times...\n");
        for (int i = 0; i < 11; i++) {
            cMil.incrHours();
        }
        System.out.println("Final value:");
        System.out.println(cMil.toString() + "\n");

        System.out.println("Incrementing seconds by 1...\n");
        cMil.incrSecs();
        System.out.println("Final value:");
        System.out.println(cMil.toString() + "\n");


        System.out.println();
        System.out.println();
        System.out.println("Now testing MILITARY counter - Decrementing");
        
        System.out.println("Testing: " + cMil.toString() + "\n");

        System.out.println("Decrementing seconds by 1...\n");
        cMil.decrSecs();
        System.out.println("Final value:");
        System.out.println(cMil.toString() + "\n");

        System.out.println("Decrementing hours by 1...\n");
        cMil.decrHours();
        System.out.println("Final value:");
        System.out.println(cMil.toString() + "\n");

        System.out.println("Decrementing hours 10 more times...\n");
        for (int i = 0; i <10; i++) {
            cMil.decrHours();
        }
        System.out.println("Final value:");
        System.out.println(cMil.toString() + "\n");

        System.out.println("Decrementing minutes 59 times...\n");
        for (int i = 0; i < 59; i++) {
            cMil.decrMins();
        }
        System.out.println("Final value:");
        System.out.println(cMil.toString() + "\n");

        System.out.println("Decrementing seconds 59 times...\n");
        for (int i = 0; i < 59; i++) {
            cMil.decrSecs();
        }
        System.out.println("Final value:");
        System.out.println(cMil.toString() + "\n");

        System.out.println("Decrementing seconds by 1...\n");
        cMil.decrSecs();
        System.out.println("Final value:");
        System.out.println(cMil.toString() + "\n");

        System.out.println("Testing 24 hour increments now...\n");
        cMil.incrSecs();
        System.out.println("Testing: " + cMil.toString() + "\n");

        System.out.println("Incrementing our time 24 hours...");
        for (int i = 0; i < 24; i++) {
            cMil.incrHours();
        }
        System.out.println("Final value:");
        System.out.println(cMil.toString() + "\n");

        System.out.println("Incrementing our time 1440 minutes...");
        for (int i = 0; i < 1440; i++) {
            cMil.incrMins();
        }
        System.out.println("Final value:");
        System.out.println(cMil.toString() + "\n");

        System.out.println("Incrementing our time 86400 seconds...");
        for (int i = 0; i < 86400; i++) {
            cMil.incrSecs();
        }
        System.out.println("Final value:");
        System.out.println(cMil.toString() + "\n");

        System.out.println("Incrementing our time 24 hours step by step");
        for (int i = 0; i < 59; i++) {
            cMil.incrSecs();
        }
        System.out.println(cMil.toString() + "\n");
        for (int i = 0; i < 59; i++) {
            cMil.incrMins();
        }
        System.out.println(cMil.toString() + "\n");
        for (int i = 0; i < 24; i++) {
            cMil.incrHours();
            System.out.println(cMil.toString() + "\n");
        }
        
        System.out.println("\n");
        System.out.println("Testing equals function");
        System.out.println(cStan.equals(cMil));//Comparing wrong times
        System.out.println(cStan.equals(cStan));//Comparing same


        System.out.println("\nMilitary time working as expected, testing concluded\n");



    }
}