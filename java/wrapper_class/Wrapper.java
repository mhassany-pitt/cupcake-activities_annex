import java.util.*;
public class Wrapper{
    public static void main(String argv[]){
    ArrayList AL = new ArrayList();
    AL.add(new Integer(1));
    AL.add(new Integer(2));
    for(int i=0; i < AL.size();i ++){
        Integer iw =(Integer) AL.get(i);
        System.out.println(iw.intValue());
    }
   }
}