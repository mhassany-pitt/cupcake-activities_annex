interface Fruit {
   public boolean hasAPeel();          
}        


interface Vegetable {
   public boolean isARoot();        
}  


class FandVUtility {
   static String doesThisHaveAPeel(Fruit fruitIn){
        if (fruitIn.hasAPeel())
           return "This has a peel";
        else   
           return "This does not have a peel";
   }
   static String isThisARoot(Vegetable vegetableIn){
        if (vegetableIn.isARoot())
           return "This is a root";
        else   
           return "This is not a root";
   }   
   static String doesThisHaveAPeelOrIsThisRoot(Tomato tomatoIn){
        if (tomatoIn.hasAPeel() && tomatoIn.isARoot())
           return "This both has a peel and is a root";
        else if (tomatoIn.hasAPeel() || tomatoIn.isARoot())
           return "This either has a peel or is a root";
        else   
           return "This neither has a peel or is a root";        
   }
}

class Tomato implements Fruit, Vegetable { 

   boolean peel = false;
   boolean root = false;

   public Tomato() {}   

   public boolean hasAPeel(){ 
      return peel; 
   }    
   public boolean isARoot() { 
      return root; 
   }      


   public static void main(String[] args) {

      Tomato tomato = new Tomato();

      System.out.println(FandVUtility.isThisARoot(tomato));
      
      System.out.println(FandVUtility.doesThisHaveAPeel(tomato));
      
      System.out.println(FandVUtility.doesThisHaveAPeelOrIsThisRoot(tomato));

      Fruit tomatoFruit = new Tomato();   

      System.out.println(FandVUtility.doesThisHaveAPeel(tomatoFruit));

   }
}