// this is the main

public class Patterns {

    public static void calculateFactorial(int a) {
        int factorial = 1;
        for (int i = a; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.printf("The factorial of %d is %d%n", a, factorial);
    }

    public static void main(String args[]) {
        calculateFactorial(5);
    }
}