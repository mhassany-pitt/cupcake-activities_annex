public interface Measurable{
   double getMeasure();	
}
	
	
public class BankAccount implements Measurable {
	
   private double balance;
	
   public BankAccount(double initialBalance){
	
      balance = initialBalance;
	
   }
	
   public double getMeasure(){
	
      return balance+10;
	
   }
	
}

public class Coin implements Measurable
{
   private double value;
   private String name;

   public Coin(double aValue, String aName) 
   { 
      value = aValue; 
      name = aName;
   }


   public double getMeasure() 
   {
      return value + 0.5;
   }
}

	
public class DataSetTester{
	
   public static void main(String[] args){
      Measurable meas;
      meas = new BankAccount(2000);
      System.out.println( meas.getMeasure());
      meas = new Coin(0.1,"dime");
      System.out.println( meas.getMeasure());
	
   }
	
}