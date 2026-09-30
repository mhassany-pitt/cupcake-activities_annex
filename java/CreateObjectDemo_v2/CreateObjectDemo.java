public class CreateObjectDemo {    
    public static void main(String[] args) {    

        Point myPoint = new Point(23, 94);    
        Rectangle rectOne = new Rectangle(myPoint , 100, 200);    
        Rectangle rectTwo = new Rectangle(myPoint , 50, 100);    
      
        System.out.println("Width of rectOne: " + rectOne.getWidth());    
        System.out.println("Height of rectOne: " + rectOne.getHeight());    
        System.out.println("Area of rectOne: " + rectOne.getArea());    
      
        rectTwo.move(10, 20);    
        System.out.println("X Position of rectTwo: " + rectTwo.getOrigin().getX());    
        System.out.println("Y Position of rectTwo: " + rectTwo.getOrigin().getY());    
    }    
}  