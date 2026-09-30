public class CounterDemo
{
    public static void main(String[] args)
    {
        Counter tally = new Counter();
        tally.click();
        tally.click();
        int result = tally.getValue(); 
        System.out.print("result: ");
        System.out.println(result);
    }
}

public class Counter
{
   private int value;

   public int getValue()
   {
      return value;
   }

   public void click() 
   {
      value = value + 1;
   }

   public void reset()
   {
      value = 0;
   }
}
}