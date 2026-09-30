public class Main
{
       public static void main(String[] args)
       {
             String replaceSample = "replacing one char from String";
             String newString = replaceSample.replace('r', 't');
             System.out.println(newString );
             replaceSample = "replacing Character Sequence";
             newString = replaceSample.replace("re", "RE");
             System.out.println(newString );
       }
}