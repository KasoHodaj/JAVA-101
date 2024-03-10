package Week3;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Type an integer in range [one,infinity]: ");
        int num = sc.nextInt();

        boolean flag = isPalindrome(num); // True if it's palidrome, false if it's not.

        if(flag)
            System.out.println("The number you type is palidrome");
        else
            System.out.println("The number you type is NOT palidrome");

        sc.close();
    }

    // Συναρτηση για τον ελεγχο αν ενας αριθμος είναι παλινδρομος
    public static boolean isPalindrome(int num){
        return num == reverse(num); // ελεγχος αν ο αριθμος είναι ισος με τον αναστροφό του
    }

    // Συναρτηση για την αντιστροφη των ψηφιων ενος αριθμου
    public static int reverse(int num){
        int reversed = 0;
       // Loop to reverse the digits
        while (num != 0) {
            int digit = num % 10; // Extract the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            num /= 10; // Remove the last digit from the original number
        }
        return reversed; // Return the reversed number
    }
}
