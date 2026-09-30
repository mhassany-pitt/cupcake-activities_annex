public class BooleanDemos {
	public static void main(String[] args) {
		// Java has six relational operators:
		//  <	less than
		//	>	greater than
		//	<=	less than or equal to
		//	>=	greater than or equal to
		//	==	is equal to (don't confuse this with the single equals!  Single equals means "assign the value on the right to the variable on the left"; double equals means "check the values on both sides to see if they're equal")
		//	!=	is not equal to
		
		System.out.println(4 < 10);
		System.out.println(4 > 10);
		System.out.println(4 == 4);
		System.out.println(4 == 11);
		System.out.println(4 != 11);
		System.out.println(0 != 0);
		// You can apply boolean operators between boolean expressions:
		//  "and", &&
		//  a && b is true if both of a, b are true; false otherwise
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		//  "or", ||
		//  a || b is false if both of a, b are false; true otherwise
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		System.out.println(4 != 10 && 5 < 3);
		System.out.println(4 != 10 || 5 < 3);	
		System.out.println(4 >= 4 || 0 != 2);	
		System.out.println(4 <= 3 && 6 == 6);

		// Order of operations in boolean expressions:
		//  Parentheses
		//	Not
		//	And
		//	Or
		System.out.println(!(4 != 10) || 4 < 5 && 8 >= 4);

		// You can also use variables in boolean expressions, as long as the
		//  variables have been declared and have values assigned to them
		int x = 4;
		System.out.println(x < 4);	
	}

