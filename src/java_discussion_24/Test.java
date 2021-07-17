package java_discussion_24;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 10, 15};

//        Arrays.sort(arr);


        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println(Arrays.binarySearch(arr, 10));

//        =======================================================
//       Quiz[] quizzes = new Quiz[5];
//
//       quizzes[0] = new Quiz("Raihan" , 5.5);
//       quizzes[1] = new Quiz("Munif" , 9.5);
//       quizzes[2] = new Quiz("Nazia" , 9.8);
//       quizzes[3] = new Quiz("Afnan" , 2.5);
//       quizzes[4] = new Quiz("Alex" , 6.5);

//       SortQuizByScore sortQuizByScore = new SortQuizByScore();
//       Arrays.sort(quizzes, sortQuizByScore);

//       Arrays.sort(quizzes, new SortQuizByScore());
//
//       for(int i=0; i<quizzes.length; i++){
//           System.out.println(quizzes[i].getName() + " " + quizzes[i].getScore());
//       }

        //====================================================================

//        ArrayList<Quiz> quizzes = new ArrayList<>();
////        Quiz q1 = new Quiz("Raihan" , 5.5);
////        quizzes.add(q1);
//
//        quizzes.add(new Quiz("Raihan" , 5.5));
//        quizzes.add(new Quiz("Munif" , 9.5));
//        quizzes.add(new Quiz("Nazia" , 9.8));
//        quizzes.add(new Quiz("Afnan" , 2.5));
//        quizzes.add(new Quiz("Alex" , 6.5));
//
//
//        Collections.sort(quizzes, new SortQuizByScore());

//        for(int i=0; i<quizzes.size(); i++){
//            System.out.println(quizzes.get(i).getName() + " " + quizzes.get(i).getScore());
//        }

        //For-Each iterator
//        for(Quiz quiz : quizzes){
//            System.out.println(quiz.getName() + " " + quiz.getScore());
//        }

        //Iterator class
//        Iterator<Quiz> it = quizzes.iterator();
//        while (it.hasNext()){
//            Quiz temp = it.next();
//            System.out.println(temp.getName() + " " + temp.getScore());
//        }

    }
}
