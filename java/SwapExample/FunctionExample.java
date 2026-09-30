public class FunctionExample{

	static double num1 = 5.1;
	static double num2 = 7.5;
	public static void main(String[] args){
		int x = 10; y = 20;
		swap(x,y);
		System.out.println("The value after calling" + "swap x=" + x + ", y=" + y);
		swap(num1,num2);
		System.out.println("The value after calling" + "swap num1=" + num1 + ", num2=" + num2);
 	}

	public static void swap(double a, double b){
		double c = num1;
		num1 = num2;
		num2 = c;
	}

	public static void swap(int a, int b){
		int c = a;
		a = b;
		b = c;
	}
}