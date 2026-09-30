import java.util.ArrayList;

public class GradeBook
{
   private ArrayList<Double> scores;

   public GradeBook()
   {
      scores = new ArrayList<Double>();
   }

   public void addScore(double score)
   {
      scores.add(score);
   }

   public double sum()
   {
      double total = 0;
      for (double element : scores)
      {
         total = total + element;
      }
      return total;
   }
      
   public double minimum()
   {
      if (scores.size() == 0) return 0;
      double smallest = scores.get(0);
      for (int i = 1; i < scores.size(); i++)
      {
         if (scores.get(i) < smallest)
         {
            smallest = scores.get(i);
         }
      }
      return smallest;
   }

    public double finalScore() 
   {
      if (scores.size() == 0)
         return 0;
      else if (scores.size() == 1)
         return scores.get(0);
      else
         return sum() - minimum();
   }
}
}