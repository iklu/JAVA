package test;

import java.util.Scanner;

/**
 * Calculeaza factorial din numere prime
 * Created by ovidiu on 14.12.2016.
 */
public class PrimeNumberFactorial {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        boolean isPrime;
        int factorial = 1;

        for(int i = 2; i<n ; i++){
            isPrime = true;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    isPrime=false;
                }
            }
            if(isPrime){
                factorial = factorial * i;
            }
        }

        System.out.print(factorial);

    }
}
