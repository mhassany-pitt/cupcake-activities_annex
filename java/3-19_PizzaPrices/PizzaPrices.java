/*
 * Demo of how to define your own methods.
 */
import java.util.Scanner;

public class PizzaPrices {

	// The first line of a method definition is called the header.
	// The header includes "public static" (more on what this means later),
	//  followed by the method's return type, followed by the method's name,
	//  followed by a list of the method's parameters.
	public static double pizzaCost(int toppings) {
		// The method body indicates what to do with the parameters.
		double cost = 5.46 + 1*toppings;
		return cost;
	}

	// This is an overloaded version of the pizzaCost method.  Method
	//  overloading means defining more than one version of the same method that
	//  differ in their parameter quantity and/or type.  Java determines
	//  which version to use based on the arguments provided when you call
	//  the method.
	public static double pizzaCost(int toppings, String size) {
		double basePrice, toppingPrice;
		if (size.equalsIgnoreCase("S")) {
			basePrice = 5.46;
			toppingPrice = 1;
		} else if (size.equalsIgnoreCase("M")) {
			basePrice = 8;
			toppingPrice = 1.5;
		} else if (size.equalsIgnoreCase("L")) {
			basePrice = 10;
			toppingPrice = 2;
		} else {
			basePrice = 30;
			toppingPrice = 7.5;
		}
		
		double cost = basePrice + toppingPrice*toppings;
		return cost;
	}
	
	public static void main(String[] args) {
		Scanner yum = new Scanner(System.in);
		System.out.println("What size of pizza do you want? (S, M, L, USA)");
		String size = yum.nextLine();
		System.out.println("How many toppings?");
		int numSloths = yum.nextInt();

		// This is an example of a method call.  To call a method, just type its
		//  name followed by the inputs you want to use.  The inputs here are known
		//  as arguments.
		double cost = pizzaCost(numSloths, size);
		System.out.println(cost);
		double bigOrderPrice = 7*pizzaCost(5, "L") + 40*pizzaCost(10, "USA") + pizzaCost(1, "S");
	}
}
