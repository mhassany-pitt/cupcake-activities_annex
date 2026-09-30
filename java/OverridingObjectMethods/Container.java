public class Container {
    public int capacity; 
    public Container(int capacity){
    	this.capacity = capacity;
    }
    public boolean equals(Object anObject) {		
    	Container container = (Container) anObject;
		return this.capacity == container.capacity;
	}
}

public class PaperBox extends Container {
    public PaperBox(int capacity){
        super(capacity);
    }
    public String toString() {
		return super.toString() + "[capacity=" + this.capacity + "]"; 
	}
    public boolean equals(Object anObject) {		
		return super.equals(anObject);
	}
}

public class Tester {
  public static void main(String args[]) {
    Container c1 = new PaperBox(2);
    Container c2 = new PaperBox(2);
    System.out.println(c1.equals(c2));
    System.out.println("c1: "+c1.toString());
    System.out.println("c2: "+c2.toString());
  }
}