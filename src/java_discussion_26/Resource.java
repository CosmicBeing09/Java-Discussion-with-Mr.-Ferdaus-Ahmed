package java_discussion_26;

public class Resource {

    volatile int n;
    volatile boolean flag = false;

    synchronized void increment(String name){
        for(int i = 0; i<5; i++){
            System.out.println("From : " + name + " " + i);
        }
    }

    synchronized int get(){
        while (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        flag = false;
        System.out.println("Get : " + n);
        notify();
        return this.n;
    }

    synchronized void put(int n){
        while (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        flag = true;
        this.n = n;
        notify();
        System.out.println("Put : " + this.n);
    }

}
