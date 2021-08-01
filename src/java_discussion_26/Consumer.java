package java_discussion_26;

public class Consumer extends Thread{

    Resource resource;
    public Consumer(Resource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        for(int i=0; i<5; i++){
            resource.get();
        }
    }
}
