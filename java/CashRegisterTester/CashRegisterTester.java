public class CashRegisterTester
{
   public static void main(String[] args)
   {
      CashRegister register = new CashRegister();

      register.recordPurchase(29.50);
      register.recordPurchase(9.25);
      register.receivePayment(50);

      double change = register.giveChange();

      System.out.println(change);      
      System.out.println("Expected: 11.25");          
   }
}

public class CashRegister
{
   private double taxRate;
   private double purchase;
   private double taxablePurchase;
   private double payment;

   public CashRegister(double rate)
   {
      taxRate = rate;
      purchase = 0;
      payment = 0;
   }

   public void recordPurchase(double amount)
   {
      purchase = purchase + amount;
   }

   public void recordTaxablePurchase(double amount)
   {
      taxablePurchase = taxablePurchase + amount;
   }

   public void receivePayment(double amount)
   {
      payment = payment + amount;
   }

   public double getSalesTax()
   {
      return taxablePurchase * taxRate / 100;
   }

   public double giveChange()
   {   
      double change = payment - purchase ;
      purchase = 0;
      payment = 0;
      return change;
   }
}

