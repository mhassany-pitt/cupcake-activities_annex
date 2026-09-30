public class Container {
	private int capacity; 
	
	public Container(int capacity){
		this.capacity = capacity;
	}
}

public class PaperBox extends Container {
	public PaperBox(int capacity){
		super(capacity);
	}
}

public class GallonPlasticBottle extends Container {
	public GallonPlasticBottle(){
		super(1);
	}
}