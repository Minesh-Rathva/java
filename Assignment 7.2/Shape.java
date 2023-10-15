// Shape.java
public class Shape {
    public final void draw() {
        System.out.println("Drawing a shape.");
    }
}

// Circle.java
public class Circle extends Shape {
    // Attempting to override the final method (results in a compilation error)
    // Uncommenting the following code will result in an error
    /*
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
    */
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();

        // Calling the draw() method on the Circle object
        circle.draw(); // Output: Drawing a shape.
    }
}
