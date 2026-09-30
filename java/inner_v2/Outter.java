public class Outter{		   
	  static int USD= 100;	  
	  public static void main(String[] av) {		  
		  class Inner {
			  public void printDollars() {
				  System.out.println("$"+USD);
			 }
		  }
	    Inner p = new Inner();
	    p.printDollars();
	  }
}