// by Deitel & Associates, Inc. and Pearson Education, Inc.
// Java How to Program, 7/e
// Fig. 5.1: WhileCounter.java
// Counter-controlled repetition with the while repetition statement.

public class WhileCounter 
{
   public static void main( String args[] ) 
   {      
      int counter = 1; 

      while ( counter <= 10 ) 
      {
         System.out.printf( "%d  ", counter );
         ++counter; 
      } 

      System.out.println();
   } 
} 