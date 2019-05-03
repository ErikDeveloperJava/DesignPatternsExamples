package design.pattern.test.initialize_patterns.singleton;

/**
 * Every Class called Facade that have one instance during whole app
 **/
public class SingletonObject {

    private static SingletonObject instance;

    private SingletonObject(){}

    public synchronized static SingletonObject getInstance(){
        if (instance == null) {
            instance = new SingletonObject();
        }
        return instance;
    }
}