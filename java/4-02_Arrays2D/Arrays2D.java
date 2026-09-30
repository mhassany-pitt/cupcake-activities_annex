/*
 * Some examples of basic 2D array syntax.
 * 
 */
public class Arrays2D {

	// This method finds and returns the max element from the 2D array x.
	public static int findMax(int[][] x) {
		int max = x[0][0];
		
		// Go through the entire array, replacing max every time we see a higher element.
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max)
					max = x[i][j];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		// 2D array of 2 rows and 4 columns (default value is 0 since data type is int)
//		int[][] x = new int[2][4];
//		x[0][1] = 10;	// Change the value of row 0, col 1
		
		// Shorthand way of initializing a 2D array with known values
		int[][] x = { {7, 10, 9, 4}, {2, 3, 8, 6} };

		// How to iterate through all elements of a 2D array
		//  x.length = number of rows of x
		//  x[i].length = number of columns in row i of x
		//   (you could replace this with x[0].length, if you know that all
		//    rows have the same number of columns)
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(findMax(x));
	}

}