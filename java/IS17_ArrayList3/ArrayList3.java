import java.util.ArrayList;
public class ArrayList3 {
  public static void main(String args[]) {
    	ArrayList<String> names = new ArrayList<String>();

	names.add( new String( "Bob" ) );	
	names.add( new String( "Carol" ) );	
	names.add( 1, new String( "Ted" ) );		
	System.out.println( names.size( ) );	

	String theName = (String) names.get( 2 );	
	System.out.println("the name of this element is: " + theName);
	
	names.clear( );		
	System.out.println( names.size( ) );        
  }
}