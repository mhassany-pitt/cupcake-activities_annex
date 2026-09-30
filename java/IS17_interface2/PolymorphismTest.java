interface Shape {
	public double area();
	public double volume();
}

class Cube implements Shape {
	int width = 2;
	int length = 3;
	int height = 10;	
	public double area( ) {	
	    return (width * length);	
	}	

	public double volume() {
		return (width * length * height);
	}
	
}

class Circle implements Shape {
	int radius = 10;
	public double area() {
		return (Math.PI * radius * radius);
	}
	public double volume() {
		return 0;
	}
}

public class PolymorphismTest {
	public static void main(String args[]) {
		Shape[] s = { new Cube(), new Circle() };
		for (int i = 0; i < s.length; i++) {
			System.out.println("The area and volume of " + s[i].getClass() " is " + s[i].area() + " , " + s[i].volume());
		}
	}
}