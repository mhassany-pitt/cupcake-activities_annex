import java.util.Scanner;	
public class HelloWorld {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Get user input for the number of cents
		System.out.println("How many cents would you like to make change for?");
		int cents = input.nextInt();

		// Figure out how many quarters, dimes, nickels, and pennies will add up to that amount of cents
		System.out.println(cents/25 + " quarter(s)");
		System.out.println(cents%25/10 + " dime(s)");	
		System.out.println(cents%25%10/5 + " nickel(s)");	
		System.out.println(cents%25%10%5/1 + " penny/pennies");	
	}
}