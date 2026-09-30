import java.util.ArrayList;
class ArrayListDemo {
       public static void main(String args[]) {

       ArrayList AL = new ArrayList();

       AL.add("C");
       AL.add("A");
       AL.add("E");
       AL.add("B");
       AL.add("D");
       AL.add("F");
       AL.add(1, "A2");
       System.out.println("Size of AL: " + AL.size()); 
       System.out.println("Contents of AL: " + AL); 

       AL.remove("F");
       AL.remove(2);
       System.out.println("Size of AL: " + AL.size()); 
       System.out.println("Contents of AL: " + AL); 

      }
}