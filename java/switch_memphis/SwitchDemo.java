/*
 * Demonstrates how to use Java switch statement.
 * This program determines whether an integer between 1 and 10 is prime.
 * (Prime numbers are integers that are divisible by only themselves
 *  and 1.  2 is considered the smallest prime number.)
 */

public class SwitchDemo {
	public static void main(String[] args) {
		
		int x = 13;

		switch (x) {
		case 2:	
		case 3:
		case 5:
		case 7:
			System.out.println("Prime");
			break;
		case 1:
		case 4:
		case 6:
		case 8:
		case 9:
		case 10:
			System.out.println("Not prime");
			break;
		default:	
			System.out.println("Sorry, I can handle only numbers between 1 and 10... for now");
		}
	}
}
