package java_discussion_25;

public class ThreadDemo_ extends Thread{
    @Override
    public void run() {
        int i = 1;
        while (true){
            System.out.println(Thread.currentThread().getName() + " " + i++);
        }
    }
}
