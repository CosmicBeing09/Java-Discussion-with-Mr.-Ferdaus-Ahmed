import java.util.Scanner;

public class PracticeProblem01 {
    public static void main(String[] args) {

        //
        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        char operation = scanner.next().charAt(0);
//
//        if(operation == '+') System.out.println(a+b);
//        else if(operation == '-') System.out.println(a-b);
//        else if(operation == '*') System.out.println(a*b);
//        else if(operation == '/') System.out.println(a/b);
//        else System.out.println("Invalid Operation");

        //=======================================================

        // ** Convert Celsius scale to Fahrenheit: C / 5 = (F - 32) / 9

        int cel;
        int far;

        char ops = scanner.next().charAt(0);

        if(ops == 'c'){
            far = scanner.nextInt();
            cel = ((far - 32) / 9 ) * 5;
            System.out.println("Cel: "+ cel);
        }
        else {
            cel = scanner.nextInt();
            far = ((cel / 5) * 9 ) + 32;
            System.out.println("Far: " + far);
        }


    }
}
