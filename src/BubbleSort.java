import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // swap
        int a = 10;
        int b = 15;

        int temp;

        temp = a; //temp = 10
        a = b; //a = 15 b = 15
        b = temp; //a = 15 b = 10 temp = 10

        int arr[] = {9, 11, 2, 15, 33};
        // goal 2 9 11 15 33

        // 9 -> 9 11 2 15 33 # 9 < 11 ? No Swap
        //   -> 2 11 9 15 33 # 9 < 2 ? Swap
        //   -> 2 11 9 15 33 # 9 < 15 ? No Swap
        //   -> 2 11 9 15 33 # 9 < 33 ? No Swap

        // arr : 2 11 9 15 33

        // 11 -> 2 9 11 15 33 # 11 < 9 ? Swap
        //    -> 2 9 11 15 33 # 11 < 15 ? No Swap
        //    -> 2 9 11 15 33 # 11 < 33 ? No Swap

        // arr : 2 9 11 15 33

        // 15 -> 2 9 11 15 33 # 11 < 33 ? No Swap


        // i = 0 : j = 1, 2, 3, 4
        // i = 1 : j = 2, 3, 4
        // i = 2 : j = 3, 4
        // i = 3 : j = 4
        // i = 4 : j =

        // i = 0 arr[0] = 9 : j = 1 arr[j] = 11
        //               arr[j] < arr[i] : 11 < 9

        // i = 0 arr[0] = 9 : j = 2 arr[2] = 2
        //               arr[j] < arr[i] : 2 < 9

        for(int i=0; i<5; i++){
            for(int j = i+1; j<5; j++){
                if(arr[j] > arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0; i<5; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
