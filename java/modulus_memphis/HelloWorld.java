public class HelloWorld {
	public static void main(String[] args) {

		int cents = 93; 
		System.out.println(cents/25 + " quarter(s)");
		System.out.println(cents%25/10 + " dime(s)");
		System.out.println(cents%25%10/5 + " nickel(s)");	
		System.out.println(cents%25%10%5/1 + " penny/pennies");
	}
}