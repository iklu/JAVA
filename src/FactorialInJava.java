/**
 * Created by ovidiu on 06.12.2016.
 */
public class FactorialInJava {
    public static void main(String args[]) {
        System.out.println("factorial of 5 using recursion in Java is: " + factorial(5));
    }

    public static int factorial(int number) {

        int result;
        if(number == 0) {
            return 1;
        }

        System.out.println("n = "+number);
        System.out.println("n - 1= "+ (number-1));
        System.out.println("n * (n -1)= "+ number * (number-1) + "\n");


        result = number * factorial(number-1);


        return result;

    }
}
