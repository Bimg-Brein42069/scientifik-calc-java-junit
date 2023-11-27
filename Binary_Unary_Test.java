import Proj.Operations;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Binary_Unary_Test {
    public static double performBinaryOperation(Scanner scanner, String operationName, BinaryOperation operation) {
        System.out.print("Enter first number: ");
        //def num1
        double num1;
        num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        //def num2
        double num2 = scanner.nextDouble();
        double res = operation.apply(num1, num2);
        //use res
        if(Double.isInfinite(res))
            System.out.println("Value out of range!!");
        else if(!Double.isNaN(res))
            System.out.println("Result: " + res);
        System.out.println();

        return res;
    }
    @FunctionalInterface
    interface BinaryOperation {
        double apply(double num1, double num2);
    }
    @FunctionalInterface
    interface UnaryOperation {
        double apply(double num);
    }
    public static double performUnaryOperation(Scanner scanner, String operationName, UnaryOperation operation) {
        System.out.print("Enter a number: ");
        //def num
        double num = scanner.nextDouble();
        double res = operation.apply(num);
        //use res
        if(Double.isInfinite(res))
            System.out.println("Value out of range!!");
        else if(!Double.isNaN(res))
            System.out.println("Result: " + res);
        System.out.println();
        return res;
    }
    @Test
    public void testPerformBinaryOperation_Addition() {
        String input = "1.5\n2.5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performBinaryOperation(new Scanner(System.in), "Addition", Operations::add);

        assertEquals(4.0, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_Subtraction() {
        String input = "5.0\n3.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performBinaryOperation(new Scanner(System.in), "Subtraction", Operations::subtract);

        assertEquals(2.0, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_Multiplication() {
        String input = "2.0\n3.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performBinaryOperation(new Scanner(System.in), "Multiplication", Operations::multiply);

        assertEquals(6.0, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_Division() {
        String input = "10.0\n2.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performBinaryOperation(new Scanner(System.in), "Division", Operations::divide);

        assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_Power() {
        String input = "2.0\n3.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performBinaryOperation(new Scanner(System.in), "Power", Operations::power);

        assertEquals(8.0, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_Modulus() {
        String input = "10.0\n3.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performBinaryOperation(new Scanner(System.in), "Modulus", Operations::modulus);

        assertEquals(1.0, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_Minimum() {
        String input = "5.0\n3.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performBinaryOperation(new Scanner(System.in), "Minimum", Operations::minimum);

        assertEquals(3.0, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_Maximum() {
        String input = "5.0\n3.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performBinaryOperation(new Scanner(System.in), "Maximum", Operations::maximum);

        assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_Average() {
        String input = "2.0\n4.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performBinaryOperation(new Scanner(System.in), "Average", Operations::average);

        assertEquals(3.0, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_GeoAverage() {
        String input = "2.0\n8.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performBinaryOperation(new Scanner(System.in), "GeoAverage", Operations::geoaverage);

        assertEquals(4.0, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_HarmAverage() {
        String input = "2.0\n8.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performBinaryOperation(new Scanner(System.in), "HarmAverage", Operations::harmaverage);

        assertEquals(3.2, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_Percentage() {
        String input = "20.0\n50.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performBinaryOperation(new Scanner(System.in), "Percentage", Operations::percentage);

        assertEquals(40.0, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_Combination() {
        String input = "5.0\n2.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performBinaryOperation(new Scanner(System.in), "Combination", Operations::combination);

        assertEquals(10.0, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_Permutation() {
        String input = "5.0\n2.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performBinaryOperation(new Scanner(System.in), "Permutation", Operations::permutation);

        assertEquals(20.0, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_SumKofN() {
        String input = "2.0\n3.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performBinaryOperation(new Scanner(System.in), "Sum of kth power of n", Operations::sumkofn);

        assertEquals(9.0, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_LogCustomBase() {
        String input = "2.0\n8.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performBinaryOperation(new Scanner(System.in), "Logarithm (Custom Base)", Operations::logCustomBase);

        assertEquals(3.0, result, 0.0001);
    }
    @Test
    public void testPerformUnaryOperation_SquareRoot() {
        String input = "25.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performUnaryOperation(new Scanner(System.in), "Square Root", Operations::sqrt);

        assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void testPerformUnaryOperation_Log10() {
        String input = "100.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performUnaryOperation(new Scanner(System.in), "Logarithm (Base 10)", Operations::log10);

        assertEquals(2.0, result, 0.0001);
    }

    @Test
    public void testPerformUnaryOperation_Log() {
        String input = "2.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performUnaryOperation(new Scanner(System.in), "Natural Logarithm", Operations::log);

        assertEquals(0.6931, result, 0.0001);
    }

    @Test
    public void testPerformUnaryOperation_Log2() {
        String input = "8.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performUnaryOperation(new Scanner(System.in), "Logarithm (Base 2)", Operations::log2);

        assertEquals(3.0, result, 0.0001);
    }

    @Test
    public void testPerformUnaryOperation_Abs() {
        String input = "-7.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performUnaryOperation(new Scanner(System.in), "Absolute Value", Operations::abs);

        assertEquals(7.0, result, 0.0001);
    }

    @Test
    public void testPerformUnaryOperation_Ceil() {
        String input = "7.4\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performUnaryOperation(new Scanner(System.in), "Ceiling", Operations::ceil);

        assertEquals(8.0, result, 0.0001);
    }

    @Test
    public void testPerformUnaryOperation_Floor() {
        String input = "7.6\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performUnaryOperation(new Scanner(System.in), "Floor", Operations::floor);

        assertEquals(7.0, result, 0.0001);
    }

    @Test
    public void testPerformUnaryOperation_Round() {
        String input = "7.5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performUnaryOperation(new Scanner(System.in), "Round", Operations::round);

        assertEquals(8.0, result, 0.0001);
    }

    @Test
    public void testPerformUnaryOperation_LogCustomBase() {
        String input = "2.0\n8.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performBinaryOperation(new Scanner(System.in), "Logarithm (Custom Base)", Operations::logCustomBase);

        assertEquals(3.0, result, 0.0001);
    }

    @Test
    public void testPerformUnaryOperation_Factorial() {
        String input = "5.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performUnaryOperation(new Scanner(System.in), "Factorial", Operations::factorial);

        assertEquals(120.0, result, 0.0001);
    }

    @Test
    public void testPerformUnaryOperation_Exp() {
        String input = "2.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performUnaryOperation(new Scanner(System.in), "Exponential", Operations::exp);

        assertEquals(7.389, result, 0.001);
    }

    @Test
    public void testPerformUnaryOperation_Inverse() {
        String input = "5.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performUnaryOperation(new Scanner(System.in), "Inverse", Operations::inverse);

        assertEquals(0.2, result, 0.0001);
    }

    @Test
    public void testPerformUnaryOperation_Sinh() {
        String input = "1.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performUnaryOperation(new Scanner(System.in), "Hyperbolic Sine", Operations::sinh);

        assertEquals(1.175201, result, 0.0001);
    }

    @Test
    public void testPerformUnaryOperation_Cosh() {
        String input = "1.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performUnaryOperation(new Scanner(System.in), "Hyperbolic Cosine", Operations::cosh);

        assertEquals(1.543081, result, 0.0001);
    }

    @Test
    public void testPerformUnaryOperation_Tanh() {
        String input = "1.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performUnaryOperation(new Scanner(System.in), "Hyperbolic Tangent", Operations::tanh);

        assertEquals(0.761594, result, 0.0001);
    }

    @Test
    public void testPerformUnaryOperation_DegreesToRadians() {
        String input = "180.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performUnaryOperation(new Scanner(System.in), "Degrees to Radians", Operations::degreesToRadians);

        assertEquals(3.14159, result, 0.0001);
    }

    @Test
    public void testPerformUnaryOperation_RadiansToDegrees() {
        String input = "3.14159\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performUnaryOperation(new Scanner(System.in), "Radians to Degrees", Operations::radiansToDegrees);

        assertEquals(180, result, 0.001);
    }

    @Test
    public void testPerformUnaryOperation_AbsPower() {
        String input = "2.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = Binary_Unary_Test.performUnaryOperation(new Scanner(System.in), "Absolute Power", Operations::absPower);

        assertEquals(4.0, result, 0.0001);
    }

}
