package java_discussion_16;

public class RecursionDemo {
    public int sum_loop(int n){
        int sum = 0;
        for(int i=n; i>0; i--){
            sum += i;
        }
       return sum;
    }

    //fun calls itself
    // base case

    public int sum_recursion(int n){ //10 9 8 7
        if(n==1) {
            return 1;
        }
        return n + sum_recursion(n - 1);
    }


}
