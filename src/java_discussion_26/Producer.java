package java_discussion_26;

public class Producer extends Thread{

    Resource resource;

    public Producer(Resource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        for(int i=1; i<=5; i++){
            resource.put(i);
        }

    }
}
