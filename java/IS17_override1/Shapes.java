class Shape {
  void draw() {
    System.out.println(this + ".draw()");
  }
}

class Circle extends Shape {
  public String toString() {
    return "Circle";
  }
}

class Square extends Shape {
  public String toString() {
    return "Square";
  }
}

class Triangle extends Shape {
  public String toString() {
    return "Triangle";
  }
}

public class Shapes {

  public static void main(String[] args) {
    Object[] shapeList = { new Circle(), new Square(), new Triangle() };
    for (int i = 0; i < shapeList.length; i++)
      ((Shape) shapeList[i]).draw(); 

  }
} 