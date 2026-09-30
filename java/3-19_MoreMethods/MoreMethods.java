/* 
 * Some more examples of methods, including recursive methods.
 * 
 * A recursive method is a method that calls itself in its own definition.
 * 
 */
public class MoreMethods {

	// This method returns a Pig Latin version of the parameter.  We use only
	//  one Pig Latin rule: move the first letter of the word to the end, and
	//  add "ay" after that.
	public static String pigLatinize(String something) {
		return something.substring(1) + "-" + something.charAt(0) + "ay";
	}
	
	public static double max(double a, double b, double c) {
		if (a >= b && a >= c)
			return a;
		else if (b >= a && b >= c)
			return b;
		else
			return c;
	}
	

	// Several overloaded versions of print - these methods don't return anything,
	//  so their return type is void.
	public static void print(String something) {
		System.out.println(something);
	}

	public static void print(int something) {
		System.out.println(something);
	}
	
	public static void print(char something) {
		System.out.println(something);
	}

	
	public static int factorial(int n) {
		if (n == 0)	
			return 1;
		else
			return n*factorial(n-1);
	}
	
	// Recursively computes the nth Fibonacci number.  The Fibonacci sequence
	//  starts with 0, 1, and each subsequent number is computed by adding the
	//  two previous numbers.
	// (The "0th" Fibonacci number is 0, and the "1st" Fibonacci number is 1.)
	public static int fibo(int n) {
		if (n == 0)	
			return 0;
		else if (n == 1)
			return 1;
		else
			return fibo(n-1) + fibo(n-2);
	}
	
	public static void main(String[] args) {
		// The recursive Fibonacci method is very inefficient!
		for (int i = 0; i < 100; i++)
			System.out.println(fibo(i));
		
	}
}