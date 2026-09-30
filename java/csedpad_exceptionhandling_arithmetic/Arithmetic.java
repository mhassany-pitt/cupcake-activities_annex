public class Arithmetic {
  public static void main(String[] args) {

    int x = 5;
    int y = 0;

    try {

      int z = x / y;

      System.out.println("Result = " + z);
    }

    catch (ArithmeticException e) {

      System.out.println("Arithmetic Exception Error. Can't divide a number by 0");
    }
  }

}