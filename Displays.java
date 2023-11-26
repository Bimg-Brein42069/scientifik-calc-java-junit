package org.example;

public class Displays {
    public static void displayWelcomeScientific() {
        System.out.println("Welcome to the Scientific Calculator!");
        System.out.println("Explore a wide range of mathematical operations.");
        System.out.println("Let's get started!");
        System.out.println();
    }

    public static void displayMenuScientific() {
        String[] menuItems = {
                "Addition", "Subtraction", "Multiplication", "Division",
                "Square Root", "Power", "Sin", "Cos", "Tan", "Secant", "Co-secant", "Co-tangent",
                "Logarithm(Base 10)", "Natural Logarithm", "Logarithm (Base 2)", "Absolute Value",
                "Ceiling", "Floor", "Round", "Logarithm (Custom Base)", "Factorial", "Exponential",
                "Angle Mode Changed", "Degrees to Radians", "Radians to Degrees", "(a+b)^c",
                "(a-b)^c", "Absolute Power", "Modulus", "Square", "Cube", "Minimum", "Maximum",
                "Average", "Geometric Average", "Harmonic Average", "Inverse", "Percentage", "Round Up", "Round Down",
                "Hyperbolic Sine", "Hyperbolic Cosine", "Hyperbolic Tangent", "Arcsine", "Arccosine",
                "Arctangent", "Permutation", "Combination", "Sum of n", "Sum of squares of n",
                "Sum of cubes of n", "Sum of kth power of n", "nth Harmonic number", "Exit"
        };

        // Rest of the code remains unchanged
        int columnWidth = 27;
        int columns = 5; // Adjust the number of columns as needed
        int rows = (int) Math.ceil((double) menuItems.length / columns);

        System.out.println("Scientific Calculator");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int index = i + j * rows;
                if (index < menuItems.length) {
                    System.out.printf("%-" + columnWidth + "s", (index + 1) + ". " + menuItems[index]);
                }
            }
            System.out.println();
        }
        System.out.print("Enter your choice: ");
    }

    public static void displayWelcome(){
        System.out.println("Welcome to the Calculator Program");
        System.out.println("Please select a mode");
        System.out.println("1. Standard");
        System.out.println("2. Scientific");
        System.out.println("3. Exit");
        System.out.println();
    }
    public static void displayWelcomeStd() {
        System.out.println("Welcome to the Standard Calculator!");
        System.out.println("Let's get started!");
        System.out.println();
    }

    public static void displayMenuStd() {
        String[] menuItems = {
                "Addition",
                "Subtraction",
                "Multiplication",
                "Division",
                "Exit"
        };

        int columnWidth = 25;
        int columns = 5;
        int rows = (int) Math.ceil((double) menuItems.length / columns);

        System.out.println("Standard Calculator");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int index = i + j * rows;
                if (index < menuItems.length) {
                    System.out.printf("%-" + columnWidth + "s", (index + 1) + ". " + menuItems[index]);
                }
            }
            System.out.println();
        }
        System.out.print("Enter your choice: ");
    }
}
