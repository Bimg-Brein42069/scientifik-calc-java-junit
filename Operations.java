package org.example;

public class Operations {
    // Binary operations
    public static double add(double num1, double num2) {
        //use num1,num2
        System.out.println("Performing Addition: " + num1 + " + " + num2);
        //def result
        double result = num1 + num2;
        // System.out.println("Result: " + result);
        return result;
    }

    public static double subtract(double num1, double num2) {
        System.out.println("Performing Subtraction: " + num1 + " - " + num2);
        double result = num1 - num2;
        // System.out.println("Result: " + result);
        return result;
    }

    public static double multiply(double num1, double num2) {
        System.out.println("Performing Multiplication: " + num1 + " * " + num2);
        double result = num1 * num2;
        // System.out.println("Result: " + result);
        return result;
    }

    public static double divide(double num1, double num2) {
        System.out.println("Performing Division: " + num1 + " / " + num2);
        if (num2 != 0) {
            double result = num1 / num2;
            // System.out.println("Result: " + result);
            return result;
        } else {
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }
    }

    public static double power(double base, double exponent) {
        System.out.println("Performing Power Calculation: " + base + " ^ " + exponent);
        double result = Math.pow(base, exponent);
        if(Double.isNaN(result)){
            System.out.println("Error: Invalid Input");
            return Double.NaN;
        }
        // System.out.println("Result: " + result);
        return result;
    }

    // Unary operations
    public static double sqrt(double num) {
        //use num
        if(num >= 0) {
            System.out.println("Performing Square Root Calculation: sqrt(" + num + ")");
            //def result
            double result = Math.sqrt(num);
            // System.out.println("Result: " + result);
            return result;
        }
        else{
            System.out.println("Error: Square root of negative numbers is not defined");
            return Double.NaN;
        }
    }
    public static double log10(double num) {
        System.out.println("Performing Logarithm (Base 10) Calculation: log10(" + num + ")");
        if (num > 0) {
            double result = Math.log10(num);
            // System.out.println("Result: " + result);
            return result;
        } else {
            System.out.println("Error: Cannot calculate logarithm of a non-positive number");
            return Double.NaN;
        }
    }

    public static double log2(double num) {
        System.out.println("Performing Logarithm (Base 10) Calculation: log10(" + num + ")");
        if (num > 0) {
            double result = Math.log10(num) / Math.log10(2);
            // System.out.println("Result: " + result);
            return result;
        } else {
            System.out.println("Error: Cannot calculate logarithm of a non-positive number");
            return Double.NaN;
        }
    }

    public static double log(double num) {
        System.out.println("Performing Logarithm Calculation: ln(" + num + ")");
        if (num > 0) {
            double result = Math.log(num);
            // System.out.println("Result: " + result);
            return result;
        } else {
            System.out.println("Error: Cannot calculate natural logarithm of a non-positive number");
            return Double.NaN;
        }
    }

    public static double abs(double num) {
        System.out.println("Performing Absolute Value Calculation: |" + num + "|");
        double result = Math.abs(num);
        // System.out.println("Result: " + result);
        return result;
    }

    public static double ceil(double num) {
        System.out.println("Performing Ceiling Calculation: ceil(" + num + ")");
        double result = Math.ceil(num);
        // System.out.println("Result: " + result);
        return result;
    }

    public static double floor(double num) {
        System.out.println("Performing Floor Calculation: floor(" + num + ")");
        double result = Math.floor(num);
        // System.out.println("Result: " + result);
        return result;
    }

    public static double round(double num) {
        System.out.println("Performing Round Calculation: round(" + num + ")");
        double result = Math.round(num);
        // System.out.println("Result: " + result);
        return result;
    }

    public static double logCustomBase(double base, double num) {
        System.out.println("Performing Logarithm (Custom Base) Calculation: log_" + base + "(" + num + ")");
        if (base > 0 && base != 1 && num > 0) {
            double result = Math.log(num) / Math.log(base);
            // System.out.println("Result: " + result);
            return result;
        } else {
            System.out.println("Error: Invalid input for logarithm with custom base");
            return Double.NaN;
        }
    }

    public static double factorial(double num) {
        System.out.println("Performing Factorial Calculation: " + num + "!");
        if (num >= 0) {
            double result = factorial((int) num);
            // System.out.println("Result: " + result);
            return result;
        } else {
            System.out.println("Error: Cannot calculate factorial of a negative number");
            return Double.NaN;
        }
    }

