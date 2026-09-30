public class nestedLoopsGridOfStars {

	public static void main(String[] args) {
	
		System.out.println(" Grid of Stars");

		int height = 3, width = 5;
		
		for ( int row = 0 ; row < height ; row++ )
		{
			
		for ( int col = 0 ; col < width ; col++ )
	      {
	         System.out.print( "*" ) ;
	      }

	    System.out.println( "" ) ;
	}
  }

}