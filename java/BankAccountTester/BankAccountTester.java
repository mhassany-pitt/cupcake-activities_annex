public class BankAccountTester
{
   public static void main(String[] args)
   {
      BankAccount harrysChecking = new BankAccount();
      harrysChecking.deposit(2000);
      harrysChecking.withdraw(500);
      System.out.println(harrysChecking.getBalance());
      System.out.println("Expected: 1500");      
   }
}

public class BankAccount
{  
   private double balance;

   public BankAccount()
   {   
      balance = 0;
   }

   public BankAccount(double initialBalance)
   {   
      balance = initialBalance;
   }

   public void deposit(double amount)
   {  
      balance = balance + amount;
   }

   public void withdraw(double amount)
   {   
      balance = balance - amount;
   }

   public double getBalance()
   {   
      return balance;
   }
}
}