import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {

	    ArrayList < String > travelList = new ArrayList < String > ();

	    travelList.add("Switzerland");
	    travelList.add("Denmark");
	    travelList.add("India");
	    travelList.add("China");
	    travelList.add("Thailand");
	    travelList.add("Bhutan");

	    ArrayList < String > newTravelList = new ArrayList <  > ();

	    for (int i = 0; i < 5; i++) {
	        newTravelList.add(i, travelList.get(i));
	    }

	    newTravelList.remove("China");

	    newTravelList.remove(0);
	    System.out.print(newTravelList);

    }
}