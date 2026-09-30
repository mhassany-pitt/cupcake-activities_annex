public class nested_loops2
{
       public static void main(String[] args)
       {
                       for ( int rowNumber = 1;  rowNumber <= 10;  rowNumber++ ) { 
                          for ( int N = 1;  N <= 10;  N++ ) { 
                                System.out.print( N * rowNumber + " ");   
                          } 
                          System.out.println(); 
                       }
       }
}