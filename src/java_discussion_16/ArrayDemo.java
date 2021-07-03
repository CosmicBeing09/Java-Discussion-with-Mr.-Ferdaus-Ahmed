package java_discussion_16;

public class ArrayDemo {
    public static void main(String[] args) {
        double[] credits = {3, 1.5, 2, 4, 2};

        String[] name = {"raihan", "emon", "nazia", "munif",
                            "rumi"};

        double[][] grade =  {
                {3.75, 4, 3.25, 2.75, 3}, //i=0 j = 0, 1, 2, 3, 4
                {3, 2.5, 4, 4, 3.75},
                {4, 4, 2, 2.5, 3.5},
                {3.75, 4, 4, 3.5, 3},
                {4, 4, 3, 3.5, 2.75}
        };


        // (3.75 * 4 + 3 * 1.5 ) / (4 + 1.5)
        for(int i=0; i<5; i++){

            double total_credits = 0;
            double sum_of_grade_credit = 0; // i+= 1 => i = i + 1;

            for(int j=0; j<5; j++){
               sum_of_grade_credit += grade[i][j] * credits[j];
               total_credits += credits[j];
            }

            double cgpa = sum_of_grade_credit / total_credits;
            System.out.println(name[i] + " got CGPA : " + cgpa);
        }

    }
}
