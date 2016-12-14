package test;

import java.util.Scanner;

/**
 * Created by ovidiu on 14.12.2016.
 */
public class Prime {
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        boolean isPrime;
        for(int i = 2; i<n ; i++){
            isPrime = true;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    isPrime=false;
                }
            }
            if(isPrime){
                System.out.println("Is prime" + i);
            }
        }
    }
}
