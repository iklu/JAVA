public class GeneratePrimeNumbersExample {

    public static void main(String[] args) {

        //define limit
        int limit = 100;

        System.out.println(checkNumberIsPrime(3));
        System.out.println(checkNumberIsPrimeTwo(3));

//        System.out.println("Prime numbers between 1 and " + limit);
//
//        //loop through the numbers one by one
//        for(int i=2; i <=100; i++){
//            for(int j=2; j <= i; j++) {
//
//                //daca bucla nu sa rupt si a ajuns la j == i printam precum prim
//                if(j==i)
//                    System.out.println(i);
//
//                //rupem bucla daca se imparte la 2 sau alte numere din inaintea lui "i"
//                if(i % j == 0) {
//                    break;
//                }
//            }
//        }
    }

    /**
     * Is 9 prime:
     *
     * 9/2   =  4 rest 1
     * 9/3   =  4 rest 1
     * 9/4   =  4 rest 1
     * 9/5   =  4 rest 1
     * 9/6   =  4 rest 1
     * 9/7   =  4 rest 1
     * 9/8   =  4 rest 1
     * @param number
     * @return
     */
    public static boolean checkNumberIsPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i<number; i++){

            //Se calculeaza restul cu modulo (%) pana cand demonstreze ca numarul nu este prim (cand restul este egal cu 0)  pana la (number-1)
            //Daca toate calculele nu au dat rest zero pana la (number-1) atunci numarul este prim
            if(number%i == 0){
                isPrime = false;
                break;
            }

        }
        return isPrime;
    }

    /**
     * Is 9 prime:
     *
     * 9/2   =  4 rest 1
     * 9/3   =  4 rest 1
     * 9/4   =  4 rest 1
     * 9/5   =  4 rest 1
     * 9/6   =  4 rest 1
     * 9/7   =  4 rest 1
     * 9/8   =  4 rest 1
     * @param number
     * @return
     */
    public static boolean checkNumberIsPrimeTwo(int number) {
        boolean isPrime = false;
        for(int i=2; i <= number; i++) {

                //daca bucla nu sa rupt si a ajuns la i == number printam precum prim
                if(i == number) {
                   // System.out.println(i);
                    isPrime = true;
                }

                //rupem bucla daca se imparte la 2 sau alte numere din inaintea lui "i"
                if(i % number == 0) {
                    break;
                }
        }
        return isPrime;
    }
}