package InnerClass;
// write a java code to find maximum between to numnber using lambda expression
// write a java code to check the given ch is vowel or not using lambda expression
import java.util.function.BinaryOperator;

public class LambdaFun3 {
    public static void main(String[] args) {
        // Two numbers
        double num1 = 10.5;
        double num2 = 20.7;

        // Using a lambda expression to find the maximum
        BinaryOperator<Double> maxFinder = (a, b) -> Math.max(a, b);

        // Finding the maximum between num1 and num2
        double maximum = maxFinder.apply(num1, num2);

        System.out.println("Maximum between " + num1 + " and " + num2 + " is: " + maximum);
    }
}

