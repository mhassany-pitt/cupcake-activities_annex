public class FindHighAndLowScores {

    public static void main(String[] args) {

        final int SCORES[] = { 41, 80, 47, 38, 59, 74, 56, 37, 85, 27, 49, 61, 25, 81, 95 };

        int low_score = 100;
        int high_score = 0;
        int i = 0;

        do {
            if (SCORES[i] < low_score) {
                low_score = SCORES[i];
            }
            if (SCORES[i] > high_score) {
                high_score = SCORES[i];
            }
            i++;

        } while (i < SCORES.length);

        System.out.println("");
        System.out.println("Low Score: " + low_score);
        System.out.println("High Score: " + high_score);
    }

}