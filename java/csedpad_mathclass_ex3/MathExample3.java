public class MathExample3 {

    public static void main(String[] args) {

        double radius = 4;

        System.out.printf("Volume = %.02f\n" , (4*Math.pow(radius,3)*Math.PI)/3);

        System.out.printf("Surface area = %.02f\n" , (4*Math.PI*Math.pow(radius,2)));
    }
}