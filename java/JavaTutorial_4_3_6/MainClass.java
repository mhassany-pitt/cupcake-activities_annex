 public class MainClass {
   enum MyType { choice1, choice2, choice3 }
   public static void main(String[] args) {
     MyType ch = MyType.choice1;
     switch(ch) {
       case choice1:
         System.out.println("Choice1 selected");
         break;
      case choice2:
        System.out.println("Choice2 selected");
        break;
      case choice3:
        System.out.println("Choice3 selected");
        break;
     }
   }
 }