package java_discussion_27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();


        while (t>=0){
            int n = scan.nextInt();

            if(n%2==0)
                System.out.println("even");
            else
                System.out.println("odd");

            t--;
        }

    }
}
