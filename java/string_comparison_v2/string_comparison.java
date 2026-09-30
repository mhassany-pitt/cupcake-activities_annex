public class string_comparison
{
       public static void main(String[] args)
       {
                  String s1 = "Hell"; 
                  String s2 = "Hello"; 
                  String s3 = "Hello IS17";
                  String s4 = "Hell";
              
                  if (s1.equals(s2)) 
                    System.out.println("these two are equal!");
              
                    System.out.println(s1.compareTo(s2));
                    System.out.println(s3.compareTo(s1));
                    System.out.println(s1.compareTo(s4));
       }
}