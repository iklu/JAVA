/**
 * Java program to check if number is palindrome or not.
 * A number is called palindrome if number and its reverse is equal
 * This Java program can also be used to reverse a number in Java
 */
import java.util.Scanner;

/**
 *
 */
public class Palindrome {

    /**
     * This is essential, as you will see, in defining the main( ) method that is
     * the entry point for running an application
     * @param args
     */
    public static void main(String args[]){

        System.out.println("Please Enter a number : ");

        int number = new Scanner(System.in).nextInt();

        Palindrome p = new Palindrome();

        if(p.isNumberPalindrome(number)){
            System.out.println("Number : " + number + " is a palindrome");
        }else{
            System.out.println("Number : " + number + " is not a palindrome");
        }

        System.out.println("Please Enter a string : ");
        String string = new Scanner(System.in).nextLine();

        if(p.isStringPalindrome(string)){
            System.out.println("The string : " + string + " is a palindrome");
        }else{
            System.out.println("The string : " + string + " is not a palindrome");
        }

    }

    /**
     *
     * Java method to check if number is palindrome or not
     * isPalindrome
     * @param number
     * @return
     */
    public boolean isNumberPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;

            System.out.println("remainder (palindrome %10) = " + remainder);

            reverse = reverse * 10 + remainder;

            System.out.println("reverse (reverse * 10 + remainder) = " + reverse);

            System.out.println("palindrome = " + palindrome);

            palindrome = palindrome / 10;

            System.out.println("palindrome (palindrome / 10 ) = " + palindrome + "\n\n");

        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;
    }

    /**
     *
     * @param word
     * @return
     */
    public boolean isStringPalindrome(String word){

        String reverse = "";
        for(int i = word.length() -1; i>=0; i--){
            reverse = reverse + word.charAt(i);
        }
        // if original and reverse of string is equal means
        // string is palindrome in Java
        if (word.equals(reverse)) {
            return true;
        }
        return false;
    }
}
