import java.util.ArrayList;

public class MethodsDemo {

    //int
    // double
    // char
    // boolean
    // void

    static void sum(int num1, int num2){
        int res = num1 + num2;
        System.out.println(res);
//        return res;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 15;


////        int result = sum(a, b);
////        System.out.println(sum(a, b));
//
//        sum(a, b); //method calling
//
//        String temp = "Raihan";
//        String[] name = {"Raihan", "Nazia", "Munif", "Rafa", "Nahiyan"};
//
//        int c = 10;
//        int[] programmingMarks = {70, 55, 89, 91, 56};
//
//        for(int i=0; i<5; i++){ //0 1 2 3 4
//            if(programmingMarks[i] >= 60)
//                System.out.println(name[i] + " : Pass");
//            else
//                System.out.println(name[i] + " : Fail");
//        }

        Programming101 p = new Programming101();

        Programming101[] programming101s = new Programming101[5];

        programming101s[0] = new Programming101();
        programming101s[0].setName("Raihan");
        programming101s[0].setMarks(70);

        programming101s[1] = new Programming101();
        programming101s[1].setName("Nazia");
        programming101s[1].setMarks(55);

        programming101s[2] = new Programming101();
        programming101s[2].setName("Munif");
        programming101s[2].setMarks(89);

        programming101s[3] = new Programming101();
        programming101s[3].setName("Rafa");
        programming101s[3].setMarks(91);

        programming101s[4] = new Programming101();
        programming101s[4].setName("Nahiyan");
        programming101s[4].setMarks(56);

        for(int i=0; i<5; i++){ //0 1 2 3 4
            if(programming101s[i].getMarks() >= 60)
                System.out.println(programming101s[i].getName() + " : Pass");
            else
                System.out.println(programming101s[i].getName() + " : Fail");
        }

    }

}
