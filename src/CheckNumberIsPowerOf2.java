import java.util.Scanner;

public class CheckNumberIsPowerOf2 {

    public static void main(String[] args) {
        //scanner to get input from user
        Scanner console = new Scanner(System.in);

        System.out.printf("Enter any number : ");

        //return the user input as integer
        int number = console.nextInt();

        System.out.println(powerOf2(number));
    }

    /**
     * Function to check
     *
     * @param number
     * @return
     */
    private static boolean powerOf2(int number){

        if(number<=0){
            return false;
        }

        while(number > 1){
            if(number % 2 != 0){
                return false;
            }
            number = number / 2;
        }
        return true;
    }

}