import calculator.Addition;
import calculator.Subtraction;

public class MainTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        int sum = Addition.add(num1, num2);
        int difference = Subtraction.subtract(num1, num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
