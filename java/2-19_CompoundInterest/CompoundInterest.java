/*
 * This program simulates how the money in an account grows over time,
 * assuming that the interest is compounded annually.
 * 
 * We've added some error checking (input validation) to ensure that the user enters
 * a non-negative value for the starting balance.
 */
import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// Here's a deluxe version that also keeps track of the number of invalid entries made by the user!
		// The user is given a maximum of 3 invalid tries before the program exits.
		double balance;
		int invalidTries = 0;
		do {
			System.out.println("Enter starting amount of money:");
			balance = s.nextDouble();
			if (balance < 0) {
				System.out.println("The balance must be a non-negative value!");
				invalidTries++;
			}
			
			if (invalidTries >= 3) {
				System.out.println("You have exceeded the limits of my patience for incompetence.");
				System.exit(1);	
			}
		} while (balance < 0);
		
		System.out.println("Enter the annual rate of growth (as a decimal):");
		double rate = s.nextDouble();
		System.out.println("Enter how much extra to throw in at the end of each year:");
		double extra = s.nextDouble();
		System.out.println("How many years would you like this to grow?");
		int years = s.nextInt();
		
		int y = 1;
		while (y <= years) {	// This loop repeats "years" times
			double startingBalance = balance;
			double interest = balance*rate;
			balance = startingBalance + interest + extra;	
			System.out.format("%3d  $%12.2f  $%12.2f  $%12.2f  $%12.2f\n", y, startingBalance, interest, extra, balance);
			y++;
		}
	}
}
