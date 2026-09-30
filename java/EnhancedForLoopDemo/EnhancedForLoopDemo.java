public class EnhancedForLoopDemo
{
   public static void main(String[] args)
   {
      int[] values = new int[10];

       for (int i = 0; i < values.length; i++)
      {
         values[i] = i * i;
      }

      int total = 0;
      for (int element : values)
      {
         System.out.println(element);
         total = total + element;
      }

      System.out.println("Sum: " + total);
   }
}
}