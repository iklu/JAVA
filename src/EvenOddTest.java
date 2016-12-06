
import java.util.Scanner;

/**
 * Numerele PARE sunt de forma n = 2p , unde p este întreg; 2 | n, pentru orice n par.
 * Numerele PARE se impart exact la 2
 * Numerele PARE nu dau rest 1
 *
 *
 *  un număr IMPAR are forma n= 2p+1 , unde p este un număr întreg.
 *
 *
 * Created by ovidiu on 05.12.2016.
 */
public class EvenOddTest{

    public static void main(String args[]){

        //scanner to get input from user
        Scanner console = new Scanner(System.in);

        System.out.printf("Enter any number : ");

        //return the user input as integer
        int number = console.nextInt();

        //if remainder is zero than even number
        if((number %2)==0){
            System.out.printf("number %d is even number %n" , number); //%d -decimal %n new line

        } else{
            //number is odd in Java
            System.out.printf("number %d is odd number %n", number);
        }

        //Finding Even and Odd number using Bitwise AND operator in Java.

        System.out.printf("Finding number if its even or odd using bitwise AND operator %n");

        //For Even numbers
        //XXX0
        //0001 AND
        //0000
        if( (number&1) == 0){
            System.out.printf("number %d is even number %n" , number);
        }else{
            System.out.printf("number %d is odd number %n", number);
        }

    }


}
