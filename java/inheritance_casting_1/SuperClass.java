public class SuperClass{
    public void whoAmI(){
        System.out.println("I am an object of the super class");
    }
}

public class SubClass extends SuperClass{
    public void whoAmI(){
        System.out.println("I am an object of the sub class");
    }
}

public class CastingClassesTester {
    public static void main(String args[]){
        SuperClass aSuperObject = new SuperClass();
        SubClass aSubObject = new SubClass();
        aSuperObject.whoAmI();
        ((SuperClass)aSubObject).whoAmI();
        ((SubClass)aSuperObject).whoAmI();
    }
}