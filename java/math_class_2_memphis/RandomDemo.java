/*
 * Demonstrates how to use Math.random() to simulate dice rolling.
 * 
 * Math.random() by itself gives a uniformly distributed random decimal in the range [0, 1).
 * 6*Math.random() gives a uniformly distributed random decimal in the range [0, 6).
 * (int)(6*Math.random()) gives a uniformly distributed random integer from the set {0, 1, 2, 3, 4, 5}.
 * Finally, (int)(6*Math.random()) gives a uniformly distributed random integer from the set {1, 2, 3, 4, 5, 6}.
 * 
 */
public class RandomDemo {

	public static void main(String[] args) {
		// These variables keep track of the number of times we roll 2,
		//  3, 4, and so on, up to 12
		int 	count2 = 0,
				count3 = 0,
				count4 = 0,
				count5 = 0,
				count6 = 0,
				count7 = 0,
				count8 = 0,
				count9 = 0,
				count10 = 0,
				count11 = 0,
				count12 = 0;
				
		for (int i = 0; i < 10000; i++) {
			// Roll the two dice, and add their results
			int d1 = (int)(6*Math.random()) + 1;
			int d2 = (int)(6*Math.random()) + 1;
			int sum = d1 + d2;

			// Increment the appropriate counter variable, depending on the result
			if (sum == 2) {
				count2++;
			} else if (sum == 3) {
				count3++;
			} else if (sum == 4) {
				count4++;
			} else if (sum == 5) {
				count5++;
			} else if (sum == 6) {
				count6++;
			} else if (sum == 7) {
				count7++;
			} else if (sum == 8) {
				count8++;
			} else if (sum == 9) {
				count9++;
			} else if (sum == 10) {
				count10++;
			} else if (sum == 11) {
				count11++;
			} else if (sum == 12) {
				count12++;
			}
		}

		System.out.println("Count of 2s: " + count2);
		System.out.println("Count of 3s: " + count3);
		System.out.println("Count of 4s: " + count4);
		System.out.println("Count of 5s: " + count5);
		System.out.println("Count of 6s: " + count6);
		System.out.println("Count of 7s: " + count7);
		System.out.println("Count of 8s: " + count8);
		System.out.println("Count of 9s: " + count9);
		System.out.println("Count of 10s: " + count10);
		System.out.println("Count of 11s: " + count11);
		System.out.println("Count of 12s: " + count12);
	}
}
