import java.awt.Rectangle;

public class ConstructorDemo
{
   public static void main(String[] args)
   {
      System.out.println(new Rectangle(5, 10, 20, 30));

      Rectangle box = new Rectangle(5, 10, 20, 30);
      System.out.print("box: ");
      System.out.println(box);

      box = new Rectangle();
      System.out.print("box: ");
      System.out.println(box);
   }
}
}