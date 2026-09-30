public class SuperClass { 
    public void whoAmI(){
        System.out.println("I am an object of the super class");
    }
}

public class SubClass extends SuperClass{
    public void whoAmI(){
        System.out.println("I am an object of the sub class");
    }
}

public class InheritanceAndPolymorphism {
    public static void main(String[] args){
        SuperClass theObject = new SubClass(); 
        theObject.whoAmI();
    }
}