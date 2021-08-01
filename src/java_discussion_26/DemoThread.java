package java_discussion_26;

public class DemoThread extends Thread{

    String name;
    Resource resource;

    public DemoThread(String name, Resource resource) {
        this.name = name;
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.increment(name);
    }
}
