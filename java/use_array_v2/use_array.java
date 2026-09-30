public class use_array
{
       public static void main(String[] args)
       {
                  double[] data = new double[10];    
                  for (int i = 0; i < data.length; i++) { 
                        data[i] = i * i;  
                        System.out.println(data[i]);
                  }
       }
}