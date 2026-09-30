public interface Measurable{
  double getMeasure();
}

public class BankAccount implements Measurable {
   private double balance;

   public BankAccount(double initialBalance){
      balance = initialBalance;
   }
   public double getMeasure(){
      return balance;
   }
}

public class DataSet{
   private double sum;
   private Measurable maximum;
   private int count;
   public DataSet(){
      sum = 0;
      count = 0;
      maximum = null;
   }
   public void add(Measurable x){
      sum = sum + x.getMeasure();
      if (count == 0 || maximum.getMeasure() < x.getMeasure())
         maximum = x;
      count++;
   }
   public Measurable getMaximum(){
      return maximum;
   }
}

public class DataSetTester{
   public static void main(String[] args){
      DataSet bankData = new DataSet();
      bankData.add(new BankAccount(0));
      bankData.add(new BankAccount(10000));
      bankData.add(new BankAccount(2000));
      Measurable max = bankData.getMaximum();
      System.out.println("Highest balance: " + max.getMeasure());
   }
}