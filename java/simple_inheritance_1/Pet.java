public class Pet {
    public void speak(){
        System.out.println("speaking!");
    }
	public void jump(){
        System.out.println("jumping!");
    }
    public void walk(){
        System.out.println("walking!");	
    }
}

public class Dog extends Pet {

}

public class SimpleInheritance {
    public static void main(String args[]){
        Dog myDog = new Dog();
        myDog.speak();
        myDog.walk();
        myDog.jump();
    }
}