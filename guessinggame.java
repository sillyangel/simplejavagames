import java.util.Scanner;

public class GuessingGame {
  public static void main(String[] args) {

    // Welcome message
    System.out.println("Welcome to the Guessing Game!");
    System.out.println("I'm thinking of a number between 1 and 10. Can you guess what it is?");

    // Generate a random number between 1 and 10
    int secretNumber = (int) (Math.random() * 10) + 1;

    // Create a Scanner object
    Scanner input = new Scanner(System.in);

    // Prompt user for input
    System.out.print("Your guess: ");
    int guess = input.nextInt();

    // Check user input against secretNumber
    if (guess == secretNumber) {
      System.out.println("Congratulations! You guessed it!");
    } else {
      System.out.println("Sorry, that's not it. My number was " + secretNumber);
    }
  }
}
