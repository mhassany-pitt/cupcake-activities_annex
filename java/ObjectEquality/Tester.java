public class Tester {
  public static void main(String[] args) {
      Integer i1 = new Integer(5);
      Integer i2 = i1;
      Integer i3 = new Integer(5);
      System.out.println(i1 == i2);
      System.out.println(i1 == i3);
      System.out.println(i1.equals(i3));      
  }
}