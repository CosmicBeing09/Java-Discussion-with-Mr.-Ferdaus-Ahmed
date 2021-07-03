public class PracticeProblem02 {
    public static void main(String[] args) {
//        int year = 2021;
//
//        if((year % 400 ==0) || (year % 4 ==0 && year % 100 != 0))
//            System.out.println("Leap Year");
//        else
//            System.out.println("Not Leap Year");

        //=======================================

        //for loop

//        for(int i = 2; i<=20; i+=2)
//            System.out.print(i + " ");
//
//        System.out.println("");
//
//        // while loop
//        int i = 2;
//        while (i<=20){
//            System.out.print(i + " ");
//            i+=2;
//        }
//
//        System.out.println("");
//
//        //do-while loop
//        int j = 2;
//        do{
//            System.out.print(j + " ");
//            j+=2;
//        }while (j<=20);

        //=====================================
//        for(int i=1; i<=20; i++){
//            if(i % 2 == 0) {
//                System.out.println(i + " ");
//            }
//        }

        //=====================================
//        int sum ;
//
//        for(int i=1; i<=20; i++){
//            if(i % 2 == 0) {
//                sum = sum + i; // sum += i;
//                // 1: 0 = 0 + 2
//                // 2: 2 = 2 + 4
//                // 3: 4 = 4 + 6
//            }
//        }
//        System.out.println(sum);
//
//
        int multiply = 1;

        for(int i=1; i<=20; i++){
            if(i % 2 == 0) {
                multiply = multiply + i; // sum += i;
                // 1: 0 = 0 * 2
                // 2: 0 = 0 * 4
                // 3: 0 = 0 * 6
            }
        }
        System.out.println(multiply);


    }
}
