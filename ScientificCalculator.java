package org.example;

import java.util.Scanner;
import static org.example.Displays.*;

public class ScientificCalculator {
    public static void main(String[] args) {
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
                                performBinaryOperation(scanner, "Addition", Operations::add);
                                break;
                            case 2:
                                performBinaryOperation(scanner, "Subtraction", Operations::subtract);
                                break;
                            case 3:
                                performBinaryOperation(scanner, "Multiplication", Operations::multiply);
                                break;
                            case 4:
                                performBinaryOperation(scanner, "Division", Operations::divide);
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
                            performBinaryOperation(scanner, "Addition", Operations::add);
                            break;
                        case 2:
                            performBinaryOperation(scanner, "Subtraction", Operations::subtract);
                            break;
                        case 3:
                            performBinaryOperation(scanner, "Multiplication", Operations::multiply);
                            break;
                    case 4:
                        performBinaryOperation(scanner, "Division", Operations::divide);
                        break;
                    case 5:
                        performUnaryOperation(scanner, "Square Root", Operations::sqrt);
                        break;
                    case 6:
                        performBinaryOperation(scanner, "Power", Operations::power);
                        break;
                    case 7:
                        performTrigonometricOperation(scanner, 'a', angmode);
                        break;
                    case 8:
                        performTrigonometricOperation(scanner, 'b', angmode);
                        break;
                    case 9:
                        performTrigonometricOperation(scanner, 'c', angmode);
                        break;
                    case 10:
                        performTrigonometricOperation(scanner, 'd', angmode);
                        break;
                    case 11:
                        performTrigonometricOperation(scanner, 'e', angmode);
                        break;
                    case 12:
                        performTrigonometricOperation(scanner, 'f', angmode);
                        break;
                    case 13:
                        performUnaryOperation(scanner, "Logarithm (Base 10)", Operations::log10);
                        break;
                    case 14:
                        performUnaryOperation(scanner, "Natural Logarithm", Operations::log);
                        break;
                    case 15:
                        performUnaryOperation(scanner, "Logarithm (Base 2)", Operations::log2);
                        break;
                    case 16:
                        performUnaryOperation(scanner, "Absolute Value", Operations::abs);
                        break;
                    case 17:
                        performUnaryOperation(scanner, "Ceiling", Operations::ceil);
                        break;
                    case 18:
                        performUnaryOperation(scanner, "Floor", Operations::floor);
                        break;
                    case 19:
                        performUnaryOperation(scanner, "Round", Operations::round);
                        break;
                    case 20:
                        performBinaryOperation(scanner, "Logarithm (Custom Base)", Operations::logCustomBase);
                        break;
                    case 21:
                        performUnaryOperation(scanner, "Factorial", Operations::factorial);
                        break;
                    case 22:
                        performUnaryOperation(scanner, "Exponential", Operations::exp);
                        break;
                    case 23:
                        System.out.println("Angle Mode Changed");
                        //def angmode
                        angmode = ~angmode;
                        break;
                    case 24:
                        performUnaryOperation(scanner, "Degrees to Radians", Operations::degreesToRadians);
                        break;
                    case 25:
                        performUnaryOperation(scanner, "Radians to Degrees", Operations::radiansToDegrees);
                        break;
                    case 26:
                        performTernaryOperation(scanner, "(a+b)^c", Operations::powerOfSum);
                        break;
                    case 27:
                        performTernaryOperation(scanner, "(a-b)^c", Operations::powerOfDiff);
                        break;
                    case 28:
                        performUnaryOperation(scanner, "Absolute Power", Operations::absPower);
                        break;
                    case 29:
                        performBinaryOperation(scanner, "Modulus", Operations::modulus);
                        break;
                    case 30:
                        performUnaryOperation(scanner, "Square", Operations::square);
                        break;
                    case 31:
                        performUnaryOperation(scanner, "Cube", Operations::cube);
                        break;
                    case 32:
                        performBinaryOperation(scanner, "Minimum", Operations::minimum);
                        break;
                    case 33:
                        performBinaryOperation(scanner, "Maximum", Operations::maximum);
                        break;
                    case 34:
                        performBinaryOperation(scanner, "Average", Operations::average);
                        break;
                    case 35:
                        performBinaryOperation(scanner, "Average", Operations::geoaverage);
                        break;
                    case 36:
                        performBinaryOperation(scanner, "Average", Operations::harmaverage);
                        break;
                    case 37:
                        performUnaryOperation(scanner, "Inverse", Operations::inverse);
                        break;
                    case 38:
                        performBinaryOperation(scanner, "Percentage", Operations::percentage);
                        break;
                    case 39:
                        performUnaryOperation(scanner, "Round Up", Operations::roundUp);
                        break;
                    case 40:
                        performUnaryOperation(scanner, "Round Down", Operations::roundDown);
                        break;
                    case 41:
                        performUnaryOperation(scanner, "Hyperbolic Sine", Operations::sinh);
                        break;
                    case 42:
                        performUnaryOperation(scanner, "Hyperbolic Cosine", Operations::cosh);
                        break;
                    case 43:
                        performUnaryOperation(scanner, "Hyperbolic Tangent", Operations::tanh);
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
                        performBinaryOperation(scanner, "Permutation", Operations::permutation);
                        break;
                    case 48:
                        performBinaryOperation(scanner, "Combination", Operations::combination);
                        break;
                    case 49:
                        performUnaryOperation(scanner,"Sum of n",Operations::sumofn);
                        break;
                    case 50:
                        performUnaryOperation(scanner,"Sum of squares n",Operations::sum2ofn);
                        break;
                    case 51:
                        performUnaryOperation(scanner,"Sum of cubes n",Operations::sum3ofn);
                        break;
                    case 52:
                        performBinaryOperation(scanner,"Sum of kth power of n",Operations::sumkofn);
                        break;
                    case 53:
                        performUnaryOperation(scanner,"nth Harmonic number",Operations::harmnum);
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
    }

