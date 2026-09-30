public class Main{

   public static void main(String args[]) {
      String str1 = "Hello World";
      String str2 = str1;
      String str3 = "Hello World";
      
      boolean isEqual;
      isEqual = str1.equals( str2 );
      System.out.println(isEqual);

      isEqual= str1.equals( str3 );
      System.out.println(isEqual);
   }
}