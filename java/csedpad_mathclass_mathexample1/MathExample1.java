public class MathExample1 {
  public static void main(String[] args) {
    //Declare double variables called a, b, and c to represent each side of the triangle and assign a to 6 and b to 8.
    double a = 6, b = 8, c;
    //Calculate the length of the hypotenuse (c) by using the Pythagoras theorem.
    c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    //Declare two double variables A and B and assign it the calculated value the angles of the right triangle.
    double A = Math.acos((b * b + c * c - a * a) / (2 * b * c));
    A = (A * 180) / Math.PI;
    double B = Math.acos((a * a + c * c - b * b) / (2 * a * c));
    B = (B * 180) / Math.PI;
    //Print the length of the hypotenuse (c) and the angles of A and B.
    System.out.println("The length of the hypotenuse (c) is: " + c);
    System.out.printf("Angles are A = %.02f, B = %.02f, C = 90\n", A, B);
  }
}