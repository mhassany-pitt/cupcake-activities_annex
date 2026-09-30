public class Test {

   public static void main(String args[]) {
      String str1 = new String("HELLO WORLD");
      String str2 = new String("hello world");
      boolean isEqual;

      isEqual = str1.equals( str2 );
      System.out.println(isEqual);

      isEqual = str1.equalsIgnoreCase( Str2 );
      System.out.println(isEqual);
     
   }
}