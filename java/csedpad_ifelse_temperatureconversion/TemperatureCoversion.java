public class TemperatureCoversion
{
    public static void main( String[] args )
    {

        char scale='C';
        double temp=100;
        double tempConverted=0.0;

        System.out.printf("temperature : %.2f %s %c", temp," deg ",scale);

        if(scale=='C'){
            tempConverted = ( temp + 40.0 ) * ( 9.0/5.0 ) - 40.0;
            scale='F';
        }else if(scale=='F'){
            tempConverted = ( temp + 40.0 ) * ( 5.0/9.0 ) - 40.0;
            scale='C';

        }else{
            System.out.println("Now a valid temperature scale");
        }

        System.out.println();
        System.out.printf("temperature : %.2f %s %c", tempConverted," deg ",scale);
    }
}