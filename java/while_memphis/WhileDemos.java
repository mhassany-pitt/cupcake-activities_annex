public class WhileDemos {
	public static void main(String[] args) {
		// Example 1: This loop repeats 5 times.  Use this as a template for 
		//  a loop that repeats a certain number of times!
		int i = 0;		
		while (i < 5) {
			System.out.println("Sloths are nice!");
			i++;
		}

		// Example 2: This loop also repeats 5 times.  We just start i from
		//  5 and make it count down, instead of starting i from 0 and
		//  making it count up.
		int i = 5;
		while (i > 0) {
			System.out.println("Sloths are nice!");
			i--;
		}

		// Example 3: This loop displays the first 100 positive odd integers
		///  (1, 3, 5, 7, ...) on the screen.
		int x = 1;			
		int i = 0;			
		while (i < 100) {
			System.out.println(i + " - " + x);
			x += 2;
			i++;
		}

		// Example 4: Another way of getting the first 100 positive odd integers
		//  This version uses a single variable i.
		int i = 0;
		while (i < 100) {
			System.out.println(2*i + 1);
			i++;
		}
	}
}
