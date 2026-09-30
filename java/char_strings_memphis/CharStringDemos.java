import java.util.Scanner;

public class CharStringDemos {

	public static void main(String[] args) {
		// So far we've talked about 7 primitive data types:
		//  int, long, short, byte
		//  double, float
		//  boolean
		//
		// char is the last primitive data type - it's used to store individual
		//  character values.  char values are denoted using single quotes, and
		//  internally they are stored as 16-bit Unicode.  This means every char
		//  value is associated with a number.  For example, 'A' is 65, and 'a' is 97.
		char x = 'A', y = '0';
		System.out.println(x);		
		System.out.println(y);		
		System.out.println((int)x);	
		System.out.println((int)y);	
		System.out.println(x + y);	
		System.out.println((char)65);	
		System.out.println((char)65.9);	

		// Declaring String variables and assigning them values
		String something = "Sloths ", something2 = "are nice!";
		System.out.println(something + something2);	

		// Concatenation also works with strings and non-string values
		int a = 10;
		System.out.println("a has the value of " + a);
		
		// Converting a string to a numeric type -- you can't just cast to int or double!
		String number = "10";
		int n = Integer.parseInt(number);
		System.out.println(n);
		double d = Double.parseDouble(number);
		System.out.println(d);
		
		// Reading user input for a string
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = in.nextLine();	
		System.out.println("What is your quest?");
		String quest = in.nextLine();
		System.out.println(name + ", " + quest);
	}
}