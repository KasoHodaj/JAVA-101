package Week3;

import java.util.Scanner;

public class Tutorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Factorial Calculation
        System.out.print("Factorial: Type a number: ");
        int num1 = sc.nextInt();
        int fbNum = factorial(num1);
        System.out.println("Factorial of " + num1 + "!: " + fbNum);

        // Fibonacci Calculation
        System.out.print("Fibonacci Sequence: Type a number: ");
        int num2 = sc.nextInt();
        int fiboNum = fibonacci(num2);
        System.out.println("Fibonacci of " + num2 + ": " + fiboNum);

        // Close the scanner to prevent resource leak
        sc.close();
    }

    public static int factorial(int num) {
        /*
        alternative way
        return (num <= 0) ? 1 : num * factorial(num - 1);
         */
        if (num <= 0) { // Base case: factorial of 0 or negative number is 1
            return 1;
        }
        return num * factorial(num - 1); // Recursive case: calculate factorial of num
    }

    public static int fibonacci(int num) {
        if (num <= 1)
            return 1;
        return fibonacci(num - 1) + fibonacci(num - 2); // Recursive case: calculate Fibonacci of num
    }

}
