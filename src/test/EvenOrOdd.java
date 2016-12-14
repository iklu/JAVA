package test;

import java.util.Scanner;

/**
 * Created by ovidiu on 14.12.2016.
 */
public class EvenOrOdd {
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();

        int i =0;
        while(i<n){
            if(i%2==0){
                System.out.println("Even: " + i);
            } else {
                System.out.println("Odd: " + i);
            }
            i++;
        }
    }
}
