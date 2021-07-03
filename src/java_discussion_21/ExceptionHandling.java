package java_discussion_21;

import java.util.ArrayList;

public class ExceptionHandling {

    // Throwable -> Exception -> RunTimeException -> ArithmeticException
    //                                            -> NullPointerException
    public int divide(int a, int b){
        int res = 0;

        try {
            res = a / b; //ArithmeticException
        }catch (NullPointerException e){
            e.printStackTrace();
        }finally {
            System.out.println("Division done");
            return res;
        }
    }

    public int divide_3(int a, int b) throws ArithmeticException{
        int res = 0;
        res = a / b;

        return res;
    }

    public int divide_4(int a, int b){
        if(b==0){
            System.out.println("Can't divide by zero");
            return 0;
        }
        else {
            return a / b;
        }
    }

    public double divide_2 (int a, int b) throws ArithmeticException{
        int res = 0;
        res = a / b;

        return res;
    }


    public static void main(String[] args) {
        // access : static
        // through instance / object **
        ExceptionHandling obj = new ExceptionHandling();

//        double res = obj.divide(5,0);

        try {
            int res_ = obj.divide_3(10, 0); // ArithmeticException
            double res = obj.divide_2(5, 0); // NullPointerException
        }catch (Exception e){
            e.printStackTrace();
        }


        System.out.println("hello");
        System.out.println("there!!!");


    }
}
