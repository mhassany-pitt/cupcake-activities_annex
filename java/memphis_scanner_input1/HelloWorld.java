import java.util.Scanner;	// To use Scanner, this import statement must be included before the "public class"

// This is a program named "HelloWorld"
public class HelloWorld {
	// This is a main method.  Program execution always starts from the main method.
	public static void main(String[] args) {
		// Create a Scanner object named input.  You can name this object anything you want,
		//  but you have to be consistent when using it later in the program.
		Scanner input = new Scanner(System.in);
		
		// Get user input for the number of cents
		System.out.println("How many cents would you like to make change for?");
		int cents = input.nextInt();	// This line pauses the program, allows the user to enter some int input, and stores that input value into the variable cents

		// Figure out how many quarters, dimes, nickels, and pennies will add up to that amount of cents
		System.out.println(cents/25 + " quarter(s)");
		System.out.println(cents%25/10 + " dime(s)");	// cents%25 is the amount left over after taking out the quarters
		System.out.println(cents%25%10/5 + " nickel(s)");	// cents%25%10 is the amount left over after taking out the quarters and dimes
		System.out.println(cents%25%10%5/1 + " penny/pennies");	// cents%25%10%5 is the amount left over after taking out the quarters, dimes, and nickels
	}
}