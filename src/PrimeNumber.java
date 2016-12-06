/**
 * Cel mai mic NUMAR PRIM este 2, în afară de 2 toate numerele prime sunt numere impare.
 *
 * Un NUMAR PRIM este un număr care se împarte doar la el însuşi şi la 1. Cu alte cuvinte, nu are niciun alt divizor.
 Lista începe de la 2, 3, 5, 7, 11, 13, şi este infinită.
 * Created by ovidiu on 06.12.2016.
 */
public class PrimeNumber {
    public static void main(String args[]) {

        System.out.println(isPrimeNumber(11));
        System.out.println(isPrimeNumber(22));
        System.out.println(isPrimeNumber(37));
        System.out.println(isPrimeNumber(7));

        System.out.println("\n");
        System.out.println(isPrimeNumberMethod2(3));
        System.out.println(isPrimeNumberMethod2(43));
        System.out.println(isPrimeNumberMethod2(23));
        System.out.println(isPrimeNumberMethod2(88));

        // Here 120 is an upper limit
        crunchifyGeneratePrimeNumbers(120);
    }

    private static boolean isPrimeNumber(int numberToCheck) {
        System.out.println("Prime check started for number: " + numberToCheck);

        // Loop starts from 2

        System.out.println( "for i in : numberToCheck/2 = " + numberToCheck / 2 +"; ");

        for (int i = 2; i <= numberToCheck / 2; i++) {
            
            System.out.println(
                    "i: " + i + "; " +
                    "numberToCheck : numberToCheck % i =" + numberToCheck % i
            );
            
            if (numberToCheck % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Another way to check if Number is Prime
    public static boolean isPrimeNumberMethod2(int numberToCheck) {

        System.out.println("Prime check started for number: " + numberToCheck);

        boolean crunchifyPrime = true;
        int limit = (int) Math.sqrt(numberToCheck);

        for (int i = 2; i <= limit; i++) {
            if (numberToCheck % i == 0) {
                crunchifyPrime = false;
                break;
            }
        }

        return crunchifyPrime;
    }

    public static void crunchifyGeneratePrimeNumbers(int numberToCheckUpperLimit) {

        System.out.println("\nGenerating all prime number between 2 to " + numberToCheckUpperLimit);

        for (int i = 2; i < numberToCheckUpperLimit; i++) {

            boolean crunchifyIsPrime = true;

            // check to see if the number is prime
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    crunchifyIsPrime = false;
                    break;
                }
            }
            // print the number
            if (crunchifyIsPrime)
                System.out.print(i + " ");
        }
    }

}
