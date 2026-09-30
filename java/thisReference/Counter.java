public class Counter
{
   private int value; 

   public Counter(int value) 
   {
      this.value = value;
   }

   public Counter()
   {
      this(0);
   }

   public void click() 
   {
      this.value = this.value + 1;
   }

   public int getPrevious() 
   {
      return getValue() - 1;
   }

   public int getValue()
   {
      return value;
   }
}
}