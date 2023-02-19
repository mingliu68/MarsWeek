import java.util.Scanner;
import java.util.InputMismatchException;


public class MarsExpedition {
    public MarsExpedition() throws InterruptedException {

        Scanner input = new Scanner(System.in);

        // expedition bootup
        System.out.println("\nSystem booting up...");
        Thread.sleep(500);
        System.out.println("Booting up complete... Ready...");
        // team setup
        System.out.print("\nYour name please: ");
        String name = input.nextLine();
        System.out.print("\nHi, " + name + " — Welcome to the Expedition prep program. \nAre you ready to head out into the new world? Type Y or N: ");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("Y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else {
            System.out.println("Too bad you are team leader. You have to go.");
        } 
        int memberCount;

        while(true) { 
            System.out.print("\nHow many people do you want on your team? ");
            try {
                memberCount = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                // IMPORTANT!!! 
                // if guess is not integer, this will catch the invalid guess 
                String badInput = input.next(); 
                System.out.println("Invalid type. Let's try again. This time, input an integer instead.");
            }
        }

        if (memberCount > 2) {
            System.out.println("That's way too many people! There are 3 seats in the pod. \nSo including you, we need exactly 3 members");
            memberCount = 2;
        } else if (memberCount < 2) {
            System.out.println("That's not enough people! There are 3 seats in the pod. \nSo including you, we need exactly 3 members");
            memberCount = 2;
        } else if (memberCount == 2) {
            System.out.println("2 is the magic number!");
        }

        // snack choice
        System.out.print("\nYou are allowed to bring one snack with you. What do you want to bring? ");
        input.nextLine();
        String snack = input.nextLine();
        System.out.println("Nice choice, you will be bringing a " + snack + " with you.");

        // vehicle selection
        
        System.out.println("\nPlease select your vehicle from the list below:" +
                            "\n\tA: The Bat Mobile" +
                            "\n\tB: Kit" + 
                            "\n\tC: Doc's Delorean" );

        String vehicle = input.nextLine();

        if (vehicle.equalsIgnoreCase("A")) {    
            vehicle = "The Bat Mobile";
        } else if (vehicle.equalsIgnoreCase("B")) {
            vehicle = "Kit";
        } else if (vehicle.equalsIgnoreCase("C")) {
            vehicle = "Doc's Delorean";
        } else {
            vehicle = "your feet";
        }

        // final message
        System.out.println("\nYour expedition team is now ready." +
                            "\nTeam leader of your team is you, " + name + " and 2 other members." +
                            "\nYou will be bringing along a " + snack + " with your for this expedition." +
                            "\nAnd, you will be exploring Mars in style in " + vehicle + "." +
                            "\n\nYour team is now ready to go in") ;
        
        for (int i = 5; i > 0; i--) {
            System.out.println(i + "....");
            Thread.sleep(500);
        }
        
        System.out.println("It's go time!");

        input.close();
    }
}
