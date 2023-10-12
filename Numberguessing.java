package INTERNSHIP;
	import java.util.Scanner;
	public class Numberguessing
	{
	    public static void main(String[] args) 
	    {
	        int number = (int) (Math.random() * 100) + 1;
	        Scanner scanner = new Scanner(System.in);
	        while (true)
	        {
	            System.out.println("Enter your guess (1-100): ");
	            int guess = scanner.nextInt();
	            if (guess == number) 
	            {
	                System.out.println("Congo!!, you guessed the correct number!");
	                break;
	            } else if (guess < number) 
	            {
	                // If the guess is too low, print a message and continue the loop
	                System.out.println("Your guess is too low. Try again.");
	            } else {
	                System.out.println("Your guess is too high. Try again.");
	            }
	        }
	        scanner.close();
	    }
	}
