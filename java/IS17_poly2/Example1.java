class Liquid {
     void swirl(boolean clockwise) {
         System.out.println("Swirling Liquid");
     }
}

class Coffee extends Liquid {
     void swirl(boolean clockwise) {
         System.out.println("Swirling Coffee");
     }
}

class Milk extends Liquid {
    void swirl(boolean clockwise) {
         System.out.println("Swirling Milk");
    }
}

class Cup {
       private Liquid innerLiquid;
       Cup(Liquid liq) {
            innerLiquid = liq;
            innerLiquid.swirl(false);
      }
}

public class Example1 {
     public static void main(String[] args) {
         Liquid liquid = new Liquid();
         Liquid coffee = new Coffee();
         Liquid milk = new Milk();

         Cup cup1 = new Cup(liquid);
         Cup cup2 = new Cup(coffee);
         Cup cup3 = new Cup(milk);
     }
}