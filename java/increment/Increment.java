// by Deitel & Associates, Inc. and Pearson Education, Inc.
// Java How to Program, 7/e
// Fig. 4.16: Increment.java
// Prefix increment and postfix increment operators.

public class Increment 
{
   public static void main( String args[] )
   {
      int c;
   
      // demonstrate postfix increment operator
      c = 5; 
      System.out.println( c );  
      System.out.println( c++ ); 
      System.out.println( c );   

      System.out.println(); 

      // demonstrate prefix increment operator
      c = 5; 
      System.out.println( c );  
      System.out.println( ++c ); 
      System.out.println( c );  

   } 

} 