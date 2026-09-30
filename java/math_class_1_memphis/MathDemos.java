/*
 * Simple example of how to use Java's Math methods.
 * This program shows that the trig identity sin^2(x) + cos^2(x) = 1 is true
 *  for any value of x.
 */

public class MathDemos {
	public static void main(String[] args) {
		double theta = 0;
		
		double result = Math.sin(theta)*Math.sin(theta) + Math.pow(Math.cos(theta),  2);
		System.out.println(result);
	}
}