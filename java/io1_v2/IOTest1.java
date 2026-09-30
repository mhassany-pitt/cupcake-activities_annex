import java.io.*;

public class IOTest1{
  public static void main(String[] args) throws IOException{
      InputStreamReader input = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.println("Enter text : ");
      
      String str = br.readLine();
      System.out.println("You entered String : ");
      System.out.println(str);
  }
}