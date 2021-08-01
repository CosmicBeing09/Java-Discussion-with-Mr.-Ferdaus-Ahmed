package java_discussion_26;

public class NewThread extends Thread{

    private String name;

    public NewThread(String name){
        this.name = name;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(this.name + " is exiting");
    }
}
