/*
 * AnimalClient contains a main method that creates some Animal objects
 * and calls methods using them.
 * 
 */
public class AnimalClient {

	public static void main(String[] args) {
		
		Animal bertha = new Animal("bantha", true, 4);
		
		// The lines below aren't needed, since the Animal constructor handles
		//  setting the instance variables
//		bertha.setSpecies("bantha");
//		bertha.setHasScales(true);
//		bertha.setNumLegs(4);

		// Verify that bertha's instance variables were set correctly
		System.out.println(bertha.getSpecies());
		System.out.println(bertha.getHasScales());
		System.out.println(bertha.getNumLegs());

		// Make bertha do stuff
		bertha.move();
		bertha.breathe();
		bertha.mate();

		// Some other Animal objects!
		Animal monstro = new Animal("whale", false, 0);
		monstro.move();
		
		Animal dannyDevito = new Animal("party animal", true, 2);
		dannyDevito.breathe();

		System.out.println(dannyDevito.getSpecies());
		System.out.println(dannyDevito.getHasScales());
		System.out.println(dannyDevito.getNumLegs());
	}
}
