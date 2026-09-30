import java.util.ArrayList;
public class ArrayList2 {
  public static void main(String args[]) {
    ArrayList<Integer> values = new ArrayList<Integer>();

    values.add(1);
    values.add(2);
    values.add(3);
    values.add(4);
    values.add(5);
    values.remove(1);

    System.out.print("Contents of values: ");
    for (int v : values)
      System.out.print(v + " ");
    System.out.println();

    int sum = 0;
    for (int v : values)
      sum += v;

    System.out.println("Sum of values: " + sum);
    System.out.println("size of values: " + values.size());
  }
}