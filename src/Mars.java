import java.util.Scanner;

public class Mars {
    public static void main(String[] args) throws InterruptedException {

        String colonyName = "The Dog House";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        meals -= shipPopulation * 0.75 * 2;
        System.out.println("There are " + meals + " meals left");
        meals += meals * 0.5;
        shipPopulation += 5;

        String landingLocation = "The Hill";

        if(landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz landing on The Plain");
        } else {
            System.out.println("ERROR!! Flight plan already set.  Landing on the Plain.");
        }

        landing = landingCheck(10);
        
        // activity selector
        Scanner scanner = new Scanner(System.in);
        String activitySelection;

        while (true) {
            System.out.println("\nWhat would you like to do? A or B ?" +
                            "\n\tA: Play the Guessing Game" +
                            "\n\tB: Explore Mars!" +
                            "\n\tC: Check out what we have found on Mars so far!");
        
            activitySelection = scanner.nextLine();

            if (activitySelection.equalsIgnoreCase("A")) {
                System.out.println("You selected A, playing the Guessing Game.  Let's go!");
                new GuessingGame();
                break;
            } else if (activitySelection.equalsIgnoreCase("B")) {
                System.out.println("You selected B, exploring Mars.  Let's go!");
                new MarsExpedition();
                break;
            } else if (activitySelection.equalsIgnoreCase("C")) {
                System.out.println("You selected C, checking out what we have found on Mars.  Let's go!");
                new FindingsList();
                break;
            } else {
                System.out.print("Not a valid option. Try Again"); 
            }
        }

        scanner.close();
    }


    public static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for(int minute = 0; minute <= minutesLeft; minute++) {
            if ( minute % 2 == 0 && minute % 3 == 0) {
                System.out.println("Keep Center");
            } else if (minute % 2 == 0) {
                System.out.println("Right");
            } else if (minute % 3 == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calclating;");
            }
            // error if throws exceptions not included
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }

}
