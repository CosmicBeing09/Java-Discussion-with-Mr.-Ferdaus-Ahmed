package java_discussion_25;

public class ThreadDemo extends Thread{

//    private String className;
//
//    public ThreadDemo(String className){
//        this.className = className;
//    }

    @Override
    public void run() {
      print();
    }

    public void print(){
        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

}
