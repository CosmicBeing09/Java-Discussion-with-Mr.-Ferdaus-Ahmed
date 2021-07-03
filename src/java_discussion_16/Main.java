package java_discussion_16;

public class Main {
    public static void main(String[] args) {
        RecursionDemo recursionDemo = new RecursionDemo();

        System.out.println(recursionDemo.sum_loop(10));
        System.out.println(recursionDemo.sum_recursion(10));

        MethodDemo methodDemo = new MethodDemo();

        System.out.println(methodDemo.add(5,  7));
        System.out.println(methodDemo.add(5.7, 7.5));
        System.out.println(methodDemo.add("Hello", "there"));
        System.out.println(methodDemo.add(5, "raihan"));
        System.out.println(methodDemo.add(5.0, "raihan"));

        Name mahir = new Name();
        mahir.name = "Mahir";

        Name meem = new Name();
        meem.name = "Meem";

        System.out.println(methodDemo.add(mahir, meem));
    }
}
