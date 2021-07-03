package java_discussion_16;

public class MethodDemo {

    public int add(int a, int b){ //parameter / argument
        return a + b;
    }

    public double add(double a, double b){
        return a + b;
    }

    public String add(String s1, String s2){
       return s1 + " " +s2;
    }

    public int add(int n, String s){
        return n + s.length();
    }

    public String add(double n, String s){
        return String.valueOf(n) + " " + s;
    }

    public String add(Name ob1, Name ob2){
       return ob1.getName() + " wed " + ob2.getName();
    }
}
