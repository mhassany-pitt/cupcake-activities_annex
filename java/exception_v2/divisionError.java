public class divisionError{
	public static void main(String args[]){
		int numerator = 5;
		int denominator = 0;
		try{	
		         System.out.println(numerator/denominator);
		}
        catch(Exception e){
                  System.out.println("Exception : "+ e.getMessage());
        }
		finally{
			if(denominator == 0){
    			System.out.println("denominator can not be zero!");
    		}
		}
	}
}