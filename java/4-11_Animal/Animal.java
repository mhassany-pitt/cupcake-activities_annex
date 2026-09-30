/*
 * This class represents an Animal.  A class consists of two main parts:
 *  - Instance variables describe characteristics or qualities
 *  - Methods describe behaviors
 *  
 *  Once a class is defined, we can create objects (a.k.a. instances) of that
 *  class.  Each object of a class has its own values for the instance
 *  variables, and all objects of a class have access to that class' methods.
 */

public class Animal {
	
	// Instance variables - these are typically declared as private, meaning
	//  that they cannot be accessed directly from outside of this class.
	private String species;
	private boolean hasScales;
	private int numLegs;
	
	// Setter methods - these allow us to set values for instance variables.
	public void setSpecies(String s) {
		species = s;
	}
	
	public void setHasScales(boolean b) {
		hasScales = b;
	}
	
	public void setNumLegs(int n) {
		numLegs = n;
	}
	
	// Getter methods - these allow us to get/retrieve values for instance variables.
	public String getSpecies() {
		return species;
	}
	
	public boolean getHasScales() {
		return hasScales;
	}
	
	public int getNumLegs() {
		return numLegs;
	}

	// Constructor - this is called when first creating an object of this class.
	//  Constructors are often used to set values for instance variables, as
	//  shown here.
	public Animal(String s, boolean hs, int n) {
		setSpecies(s);
		setHasScales(hs);
		setNumLegs(n);
	}

	// Some other methods that Animal objects can call
	public void move() {
		System.out.println("The " + species + " is moving!");
	}
	
	public void breathe() {
		System.out.println("The " + species + " is ensuring its continued existence.");
	}
	
	public void mate() {
		System.out.println("The " + species + " is ensuring its continued existence, but in a more fun way.");
	}
}