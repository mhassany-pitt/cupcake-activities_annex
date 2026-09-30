public class AverageSpeedInMarathon {
    public static void main(String[] args) {
        //Declare multiple constant variables
        // i.e 26 miles 285 yards
        final double MILES_PER_MARATHON = 26.21875;
        final int SEC_PER_HR = 3600;
        final int SEC_PER_MIN = 60;
        //Declare multiple variables to hold marathon run time.
        double runtimeHrs = 2.0;
        double runtimeMins = 8.0;
        double runtimeSecs = 44.0;
        //Calculate average miles per hour speed using the constant variables.
        double totalSecs = runtimeHrs*SEC_PER_HR + runtimeMins*SEC_PER_MIN + runtimeSecs;
        double aveMPH = MILES_PER_MARATHON/(totalSecs/SEC_PER_HR);
        //Print the value of aveMPH to console using format method.
        System.out.format("Average MPH was: %.2f mph\n", aveMPH);
    }
}