import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public GuessingGame() {
        System.out.println("Hi there!");
        System.out.println("Your name please.");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        
        Random rand = new Random();
        int number = rand.nextInt(100);
        int count = 0;
        int guess;
        while(true) {
            System.out.print("Take a guess between 1 to 100 :");
            try {
                guess = scan.nextInt();
            } catch (InputMismatchException e) {
                // IMPORTANT!!! 
                // if guess is not integer, this will catch the invalid guess 
                String badGuess = scan.next(); 
                System.out.println("Invalid guess type.");
                continue;
            }
            if(guess > 100 || guess < 1) {
                System.out.println("Invalid number!");
                count++;
                continue;
            }
            if (guess > number) {
                count++;
                System.out.println("Your guess is too high");
            } else if (guess < number) {
                count++;
                System.out.println("Your guess is too low");  
            } else {
                count++;
                System.out.println("Congratulation, " + name + "! It took you " + count + " tries to win!");
                break;
            } 
        }
        scan.close();

    }
}
