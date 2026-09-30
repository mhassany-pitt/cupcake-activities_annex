import java.awt.Rectangle;

public class CopyDemo
{
   public static void main(String[] args)
   {

      Rectangle box = new Rectangle(5, 10, 20, 30);
      Rectangle box2 = box;

      System.out.print("box: ");
      System.out.println(box);
      System.out.print("box2: ");
      System.out.println(box2);
      System.out.println("Mutating box2");
      box2.translate(15, 25);

      System.out.print("box: ");
      System.out.println(box);
      System.out.print("box2: ");
      System.out.println(box2);

      int luckyNumber = 13; 
      int luckyNumber2 = luckyNumber; 

      System.out.print("luckyNumber: ");
      System.out.println(luckyNumber);
      System.out.print("luckyNumber2: ");
      System.out.println(luckyNumber2);
      
      System.out.println("Changing luckyNumber2");
      luckyNumber2 = 12;

      System.out.print("luckyNumber: ");
      System.out.println(luckyNumber);
      System.out.print("luckyNumber2: ");
      System.out.println(luckyNumber2);
   }
}

