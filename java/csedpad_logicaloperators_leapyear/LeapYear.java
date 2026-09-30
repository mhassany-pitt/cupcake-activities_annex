public class LeapYear {
	public static void main(String[] args) {
		//initialise a variable to store the value of the year which is to be evaluated as a leap year or not a leap year
		int year = 2020;
		String leapYear;
		//use logical and conditional operators to check whether a year is leap year or not.
		leapYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)) ? "It's a leap Year": "Not a Leap year!";
		System.out.println(leapYear);
	}
}