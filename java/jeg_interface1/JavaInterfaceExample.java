interface SimpleInterface1{ 
  public void sayHello();  
}

public class JavaInterfaceExample implements SimpleInterface1{
 
  public void sayHello(){
    System.out.println("Hello IS17!");
  }
  
  public static void main(String args[]){
    JavaInterfaceExample javaInterfaceExample = new JavaInterfaceExample();

    javaInterfaceExample.sayHello();

  }
}