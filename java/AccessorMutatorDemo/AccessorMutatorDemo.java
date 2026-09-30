import java.awt.Rectangle;

public class AccessorMutatorDemo
{
   public static void main(String[] args)
   {
      Rectangle box = new Rectangle(5, 10, 20, 30);
      System.out.print("box: ");
      System.out.println(box);

      double width = box.getWidth();
      System.out.print("width: ");
      System.out.println(width);

      System.out.print("box: ");
      System.out.println(box);

      box.translate(15, 25);
  
      System.out.print("box: ");
      System.out.println(box);
   }
}
}