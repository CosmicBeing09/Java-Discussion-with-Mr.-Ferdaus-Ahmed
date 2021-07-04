package java_discussion_24;

import java.util.Comparator;

public class SortQuizByScore implements Comparator<Quiz> {

    @Override
    public int compare(Quiz o1, Quiz o2) {
        return Double.compare(o1.getScore(), o2.getScore());
    }
}
