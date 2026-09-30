public class VariableDemos {
	public static void main(String[] args) {
		int x = 4, y = 10; 
		System.out.println(x + ", " + y);
		x = y;
		System.out.println(x + ", " + y);
		y = 8;
		System.out.println(x + ", " + y);
		int temp = x;
		x = y;
		y = temp;
		// Some examples of casting
		// Refer to this ordering of data types: double > float > long > int > short > byte
		// If storing a *smaller* value into a *larger* variable, an implicit cast is automatically done
		// If storing a *larger* value into a *smaller* variable, an explicit cast is needed to make the code compile
		double z = 2;
		int z1 = (int)2.5;
		byte small = (byte)200;
	}
}