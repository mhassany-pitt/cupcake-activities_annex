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
	}
}