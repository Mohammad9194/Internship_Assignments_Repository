// Abstract class
abstract class Shape {
    // Abstract method (no body)
    abstract void draw();

    // Concrete method (has body)
    void showShapeType() {
        System.out.println("This is a shape.");
    }
}

// Subclass that extends the abstract class
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

// Subclass that extends the abstract class
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.showShapeType();
        circle.draw();

        Shape rectangle = new Rectangle();
        rectangle.showShapeType();
        rectangle.draw();
    }
}
