package java_discussion_25;

public class Main {
    public static void main(String[] args) {
//        ThreadDemo t1 = new ThreadDemo("A");
//        ThreadDemo t2 = new ThreadDemo("B");
//        ThreadDemo t3 = new ThreadDemo("C");

        Thread t1 = new ThreadDemo();
        t1.setName("Thread 1");

        Thread t2 = new ThreadDemo();
        t2.setName("Thread 2");

        Thread t3 = new ThreadDemo();
        t3.setName("Thread 3");

        Thread t4 = new ThreadDemo_();
        t4.setName("Thread inf... ");

        t4.start();
        t1.start();
        t2.start();
        t3.start();


    }
}
