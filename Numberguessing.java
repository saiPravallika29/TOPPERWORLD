package INTERNSHIP;
	import java.util.Scanner;
	public class Numberguessing
	{
	    public static void main(String[] args) 
	    {
	        // Generate a random number between 1 and 100
	        int number = (int) (Math.random() * 100) + 1;
	        // Create a scanner object to read user input
	        Scanner scanner = new Scanner(System.in);
	        // Start a loop to keep asking the user for a guess
	        while (true)
	        {
	            // Prompt the user to enter a guess
	            System.out.println("Enter your guess (1-100): ");
	            // Read the user's guess
	            int guess = scanner.nextInt();
	            // Check if the guess is correct
	            if (guess == number) 
	            {
	                // If the guess is correct, print a message and break out of the loop
	                System.out.println("Congratulations, you guessed the correct number!");
	                break;
	            } else if (guess < number) 
	            {
	                // If the guess is too low, print a message and continue the loop
	                System.out.println("Your guess is too low. Try again.");
	            } else {
	                // If the guess is too high, print a message and continue the loop
	                System.out.println("Your guess is too high. Try again.");
	            }
	        }
	        // Close the scanner object
	        scanner.close();
	    }
	}