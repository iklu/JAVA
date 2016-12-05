/**
 * Java program to check if number is palindrome or not.
 * A number is called palindrome if number and its reverse is equal
 * This Java program can also be used to reverse a number in Java
 */

import java.util.Scanner;

public class Palindrome {

    /**
     * This is essential, as you will see, in defining the main( ) method that is
     * the entry point for running an application
     * @param args
     */
    public static void main(String args[]){


//        int procent = 157;
//
//        int operation = procent % 10;
//
//        System.out.print(operation);
//
//        System.exit(0);

        System.out.println("Please Enter a number : ");
        int palindrome = new Scanner(System.in).nextInt();

        if(isPalindrome(palindrome)){
            System.out.println("Number : " + palindrome + " is a palindrome");
        }else{
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }

    }

    /*
    * Java method to check if number is palindrome or not
    */
    public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;

            System.out.println("remainder = palindrome %10  :" + remainder);

            reverse = reverse * 10 + remainder;

            System.out.println("reverse = reverse * 10 + remainder :" + reverse);

            palindrome = palindrome / 10;

            System.out.println("palindrome = palindrome / 10  :" + palindrome + "\n\n");


        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;
    }
}
