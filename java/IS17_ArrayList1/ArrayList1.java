import java.util.ArrayList;

class USport { String school; String name;
  public USport (String s, String n) { school = s;  name = n; }
  public String toString() { return school + ":" + name; }
}

public class ArrayList1 {
 public static void main(String a[]) {
  ArrayList<USport> v = new ArrayList<USport>();
  v.add( new USport("LSU", "Tigers")  );
  v.add( new USport("Georgia", "Bulldogs") );
  v.add( new USport("Pitt", "Panthers")  );
  System.out.println( v ); 
  
  for( int i = v.size() - 1; i >= 0; i--) {
   USport us = v.get( i );
   System.out.print( us.school + " " );
  } 
  
  System.out.println();
  
  for(USport us: v )  
   System.out.print( us.school + " " );
   
  System.out.println();
  
  while ( v.size() > 0 ) {
   USport us = v.remove( 0 ); 
   System.out.print( us.name + " ");
  } 
  System.out.println();
 }
}