    public static void performBinaryOperation(Scanner scanner, String operationName, BinaryOperation operation) {
        System.out.print("Enter first number: ");
        //def num1
        double num1 = scanner.nextDouble();
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

    }

    public static void performUnaryOperation(Scanner scanner, String operationName, UnaryOperation operation) {
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
    }

    public static void performTrigonometricOperation(Scanner scanner,char trigop,int angmode) {
        //use angmode
        if(angmode == 0)
            System.out.print("Enter angle in degrees.");
        else {
            System.out.print("Enter angle in radians.");
            trigop += 6;
        }
        switch (trigop) {
            case 'a':
                performUnaryOperation(scanner, "Sine", Operations::sin);
                break;
            case 'b':
                performUnaryOperation(scanner, "Cosine", Operations::cos);
                break;
            case 'c':
                performUnaryOperation(scanner, "Tangent", Operations::tan);
                break;
            case 'd':
                performUnaryOperation(scanner, "Secant", Operations::sec);
                break;
            case 'e':
                performUnaryOperation(scanner, "Co-secant", Operations::cosec);
                break;
            case 'f':
                performUnaryOperation(scanner, "Co-tangent", Operations::cot);
                break;
            case 'g':
                performUnaryOperation(scanner, "Sine-Rad", Operations::sinrad);
                break;
            case 'h':
                performUnaryOperation(scanner, "Cosine-Rad", Operations::cosrad);
                break;
            case 'i':
                performUnaryOperation(scanner, "Tangent-Rad", Operations::tanrad);
                break;
            case 'j':
                performUnaryOperation(scanner, "Secant-Rad", Operations::secrad);
                break;
            case 'k':
                performUnaryOperation(scanner, "Co-secant-Rad", Operations::cosecrad);
                break;
            case 'l':
                performUnaryOperation(scanner, "Co-tangent-Rad", Operations::cotrad);
                break;
            default:
                System.out.println("Invalid choice for trigonometric function");
        }

        System.out.println();
    }

    public static void performInvTrigonometricOperation(Scanner scanner,char trigop,int angmode) {
        //use angmode
        if(angmode == 0)
            System.out.println("Results in degrees");
        else {
            System.out.println("Results in radians");
            trigop += 3;
        }
        switch (trigop) {
            case 'a':
                performUnaryOperation(scanner, "Arc Sine", Operations::arcsin);
                break;
            case 'b':
                performUnaryOperation(scanner, "Arc Cosine", Operations::arccos);
                break;
            case 'c':
                performUnaryOperation(scanner, "Arc Tangent", Operations::arctan);
                break;
            case 'd':
                performUnaryOperation(scanner, "Arc Sine-Rad", Operations::arcsinrad);
                break;
            case 'e':
                performUnaryOperation(scanner, "Arc Cosine-Rad", Operations::arccosrad);
                break;
            case 'f':
                performUnaryOperation(scanner, "Arc Tangent-Rad", Operations::arctanrad);
                break;
            default:
                System.out.println("Invalid choice for trigonometric function");
        }
        System.out.println();
    }

    public static void performTernaryOperation(Scanner scanner, String operationName, TernaryOperation operation) {
        System.out.print("Enter first number (a): ");
        //def numa
        double numA = scanner.nextDouble();
        System.out.print("Enter second number (b): ");
        //def numb
        double numB = scanner.nextDouble();
        System.out.print("Enter third number (c): ");
        //def numc
        double numC = scanner.nextDouble();
        double res=operation.apply(numA, numB, numC);
        //use res
        if(Double.isInfinite(res))
            System.out.println("Value out of range!!");
        else if(!Double.isNaN(res))
            System.out.println("Result: " + res);
        System.out.println();
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

}

