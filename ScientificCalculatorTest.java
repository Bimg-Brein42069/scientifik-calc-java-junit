package org.example;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class ScientificCalculatorTest {
    String str;
    double res;
    ScientificCalculatorTest(String x){
        str=x;
        res=0.0;
    }
    public double run() {
        ByteArrayInputStream in=new ByteArrayInputStream(str.getBytes());
        Scanner scanner = new Scanner(in);
        //def angmode
        int angmode = 0;
        int choice = 0;
        while(true) {
            //displayWelcome();
            int mode = scanner.nextInt();
            switch(mode){
                case 1:
                    //displayWelcomeStd();
                    while(choice != 5){
                        //displayMenuStd();
                        choice = scanner.nextInt();
                        switch(choice){
                            case 1:
                                res = performBinaryOperation(scanner, "Addition", Operations::add);
                                break;
                            case 2:
                                res = performBinaryOperation(scanner, "Subtraction", Operations::subtract);
                                break;
                            case 3:
                                res= performBinaryOperation(scanner, "Multiplication", Operations::multiply);
                                break;
                            case 4:
                                res= performBinaryOperation(scanner, "Division", Operations::divide);
                                break;
                            case 5:
                                //System.out.println("Exiting standard calculator.");
                                break;
                            default:
                                //System.out.println("Please enter a number between 1 and 5");
                                break;
                        }
                    }
                    break;
                case 2:
                    //displayWelcomeScientific();
                    while (choice != 54) {
                        //displayMenuScientific();

                        choice = scanner.nextInt();

                        switch (choice) {
                            case 1:
                                res = performBinaryOperation(scanner, "Addition", Operations::add);
                                break;
                            case 2:
                                res = performBinaryOperation(scanner, "Subtraction", Operations::subtract);
                                break;
                            case 3:
                                res = performBinaryOperation(scanner, "Multiplication", Operations::multiply);
                                break;
                            case 4:
                                res = performBinaryOperation(scanner, "Division", Operations::divide);
                                break;
                            case 5:
                                res=performUnaryOperation(scanner, "Square Root", Operations::sqrt);
                                break;
                            case 6:
                                res = performBinaryOperation(scanner, "Power", Operations::power);
                                break;
                            case 7:
                                res=performTrigonometricOperation(scanner, 'a', angmode);
                                break;
                            case 8:
                                res=performTrigonometricOperation(scanner, 'b', angmode);
                                break;
                            case 9:
                                res=performTrigonometricOperation(scanner, 'c', angmode);
                                break;
                            case 10:
                                res=performTrigonometricOperation(scanner, 'd', angmode);
                                break;
                            case 11:
                                res=performTrigonometricOperation(scanner, 'e', angmode);
                                break;
                            case 12:
                                res=performTrigonometricOperation(scanner, 'f', angmode);
                                break;
                            case 13:
                                res=performUnaryOperation(scanner, "Logarithm (Base 10)", Operations::log10);
                                break;
                            case 14:
                                res=performUnaryOperation(scanner, "Natural Logarithm", Operations::log);
                                break;
                            case 15:
                                res=performUnaryOperation(scanner, "Logarithm (Base 2)", Operations::log2);
                                break;
                            case 16:
                                res=performUnaryOperation(scanner, "Absolute Value", Operations::abs);
                                break;
                            case 17:
                                res=performUnaryOperation(scanner, "Ceiling", Operations::ceil);
                                break;
                            case 18:
                                res=performUnaryOperation(scanner, "Floor", Operations::floor);
                                break;
                            case 19:
                                res=performUnaryOperation(scanner, "Round", Operations::round);
                                break;
                            case 20:
                                res = performBinaryOperation(scanner, "Logarithm (Custom Base)", Operations::logCustomBase);
                                break;
                            case 21:
                                res=performUnaryOperation(scanner, "Factorial", Operations::factorial);
                                break;
                            case 22:
                                res=performUnaryOperation(scanner, "Exponential", Operations::exp);
                                break;
                            case 23:
                                //System.out.println("Angle Mode Changed");
                                //def angmode
                                angmode = ~angmode;
                                break;
                            case 24:
                                res=performUnaryOperation(scanner, "Degrees to Radians", Operations::degreesToRadians);
                                break;
                            case 25:
                                res=performUnaryOperation(scanner, "Radians to Degrees", Operations::radiansToDegrees);
                                break;
                            case 26:
                                res=performTernaryOperation(scanner, "(a+b)^c", Operations::powerOfSum);
                                break;
                            case 27:
                                res=performTernaryOperation(scanner, "(a-b)^c", Operations::powerOfDiff);
                                break;
                            case 28:
                                res=performUnaryOperation(scanner, "Absolute Power", Operations::absPower);
                                break;
                            case 29:
                                res = performBinaryOperation(scanner, "Modulus", Operations::modulus);
                                break;
                            case 30:
                                res=performUnaryOperation(scanner, "Square", Operations::square);
                                break;
                            case 31:
                                res=performUnaryOperation(scanner, "Cube", Operations::cube);
                                break;
                            case 32:
                                res = performBinaryOperation(scanner, "Minimum", Operations::minimum);
                                break;
                            case 33:
                                res = performBinaryOperation(scanner, "Maximum", Operations::maximum);
                                break;
                            case 34:
                                res = performBinaryOperation(scanner, "Average", Operations::average);
                                break;
                            case 35:
                                res = performBinaryOperation(scanner, "Average", Operations::geoaverage);
                                break;
                            case 36:
                                res = performBinaryOperation(scanner, "Average", Operations::harmaverage);
                                break;
                            case 37:
                                res=performUnaryOperation(scanner, "Inverse", Operations::inverse);
                                break;
                            case 38:
                                res = performBinaryOperation(scanner, "Percentage", Operations::percentage);
                                break;
                            case 39:
                                res=performUnaryOperation(scanner, "Round Up", Operations::roundUp);
                                break;
                            case 40:
                                res=performUnaryOperation(scanner, "Round Down", Operations::roundDown);
                                break;
                            case 41:
                                res=performUnaryOperation(scanner, "Hyperbolic Sine", Operations::sinh);
                                break;
                            case 42:
                                res=performUnaryOperation(scanner, "Hyperbolic Cosine", Operations::cosh);
                                break;
                            case 43:
                                res=performUnaryOperation(scanner, "Hyperbolic Tangent", Operations::tanh);
                                break;
                            case 44:
                                res=performInvTrigonometricOperation(scanner, 'a', angmode);
                                break;
                            case 45:
                                res=performInvTrigonometricOperation(scanner, 'b', angmode);
                                break;
                            case 46:
                                res=performInvTrigonometricOperation(scanner, 'c', angmode);
                                break;
                            case 47:
                                res = performBinaryOperation(scanner, "Permutation", Operations::permutation);
                                break;
                            case 48:
                                res = performBinaryOperation(scanner, "Combination", Operations::combination);
                                break;
                            case 49:
                                res=performUnaryOperation(scanner,"Sum of n",Operations::sumofn);
                                break;
                            case 50:
                                res=performUnaryOperation(scanner,"Sum of squares n",Operations::sum2ofn);
                                break;
                            case 51:
                                res=performUnaryOperation(scanner,"Sum of cubes n",Operations::sum3ofn);
                                break;
                            case 52:
                                res = performBinaryOperation(scanner,"Sum of kth power of n",Operations::sumkofn);
                                break;
                            case 53:
                                res=performUnaryOperation(scanner,"nth Harmonic number",Operations::harmnum);
                                break;
                            case 54:
                                //System.out.println("Exiting scientific calculator.");
                                break;
                            default:
                                //System.out.println("Invalid choice. Please enter a number between 1 and 54.");
                        }
                    }
                    break;
                case 3:
                    //System.out.println("Exiting. Thank you for using Calculator Program");
                    return res;
            }
        }
    }

    public static double performBinaryOperation(Scanner scanner, String operationName, BinaryOperation operation) {
        //System.out.print("Enter first number: ");
        //def num1
        double num1 = scanner.nextDouble();
        //System.out.print("Enter second number: ");
        //def num2
        double num2 = scanner.nextDouble();
        double res = operation.apply(num1, num2);
        //use res
        /*if(Double.isInfinite(res))
            System.out.println("Value out of range!!");
        else if(!Double.isNaN(res))
            System.out.println("Result: " + res);
        System.out.println();*/
        return res;
    }

    public static double performUnaryOperation(Scanner scanner, String operationName, UnaryOperation operation) {
        //System.out.print("Enter a number: ");
        //def num
        double num = scanner.nextDouble();
        double res = operation.apply(num);
        //use res
        /*if(Double.isInfinite(res))
            System.out.println("Value out of range!!");
        else if(!Double.isNaN(res))
            System.out.println("Result: " + res);
        System.out.println();*/
        return res;
    }

    public double performTrigonometricOperation(Scanner scanner,char trigop,int angmode) {
        //use angmode
        if(angmode == 0);
            //System.out.print("Enter angle in degrees.");
        else {
            //System.out.print("Enter angle in radians.");
            trigop += 6;
        }
        switch (trigop) {
            case 'a':
                return res=performUnaryOperation(scanner, "Sine", Operations::sin);
            case 'b':
                return res=performUnaryOperation(scanner, "Cosine", Operations::cos);
            case 'c':
                return res=performUnaryOperation(scanner, "Tangent", Operations::tan);
            case 'd':
                return res=performUnaryOperation(scanner, "Secant", Operations::sec);
            case 'e':
                return res=performUnaryOperation(scanner, "Co-secant", Operations::cosec);
            case 'f':
                return res=performUnaryOperation(scanner, "Co-tangent", Operations::cot);
            case 'g':
                return res=performUnaryOperation(scanner, "Sine-Rad", Operations::sinrad);
            case 'h':
                return res=performUnaryOperation(scanner, "Cosine-Rad", Operations::cosrad);
            case 'i':
                return res=performUnaryOperation(scanner, "Tangent-Rad", Operations::tanrad);
            case 'j':
                return res=performUnaryOperation(scanner, "Secant-Rad", Operations::secrad);
            case 'k':
                return res=performUnaryOperation(scanner, "Co-secant-Rad", Operations::cosecrad);
            case 'l':
                return res=performUnaryOperation(scanner, "Co-tangent-Rad", Operations::cotrad);
            default:
                //System.out.println("Invalid choice for trigonometric function");
        }
        return Double.NaN;
        //System.out.println();
    }

    public double performInvTrigonometricOperation(Scanner scanner,char trigop,int angmode) {
        //use angmode
        if(angmode == 0);
            //System.out.println("Results in degrees");
        else {
            //System.out.println("Results in radians");
            trigop += 3;
        }
        switch (trigop) {
            case 'a':
                return res=performUnaryOperation(scanner, "Arc Sine", Operations::arcsin);
            case 'b':
                return res=performUnaryOperation(scanner, "Arc Cosine", Operations::arccos);
            case 'c':
                return res=performUnaryOperation(scanner, "Arc Tangent", Operations::arctan);
            case 'd':
                return res=performUnaryOperation(scanner, "Arc Sine-Rad", Operations::arcsinrad);
            case 'e':
                return res=performUnaryOperation(scanner, "Arc Cosine-Rad", Operations::arccosrad);
            case 'f':
                return res=performUnaryOperation(scanner, "Arc Tangent-Rad", Operations::arctanrad);
            default:
                //System.out.println("Invalid choice for trigonometric function");
        }
        //System.out.println();
        return Double.NaN;
    }

    public static double performTernaryOperation(Scanner scanner, String operationName, TernaryOperation operation) {
        //System.out.print("Enter first number (a): ");
        //def numa
        double numA = scanner.nextDouble();
        //System.out.print("Enter second number (b): ");
        //def numb
        double numB = scanner.nextDouble();
        //System.out.print("Enter third number (c): ");
        //def numc
        double numC = scanner.nextDouble();
        double res=operation.apply(numA, numB, numC);
        //use res
        /*if(Double.isInfinite(res))
            System.out.println("Value out of range!!");
        else if(!Double.isNaN(res))
            System.out.println("Result: " + res);
        System.out.println();*/
        return res;
    }


    // Functional interfaces for binary and unary operations
    @FunctionalInterface
    interface BinaryOperation {
        double apply(double num1, double num2);
    }

    @FunctionalInterface
    interface UnaryOperation {
        double apply(double num);
    }

    @FunctionalInterface
    interface TernaryOperation {
        double apply(double a, double b, double c);
    }
    /*public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //def angmode
        int angmode = 0;
        int choice = 0;
        while(true) {
            displayWelcome();
            int mode = scanner.nextInt();
            switch(mode){
                case 1:
                    displayWelcomeStd();
                    while(choice != 5){
                        displayMenuStd();
                        choice = scanner.nextInt();
                        switch(choice){
                            case 1:
                                res = performBinaryOperation(scanner, "Addition", Operations::add);
                                break;
                            case 2:
                                res = performBinaryOperation(scanner, "Subtraction", Operations::subtract);
                                break;
                            case 3:
                                res = performBinaryOperation(scanner, "Multiplication", Operations::multiply);
                                break;
                            case 4:
                                res = performBinaryOperation(scanner, "Division", Operations::divide);
                                break;
                            case 5:
                                System.out.println("Exiting standard calculator.");
                                break;
                            default:
                                System.out.println("Please enter a number between 1 and 5");
                                break;
                        }
                    }
                    break;
                case 2:
                    displayWelcomeScientific();
                    while (choice != 54) {
                        displayMenuScientific();

                        choice = scanner.nextInt();

                        switch (choice) {
                            case 1:
                                res = performBinaryOperation(scanner, "Addition", Operations::add);
                                break;
                            case 2:
                                res = performBinaryOperation(scanner, "Subtraction", Operations::subtract);
                                break;
                            case 3:
                                res = performBinaryOperation(scanner, "Multiplication", Operations::multiply);
                                break;
                            case 4:
                                res = performBinaryOperation(scanner, "Division", Operations::divide);
                                break;
                            case 5:
                                res=performUnaryOperation(scanner, "Square Root", Operations::sqrt);
                                break;
                            case 6:
                                res = performBinaryOperation(scanner, "Power", Operations::power);
                                break;
                            case 7:
                                res=performTrigonometricOperation(scanner, 'a', angmode);
                                break;
                            case 8:
                                res=performTrigonometricOperation(scanner, 'b', angmode);
                                break;
                            case 9:
                                res=performTrigonometricOperation(scanner, 'c', angmode);
                                break;
                            case 10:
                                res=performTrigonometricOperation(scanner, 'd', angmode);
                                break;
                            case 11:
                                res=performTrigonometricOperation(scanner, 'e', angmode);
                                break;
                            case 12:
                                res=performTrigonometricOperation(scanner, 'f', angmode);
                                break;
                            case 13:
                                res=performUnaryOperation(scanner, "Logarithm (Base 10)", Operations::log10);
                                break;
                            case 14:
                                res=performUnaryOperation(scanner, "Natural Logarithm", Operations::log);
                                break;
                            case 15:
                                res=performUnaryOperation(scanner, "Logarithm (Base 2)", Operations::log2);
                                break;
                            case 16:
                                res=performUnaryOperation(scanner, "Absolute Value", Operations::abs);
                                break;
                            case 17:
                                res=performUnaryOperation(scanner, "Ceiling", Operations::ceil);
                                break;
                            case 18:
                                res=performUnaryOperation(scanner, "Floor", Operations::floor);
                                break;
                            case 19:
                                res=performUnaryOperation(scanner, "Round", Operations::round);
                                break;
                            case 20:
                                res = performBinaryOperation(scanner, "Logarithm (Custom Base)", Operations::logCustomBase);
                                break;
                            case 21:
                                res=performUnaryOperation(scanner, "Factorial", Operations::factorial);
                                break;
                            case 22:
                                res=performUnaryOperation(scanner, "Exponential", Operations::exp);
                                break;
                            case 23:
                                System.out.println("Angle Mode Changed");
                                //def angmode
                                angmode = ~angmode;
                                break;
                            case 24:
                                res=performUnaryOperation(scanner, "Degrees to Radians", Operations::degreesToRadians);
                                break;
                            case 25:
                                res=performUnaryOperation(scanner, "Radians to Degrees", Operations::radiansToDegrees);
                                break;
                            case 26:
                                performTernaryOperation(scanner, "(a+b)^c", Operations::powerOfSum);
                                break;
                            case 27:
                                performTernaryOperation(scanner, "(a-b)^c", Operations::powerOfDiff);
                                break;
                            case 28:
                                res=performUnaryOperation(scanner, "Absolute Power", Operations::absPower);
                                break;
                            case 29:
                                res = performBinaryOperation(scanner, "Modulus", Operations::modulus);
                                break;
                            case 30:
                                res=performUnaryOperation(scanner, "Square", Operations::square);
                                break;
                            case 31:
                                res=performUnaryOperation(scanner, "Cube", Operations::cube);
                                break;
                            case 32:
                                res = performBinaryOperation(scanner, "Minimum", Operations::minimum);
                                break;
                            case 33:
                                res = performBinaryOperation(scanner, "Maximum", Operations::maximum);
                                break;
                            case 34:
                                res = performBinaryOperation(scanner, "Average", Operations::average);
                                break;
                            case 35:
                                res = performBinaryOperation(scanner, "Average", Operations::geoaverage);
                                break;
                            case 36:
                                res = performBinaryOperation(scanner, "Average", Operations::harmaverage);
                                break;
                            case 37:
                                res=performUnaryOperation(scanner, "Inverse", Operations::inverse);
                                break;
                            case 38:
                                res = performBinaryOperation(scanner, "Percentage", Operations::percentage);
                                break;
                            case 39:
                                res=performUnaryOperation(scanner, "Round Up", Operations::roundUp);
                                break;
                            case 40:
                                res=performUnaryOperation(scanner, "Round Down", Operations::roundDown);
                                break;
                            case 41:
                                res=performUnaryOperation(scanner, "Hyperbolic Sine", Operations::sinh);
                                break;
                            case 42:
                                res=performUnaryOperation(scanner, "Hyperbolic Cosine", Operations::cosh);
                                break;
                            case 43:
                                res=performUnaryOperation(scanner, "Hyperbolic Tangent", Operations::tanh);
                                break;
                            case 44:
                                performInvTrigonometricOperation(scanner, 'a', angmode);
                                break;
                            case 45:
                                performInvTrigonometricOperation(scanner, 'b', angmode);
                                break;
                            case 46:
                                performInvTrigonometricOperation(scanner, 'c', angmode);
                                break;
                            case 47:
                                res = performBinaryOperation(scanner, "Permutation", Operations::permutation);
                                break;
                            case 48:
                                res = performBinaryOperation(scanner, "Combination", Operations::combination);
                                break;
                            case 49:
                                res=performUnaryOperation(scanner,"Sum of n",Operations::sumofn);
                                break;
                            case 50:
                                res=performUnaryOperation(scanner,"Sum of squares n",Operations::sum2ofn);
                                break;
                            case 51:
                                res=performUnaryOperation(scanner,"Sum of cubes n",Operations::sum3ofn);
                                break;
                            case 52:
                                res = performBinaryOperation(scanner,"Sum of kth power of n",Operations::sumkofn);
                                break;
                            case 53:
                                res=performUnaryOperation(scanner,"nth Harmonic number",Operations::harmnum);
                                break;
                            case 54:
                                System.out.println("Exiting scientific calculator.");
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter a number between 1 and 54.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting. Thank you for using Calculator Program");
                    System.exit(0);
            }
        }
    }*/

}

