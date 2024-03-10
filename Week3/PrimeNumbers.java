package Week3;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char sol;

        do{
            // Prompt the user to enter a number
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            // Check if the entered number is prime
            boolean flag = isPrime(num, num / 2);
            if (flag)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");

            System.out.print("Do you want to check another number? (y/n): ");
            sol = sc.next().charAt(0);

        }while(sol != 'n');
        System.out.println("Goodbye!");
        sc.close();
    }


    public static boolean isPrime(int num, int div){
        if (num <= 1)
            return false;
        if (div == 1)
            return true; // Base case: if the divisor is 1, it's prime
        if (num % div == 0)
            return false; // If num is divisible by div, it's not prime
        return isPrime(num, div - 1);
    }
}