    public static double exp(double num) {
        System.out.println("Performing Exponential Calculation: e^" + num);
        double result = Math.exp(num);
        // System.out.println("Result: " + result);
        return result;
    }

    public static double degreesToRadians(double degrees) {
        System.out.println("Performing Degrees to Radians Conversion: " + degrees + " degrees");
        double result = Math.toRadians(degrees);
        // System.out.println("Result: " + result);
        return result;
    }

    public static double radiansToDegrees(double rads) {
        System.out.println("Performing Radians to Degrees Conversion: " + rads + " radians");
        double result = Math.toDegrees(rads);
//        System.out.println("Result: " + result + " radians");
        return result;
    }

    // Trigonometric operations
    public static double sin(double angle) {
        System.out.println("Performing Sine Calculation: sin(" + angle + " degrees)");
        double result = Math.sin(Math.toRadians(angle));
        // System.out.println("Result: " + result);
        return result;
    }

    public static double cos(double angle) {
        System.out.println("Performing Cosine Calculation: cos(" + angle + " degrees)");
        double result = Math.cos(Math.toRadians(angle));
        // System.out.println("Result: " + result);
        return result;
    }

    public static double tan(double angle) {
        System.out.println("Performing Tangent Calculation: tan(" + angle + " degrees)");
        double result = Math.tan(Math.toRadians(angle));
        // System.out.println("Result: " + result);
        return result;
    }

    public static double sec(double angle) {
        System.out.println("Performing Sine Calculation: sin(" + angle + " degrees)");
        double result = 1/Math.cos(Math.toRadians(angle));
        // System.out.println("Result: " + result);
        return result;
    }

    public static double cosec(double angle) {
        System.out.println("Performing Cosine Calculation: cos(" + angle + " degrees)");
        double result = 1/Math.sin(Math.toRadians(angle));
        // System.out.println("Result: " + result);
        return result;
    }

    public static double cot(double angle) {
        System.out.println("Performing Tangent Calculation: tan(" + angle + " degrees)");
        double result = 1/Math.tan(Math.toRadians(angle));
        // System.out.println("Result: " + result);
        return result;
    }

    public static double sinrad(double angle) {
        System.out.println("Performing Sine Calculation: sin(" + angle + " degrees)");
        double result = Math.sin(angle);
        // System.out.println("Result: " + result);
        return result;
    }

    public static double cosrad(double angle) {
        System.out.println("Performing Cosine Calculation: cos(" + angle + " degrees)");
        double result = Math.cos(angle);
        // System.out.println("Result: " + result);
        return result;
    }

    public static double tanrad(double angle) {
        System.out.println("Performing Tangent Calculation: tan(" + angle + " degrees)");
        double result = Math.tan(angle);
        // System.out.println("Result: " + result);
        return result;
    }

    public static double secrad(double angle) {
        System.out.println("Performing Sine Calculation: sin(" + angle + " degrees)");
        double result = 1/Math.cos(angle);
        // System.out.println("Result: " + result);
        return result;
    }

    public static double cosecrad(double angle) {
        System.out.println("Performing Cosine Calculation: cos(" + angle + " degrees)");
        double result = 1/Math.sin(angle);
        // System.out.println("Result: " + result);
        return result;
    }

    public static double cotrad(double angle) {
        System.out.println("Performing Tangent Calculation: tan(" + angle + " degrees)");
        double result = 1/Math.tan(angle);
        // System.out.println("Result: " + result);
        return result;
    }

    // Factorial function
    public static int factorial(int n) {
        System.out.println("Performing Factorial Calculation: " + n + "!");
        /*if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }*/
        //last def if n==0
        int res=1;
        for(int i=1;i<=n;i++)
            //last def at i == n
            res*=i;
        return res;
    }

    public static int sumofn(int n) {return (n * (n+1)) / 2;    }

    public static int sum2ofn(int n) {return (n * (n+1) * (2*n+1)) / 6;}

    public static int sum3ofn(int n) { return (int)Math.pow((double)(n * (n+1)) / 2,2);    }

    // Combination and Permutation functions
    public static double combination(double n, double r) {
        System.out.println("Performing Combination Calculation: C(" + n + ", " + r + ")");
        if (n >= r && n >= 0 && r >= 0) {
            double a=factorial(n);
            double b=factorial(n-r);
            double c=factorial(r);
            //use a,b,c aka res in 3 factorial calls,def result
            double result = a/(b*c);
            // System.out.println("Result: " + result);
            return result;
        } else {
            System.out.println("Error: Invalid input for combination");
            return Double.NaN;
        }
    }

