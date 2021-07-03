package java_discussion_23;

public class GenericsDemo <T>{

    private T object;

    public GenericsDemo(T object){
        this.object = object;
    }

    public T getObject() {
        return object;
    }
}
