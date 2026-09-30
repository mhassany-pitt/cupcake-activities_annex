public class AddingNumbers {

    public int sum(int value1, int value2) {
        return value1 + value2; // returns the addition of the two given integer values.
    }

    public static void main(String[] args) {

        AddingNumbers addy = new AddingNumbers();
        
        int result = addy.sum(4, 9); 
        
        System.out.println(result); 
    }

}