package test;

import java.util.Scanner;

/**
 * Created by ovidiu on 14.12.2016.
 */
public class SortNumber {
    public static void main(String args[]){
        int n[] = {15, 18,2, 7, 1};


        for(int i = 0; i<n.length; i++){
            for(int j = 1; j<n.length; j++){
                if(n[j-1] > n[j]){
                    int temp = n[j];
                    n[j] = n[j-1];
                    n[j-1] = temp;
                }
            }
        }

        for(int i = 1; i<n.length; i++){
           System.out.print(" "+n[i]+" " );
        }

//        /System.out.print(n.hashCode());
    }
}
