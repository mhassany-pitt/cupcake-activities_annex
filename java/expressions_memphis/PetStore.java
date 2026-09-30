import java.util.Scanner;

public class PetStore {
	public static void main(String[] args) {
		Scanner fido = new Scanner(System.in);
		final double 	DOG_PRICE = 50,
						DRAGON_PRICE = 820381903,
						SLOTH_PRICE = 900018293028L,
						BABY_MONKEY_PRICE = 0.15,
						AMOEBA_PRICE = 16000000;
		
		System.out.println("Welcome to the finest pet store in the land!");
		System.out.println("Pet menu:");
		System.out.println("1. Dogs\t\t\t$" + DOG_PRICE);
		System.out.println("2. Dragons\t\t$" + DRAGON_PRICE);
		System.out.println("3. Sloths\t\t$" + SLOTH_PRICE);
		System.out.println("4. Baby monkeys\t\t$" + BABY_MONKEY_PRICE);
		System.out.println("5. Amoebas\t\t$" + AMOEBA_PRICE);
		System.out.println();	// This just skips a line
		
		System.out.println("How many dogs would you like to buy?");
		int dogs = fido.nextInt();
		System.out.println("How many dragons would you like to buy?");
		int dragons = fido.nextInt();
		System.out.println("How many sloths would you like to buy?");
		int sloths = fido.nextInt();
		System.out.println("How many baby monkeys would you like to buy?");
		int babyMonkeys = fido.nextInt();
		System.out.println("How many amoebas would you like to buy?");
		int amoebas = fido.nextInt();

		double subtotal = dogs*DOG_PRICE + dragons*DRAGON_PRICE + sloths*SLOTH_PRICE + babyMonkeys*BABY_MONKEY_PRICE + amoebas*AMOEBA_PRICE;
		
		double tax = subtotal*.0925;
		
		double total = subtotal + tax;

		System.out.println("Subtotal:\t\t$" + subtotal);
		System.out.println("Tax:\t\t\t$" + tax);
		System.out.println("Total:\t\t\t$" + total);
	}
}