import java.util.Locale;
import java.util.Scanner;

public class IntroClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        char[] arr = new char[10];
//
//        for (int i=0; i<10; i++){
//            arr[i] = scanner.next().charAt(0);
//        }
//
//        for (int i=0; i<10; i++){
//            System.out.print(arr[i]);
//        }

//        int a = 50;
//        int b = a; //copy
//        a = 60;

//       Teacher teacher1 = new Teacher(101, 25);
//       Teacher teacher2 = teacher1; //memory referencing
//
//       Teacher teacher3 = new Teacher(teacher1.getId(), teacher1.getAge());
//
//       teacher1.setAge(35);
//
//       System.out.println(teacher1.getAge());
//       System.out.println(teacher2.getAge());
//       System.out.println(teacher3.getAge());

//        String str = "Hello Java";
////        str = scanner.nextLine();
//
//        System.out.println(str);
//
//        System.out.println(str.length());
//        System.out.println(str.charAt(7));
//
//        System.out.println(str.substring(2, 7));
//        System.out.println(str.toLowerCase());
//
//        String temp = str.toUpperCase();
//        System.out.println(temp);

        String str1 = "Hello Java";
        String str2 = str1;

        String str3 = new String(str1);

        System.out.println(str1.equals(str2)); //content check
        System.out.println(str1 == str2); //same reference check

        System.out.println(str1.equals(str3)); //content
        System.out.println(str1 == str3); //same reference







    }
}
