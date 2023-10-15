// Final class definition
final class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getDescription() {
        return "This is a " + name;
    }
}

// Attempted extension (results in a compilation error)
// Uncommenting the following code will result in an error
/*
class Circle extends Shape {
    public Circle(String name) {
        super(name);
    }
}
*/

// Main.java
public class Main {
    public static void main(String[] args) {
        // Attempting to create an instance of the "Circle" class
        // Circle circle = new Circle("Circle"); // Uncommenting this line will result in an error

        // An alternative solution to create objects of the "Circle" class
        String circleName = "Circle";
        Shape circle = new Shape(circleName);
        System.out.println(circle.getDescription());
    }
}
