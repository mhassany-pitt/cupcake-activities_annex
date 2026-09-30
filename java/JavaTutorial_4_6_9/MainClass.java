 public class MainClass {
 
   public static void main(String[] arg) {
     int limit = 10;
     int sum = 0;
 
     for (int i = 1; i <= limit;) {
       sum += i++;
     }
     System.out.println(sum);
   }
 }