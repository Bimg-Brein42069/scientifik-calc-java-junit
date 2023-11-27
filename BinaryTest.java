import Proj.Operations;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTest {
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
    @Test
    public void testPerformBinaryOperation_Addition() {
        String input = "1.5\n2.5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = BinaryTest.performBinaryOperation(new Scanner(System.in), "Addition", Operations::add);

        assertEquals(4.0, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_Subtraction() {
        String input = "5.0\n3.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = BinaryTest.performBinaryOperation(new Scanner(System.in), "Subtraction", Operations::subtract);

        assertEquals(2.0, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_Multiplication() {
        String input = "2.0\n3.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = BinaryTest.performBinaryOperation(new Scanner(System.in), "Multiplication", Operations::multiply);

        assertEquals(6.0, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_Division() {
        String input = "10.0\n2.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = BinaryTest.performBinaryOperation(new Scanner(System.in), "Division", Operations::divide);

        assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_Power() {
        String input = "2.0\n3.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = BinaryTest.performBinaryOperation(new Scanner(System.in), "Power", Operations::power);

        assertEquals(8.0, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_Modulus() {
        String input = "10.0\n3.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = BinaryTest.performBinaryOperation(new Scanner(System.in), "Modulus", Operations::modulus);

        assertEquals(1.0, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_Minimum() {
        String input = "5.0\n3.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = BinaryTest.performBinaryOperation(new Scanner(System.in), "Minimum", Operations::minimum);

        assertEquals(3.0, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_Maximum() {
        String input = "5.0\n3.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = BinaryTest.performBinaryOperation(new Scanner(System.in), "Maximum", Operations::maximum);

        assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_Average() {
        String input = "2.0\n4.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = BinaryTest.performBinaryOperation(new Scanner(System.in), "Average", Operations::average);

        assertEquals(3.0, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_GeoAverage() {
        String input = "2.0\n8.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = BinaryTest.performBinaryOperation(new Scanner(System.in), "GeoAverage", Operations::geoaverage);

        assertEquals(4.0, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_HarmAverage() {
        String input = "2.0\n8.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = BinaryTest.performBinaryOperation(new Scanner(System.in), "HarmAverage", Operations::harmaverage);

        assertEquals(3.2, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_Percentage() {
        String input = "20.0\n50.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = BinaryTest.performBinaryOperation(new Scanner(System.in), "Percentage", Operations::percentage);

        assertEquals(40.0, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_Combination() {
        String input = "5.0\n2.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = BinaryTest.performBinaryOperation(new Scanner(System.in), "Combination", Operations::combination);

        assertEquals(10.0, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_Permutation() {
        String input = "5.0\n2.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = BinaryTest.performBinaryOperation(new Scanner(System.in), "Permutation", Operations::permutation);

        assertEquals(20.0, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_SumKofN() {
        String input = "2.0\n3.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = BinaryTest.performBinaryOperation(new Scanner(System.in), "Sum of kth power of n", Operations::sumkofn);

        assertEquals(9.0, result, 0.0001);
    }

    @Test
    public void testPerformBinaryOperation_LogCustomBase() {
        String input = "2.0\n8.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        double result = BinaryTest.performBinaryOperation(new Scanner(System.in), "Logarithm (Custom Base)", Operations::logCustomBase);

        assertEquals(3.0, result, 0.0001);
    }

}
