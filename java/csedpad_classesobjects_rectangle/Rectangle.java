public class Rectangle {

    private float height;
    private float width;

    public Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public float calculateArea() {
        float area = this.height * this.width;
        return area;
    }


    public static void main(String[] args) {

        Rectangle myBox = new Rectangle(2, 5);

        float area = myBox.calculateArea();
        System.out.println("Area : " + area);
    }

}