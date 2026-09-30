public class GradeScores {
    public static void main(String[] args) {
    
        int[] scores= {10,19,12,14,90,4,5,20,14,15};
        
        int max=scores[0];
        
        int min=scores[0];
 
        for (int i = 0; i < scores.length; i++) {

            if (scores[i]> max) {

               max=scores[i];

            }

        }
    
        for (int i = 0; i < scores.length; i++) {

            if (scores[i]< min)  {

                min=scores[i];

            }
        }
        
        System.out.println("Highest score is " + max+ "\nThe lowest score is:"+min);
    }

}