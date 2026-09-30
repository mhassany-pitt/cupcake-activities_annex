import java.util.Scanner;

public class ConvertDressSizeNumberToName {

     public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter a US dress size (2, 4, 6, 8, 10, or 12): ");
        int size = scan.nextInt();
        scan.close();
    
        String output = "Size: ";

        switch (size) {
	        case 2:
	        case 4:
	            output += "XS";
	            break;
	        case 6:
	            output += "S";
	            break;
	        case 8:
	            output += "M";
	            break;
	        case 10:
	            output += "L";
	            break;
	        case 12:
	            output += "XL";
	            break;

	        default:
	            output = "Error: " + size + " is not a valid US dress size";
	            break;
        }

        System.out.println("\n" + output);
    }
    
}