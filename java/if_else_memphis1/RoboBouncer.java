import java.util.Scanner;

public class RoboBouncer {

	public static void main(String[] args) {
		Scanner bounce = new Scanner(System.in);
		
		System.out.println("Welcome to the finest club in the land!");
		
		System.out.println("How old are you?");
		int age = bounce.nextInt();
		
		if (age >= 21) {
			System.out.println("Come on in, the brain cells are dying en masse today!");
		} else {	

			// This is a "nested" if-else statement.  It won't run unless we get to the else in line
			//  20 (i.e., if the condition age >= 21 is false).
			if (age >= 13) {	
				System.out.println("gtfo, sorry :(");
			} else {			
				System.out.println("Where is your mother, and why are you in line for this club?");
			}
			
			System.out.println("Come back in " + (21 - age) + " years :)");
		}
	}
}