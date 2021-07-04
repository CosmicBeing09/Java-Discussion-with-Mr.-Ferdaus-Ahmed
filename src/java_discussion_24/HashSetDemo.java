package java_discussion_24;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
//        HashSet<Character> quizHashSet = new HashSet<>();
//        quizHashSet.add('A');
//        quizHashSet.add('B');
//        quizHashSet.add('C');
//        quizHashSet.add('A');
//
//        for(Character character : quizHashSet){
//            System.out.println(character);
//        }

        HashSet<Quiz> quizzes = new HashSet<>();

        quizzes.add(new Quiz("Raihan" , 5.5));
        quizzes.add(new Quiz("Munif" , 9.5));
        quizzes.add(new Quiz("Nazia" , 9.8));
        quizzes.add(new Quiz("Afnan" , 2.5));
        quizzes.add(new Quiz("Alex" , 6.5));
        quizzes.add(new Quiz("Alex" , 6.5));

        for(Quiz quiz : quizzes){
            System.out.println(quiz.getName() + " " + quiz.getScore());
        }
    }
}
