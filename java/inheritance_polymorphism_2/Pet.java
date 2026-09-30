public class Pet {
    public void speak(){
        System.out.println("");
    }
}

public class Dog extends Pet {
    public void speak(){
        System.out.println("woof! woof!");
    }
}

public class Cat extends Pet{
    public void speak(){
        System.out.println("meow!");
    }
}

public class InheritanceAndPolymorphism2 {
    public static void main(String args[]){
        Pet[] myPets = new Pet[3];
        myPets[0] = new Dog();
        myPets[1] = new Cat();
        myPets[2] = new Dog();
        whoTheyAre(myPets);
    }
	
    public static void whoTheyAre(Pet[] pets){
        for(int i=0;i<pets.length;i++){
            pets[i].speak();
        }
    }
}