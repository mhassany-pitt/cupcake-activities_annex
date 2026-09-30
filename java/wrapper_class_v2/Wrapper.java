import java.util.ArrayList; 
public class Wrapper{ 
    public static void main(String argv[]){ 
    ArrayList<Integer> AL = new ArrayList<Integer>(); 
    AL.add(new Integer(1)); 
    AL.add(2); 
    for(int i=0; i < AL.size();i ++){ 
        int x = AL.get(i); 
        System.out.println(x); 
    } 
   } 
}