    public static double permutation(double n, double r) {
        System.out.println("Performing Permutation Calculation: P(" + n + ", " + r + ")");
        if (n >= r && n >= 0 && r >= 0) {
            double a=factorial(n);
            double b=factorial(n-r);
            double result = a/b;
            // System.out.println("Result: " + result);
            return result;
        } else {
            System.out.println("Error: Invalid input for permutation");
            return Double.NaN;
        }
    }

    // Binary operations
    public static double powerOfSum(double a, double b, double c) {
        System.out.println("Performing Power of Sum Calculation: (" + a + " + " + b + ") ^ " + c);
        double result = Math.pow((a + b), c);
        if(Double.isNaN(result)) {
            System.out.println("Error: Invalid input.");
            return Double.NaN;
        }
        // System.out.println("Result: " + result);
        return result;
    }
    public static double powerOfDiff(double a, double b, double c) {
        System.out.println("Performing Power of Difference Calculation: (" + a + " - " + b + ") ^ " + c);
        double result = Math.pow((a - b), c);
        if(Double.isNaN(result)){
            System.out.println("Error: Invalid input.");
            return Double.NaN;
        }
        // System.out.println("Result: " + result);
        return result;
    }


    // Unary operations
    public static double absPower(double num) {
        System.out.println("Performing Absolute Power Calculation: |" + num + "| ^ 2");
        double result = Math.pow(Math.abs(num), 2);
        // System.out.println("Result: " + result);
        return result;
    }

    public static double inverse(double num) {
        System.out.println("Performing Inverse Calculation: 1 / " + num);
        if (num != 0) {
            double result = 1 / num;
            // System.out.println("Result: " + result);
            return result;
        } else {
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }
    }

    public static double square(double num) {
        System.out.println("Performing Square Calculation: " + num + " ^ 2");
        double result = Math.pow(num, 2);
        // System.out.println("Result: " + result);
        return result;
    }

    public static double cube(double num) {
        System.out.println("Performing Cube Calculation: " + num + " ^ 3");
        double result = Math.pow(num, 3);
        // System.out.println("Result: " + result);
        return result;
    }

    public static double arcsin(double num) {
        System.out.println("Performing Arcsine Calculation: arcsin(" + num + ")");
        double result = radiansToDegrees(Math.asin(num));
        // System.out.println("Result: " + result);
        return result;
    }

    public static double arcsinrad(double num) {
        System.out.println("Performing Arcsine(Radians) Calculation: arcsin(" + num + ")");
        double result = Math.asin(num);
        // System.out.println("Result: " + result);
        return result;
    }

    public static double arccos(double num) {
        System.out.println("Performing Arccos Calculation: arcsin(" + num + ")");
        double result = radiansToDegrees(Math.asin(num));
        // System.out.println("Result: " + result);
        return result;
    }

    public static double arccosrad(double num) {
        System.out.println("Performing Arccos(Radians) Calculation: arcsin(" + num + ")");
        double result = Math.asin(num);
        // System.out.println("Result: " + result);
        return result;
    }

    public static double arctan(double num) {
        System.out.println("Performing Arctan Calculation: arcsin(" + num + ")");
        double result = radiansToDegrees(Math.asin(num));
        // System.out.println("Result: " + result);
        return result;
    }

    public static double arctanrad(double num) {
        System.out.println("Performing Arctan(Radians) Calculation: arcsin(" + num + ")");
        double result = Math.asin(num);
        // System.out.println("Result: " + result);
        return result;
    }

    public static double sinh(double num) {
        System.out.println("Performing Hyperbolic Sine Calculation: sinh(" + num + ")");
        double result = Math.sinh(num);
        // System.out.println("Result: " + result);
        return result;
    }

    public static double cosh(double num) {
        System.out.println("Performing Hyperbolic Cosine Calculation: cosh(" + num + ")");
        double result = Math.cosh(num);
        // System.out.println("Result: " + result);
        return result;
    }

    public static double tanh(double num) {
        System.out.println("Performing Hyperbolic Tangent Calculation: tanh(" + num + ")");
        double result = Math.tanh(num);
        // System.out.println("Result: " + result);
        return result;
    }

    public static double roundUp(double num) {
        System.out.println("Performing Round Up Calculation: ceil(" + num + ")");
        double result = Math.ceil(num);
        // System.out.println("Result: " + result);
        return result;
    }

