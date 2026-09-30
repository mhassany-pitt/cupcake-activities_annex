public interface Measurable{
     double getMeasure(); 	
}

public class Coin implements Measurable{
	
   private double value;	
   private String name;
	
   public Coin(double aValue, String aName){
      value = aValue;	
      name = aName;	
   }
	
   public double getMeasure() {
      return value + 0.5;
  }

   public String getName(){
      return name;
   }	
}
    
public class DataSetTester{
   public static void main(String[] args){
      Measurable meas = new Coin(0.1,"dime");
      System.out.println( meas.getMeasure());
      Coin coin =  (Coin) meas.getMeasure();
      System.out.println(coin.getName());
  } 	
}