package java_discussion_26;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Thread t1 = new NewThread("Thread 1");
//        Thread t2 = new NewThread("Thread 2");
//
//        Thread t3 = Thread.currentThread();
//        t3.setName("MainThread");
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//
//        System.out.println(t3.getName() + " is exiting");


//        Resource resource = new Resource();
//
//        Thread t1 = new DemoThread("Thread 1", resource);
//        Thread t2 = new DemoThread("Thread 2", resource);
//
//        t1.start();
//        t2.start();

        Resource resource = new Resource();

        Thread t1 = new Producer(resource);
        Thread t2 = new Consumer(resource);

        t1.start();
        t2.start();

    }
}
