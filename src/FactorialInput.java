import java.util.Scanner;

/**
 * Created by ovidiu on 09.12.2016.
 */
public class FactorialInput
{
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);

        System.out.print("n = ");

        int n = console.nextInt();

        int factorial = 1;

        for( int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.print(factorial);
    }
}
