import java.util.Scanner;

public class PracticeProblem03 {
    public static void main(String[] args) {

        //fibonacci series

//        int prev1 = 0;
//        int prev2 = 1;
//        int current;
//
//
//        //   1  +  2   =  3
//        // prev1 prev2 current
//        //   2  +  3   =   5
//
//        for(int i=0; i<15 ; i++){
//            current = prev1 + prev2;
//            prev1 = prev2;
//            prev2 = current;
//            System.out.print(current + " ");
//
//            if(current == 89)
//                break;
//        }

        //======================================


        // ** Store some values (integer or floating point) and print the average of them **

//        Scanner scanner = new Scanner(System.in);
//
//
//        int size = scanner.nextInt();
//
//        int array[] = new int[size];
//
//        //input
//        for (int i=0 ;i<size; i++)
//            array[i] = scanner.nextInt();
//
//        int sum = 0;
//
//        for(int i=0; i<size; i++){
//            sum += array[i]; // sum = sum + array[i];
//        }
//
//        int average = sum / size;
//        System.out.println("Average: " + average );

        // =================================================

        // ** Find the greatest number of a given series. Use Array and loops. **

//        Scanner scanner = new Scanner(System.in);
//
//
//        int size = scanner.nextInt();
//
//        int array[] = new int[size];
//
//        //input
//        for (int i=0 ;i<size; i++)
//            array[i] = scanner.nextInt();
//
//        int greatest = -999999999;
//
//        // -3 -6 -10
//
//        for (int i=0 ;i<size; i++){
//            if(array[i] > greatest){
//                greatest = array[i];
//            }
//        }
//
//        System.out.println("Greatest: "+ greatest);

        //==============================================

//       ** Write a program to see if a given number is a prime number or not.

        int num = 12;
        boolean isPrime = true; //flag

        for(int i=2; i<num; i++){

            if(num % i == 0){
                System.out.println("Not Prime");
                isPrime = false;
                break;
            }
        }

        if(isPrime == true){
            System.out.println("Prime");
        }

    }
}
