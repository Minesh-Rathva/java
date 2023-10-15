// Circle.java
public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // Create a Circle with a radius of 5.0
        Circle circle = new Circle(5.0);

        // Attempt to modify the radius (should result in a compilation error)
        // circle.radius = 10.0; // Uncommenting this line will result in an error

        // Calculate and display the area and perimeter
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
    }
}
