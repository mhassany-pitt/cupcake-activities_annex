public class VariablePrintPrintln
{
   public static void main(String[] args)
   {
      int width = 10; 
      System.out.print("width: ");
      System.out.print(width);
      System.out.println();
      width = 20;
      System.out.print("width: ");
      System.out.println(width);

      int height = 20;
      width = height + 10; 
      System.out.print("width: ");
      System.out.println(width);
        System.out.println();
      width = width + 10; 
      System.out.print("width: ");
      System.out.println(width);      
   }
}
}