    public static double roundDown(double num) {
        System.out.println("Performing Round Down Calculation: floor(" + num + ")");
        double result = Math.floor(num);
        // System.out.println("Result: " + result);
        return result;
    }

    // Binary operations
    public static double modulus(double num1, double num2) {
        System.out.println("Performing Modulus Calculation: " + num1 + " % " + num2);
        if (num2 != 0) {
            double result = num1 % num2;
            // System.out.println("Result: " + result);
            return result;
        } else {
            System.out.println("Error: Modulus by zero");
            return Double.NaN;
        }
    }

    public static double minimum(double num1, double num2) {
        System.out.println("Performing Minimum Calculation: min(" + num1 + ", " + num2 + ")");
        double result = Math.min(num1, num2);
        // System.out.println("Result: " + result);
        return result;
    }

    public static double maximum(double num1, double num2) {
        System.out.println("Performing Maximum Calculation: max(" + num1 + ", " + num2 + ")");
        double result = Math.max(num1, num2);
        // System.out.println("Result: " + result);
        return result;
    }

    public static double average(double num1, double num2) {
        System.out.println("Performing Average Calculation: ( " + num1 + " + " + num2 + " ) / 2");
        double result = (num1 + num2) / 2;
        // System.out.println("Result: " + result);
        return result;
    }

    public static double geoaverage(double num1, double num2) {
        System.out.println("Performing Geometric Mean Calculation on " + num1 + " , " + num2 );
        double result =  sqrt(num1 * num2);
        if(Double.isNaN(result)){
            System.out.println("Error: Invalid Input");
            return Double.NaN;
        }
        // System.out.println("Result: " + result);
        return result;
    }

    public static double harmaverage(double num1, double num2) {
        System.out.println("Performing Harmonic Mean Calculation on  " + num1 + " ," + num2 + " ");
        double result =  1/num1 + 1/num2;
        if(Double.isNaN(result)){
            System.out.println("Error: Invalid Input");
            return Double.NaN;
        }
        // System.out.println("Result: " + result);
        return result;
    }
    public static double percentage(double num1, double num2) {
        System.out.println("Performing Percentage(b is % of a) Calculation: ( " + num1 + " / " + num2 + " ) * 100");
        double result = (num1 / num2) * 100;
        // System.out.println("Result: " + result);
        return result;
    }

    public static double harmnum(double num){
        System.out.println("Finding " + num + "th harmonic number." );
        if (num >= 0) {
            int n=(int)num;
            double result=0;
            for(int i=1;i<=n;i++){
                result += 1.0/(double)i;
            }
            // System.out.println("Result: " + result);
            return result;
        }
        else {
            System.out.println("Error: Cannot calculate if n is negative.");
            return Double.NaN;
        }
    }
    public static double sumofn(double num) {
        System.out.println("Performing Sum of n numbers Calculation: S(" + num + ")" );
        if (num >= 0) {
            double result = sumofn((int) num);
            // System.out.println("Result: " + result);
            return result;
        }
        else {
            System.out.println("Error: Cannot calculate S(n) if n is negative.");
            return Double.NaN;
        }
    }

    public static double sum2ofn(double num) {
        System.out.println("Performing Sum of Squares of n numbers Calculation: S2(" + num + ")" );
        if (num >= 0) {
            double result = sum2ofn((int) num);
            // System.out.println("Result: " + result);
            return result;
        }
        else {
            System.out.println("Error: Cannot calculate S2(n) if n is negative.");
            return Double.NaN;
        }
    }

    public static double sum3ofn(double num) {
        System.out.println("Performing Sum of Cubes of n numbers Calculation: S3(" + num + ")" );
        if (num >= 0) {
            double result = sum3ofn((int) num);
            // System.out.println("Result: " + result);
            return result;
        }
        else {
            System.out.println("Error: Cannot calculate S3(n) if n is negative.");
            return Double.NaN;
        }
    }

    public static double sumkofn(double num,double k){
        System.out.println("Performing Sum of kth power of n numbers Calculation: Sk(" + num + ")" );
        if(num >= 0){
            double result = 0;
            for(double i=1;i<=num;i++){
                //last def of res at i=num
                result+=Math.pow(i,k);
            }
            // System.out.println("Result: " + result);
            return result;
        }
        else {
            System.out.println("Error: Cannot calculate S3(n) if n is negative.");
            return Double.NaN;
        }
    }

}
