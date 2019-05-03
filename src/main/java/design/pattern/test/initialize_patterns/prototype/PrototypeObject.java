package design.pattern.test.initialize_patterns.prototype;


/**
 * Through Prototype pattern can create PrototypeObject by another Object
**/
public class PrototypeObject implements MiddleInterface{

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public MiddleInterface getRef() {
        return new PrototypeObject();
    }
}