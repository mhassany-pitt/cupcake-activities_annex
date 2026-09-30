public class MainClass {
 
   public static void main(String[] arg) {
     int a = 2;
     if (a == 0) {
       System.out.println("in the block");
       if (a == 2) {
         System.out.println("a is 2");
       } else {
         System.out.println("a is not 2");
       }
     } else {
       System.out.println("a is not 0");
     }
   }
 }