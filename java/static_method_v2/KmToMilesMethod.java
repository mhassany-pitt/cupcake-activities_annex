public class KmToMilesMethod {
    public static void main(String[] args) {
        double km = 1.0;       
        double mi = 0.0;        
        mi = convertKmToMi(km); 
        System.out.println(mi);
    }
   
    private static double convertKmToMi(double kilometers) {
        double miles = kilometers * 0.621;
        return miles;
    }
}
}