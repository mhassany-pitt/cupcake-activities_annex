interface SimpleInterface{     
  public void sayHello();      
}    
  
public class JavaInterfaceExample implements SimpleInterface{    
     
  public void sayHello(){    
    System.out.println("Hello IS17!");    
  }    
      
  public static void main(String args[]){    
    JavaInterfaceExample javaInterfaceExample = new JavaInterfaceExample();    
  
    javaInterfaceExample.sayHello();    
  
  }    
}    