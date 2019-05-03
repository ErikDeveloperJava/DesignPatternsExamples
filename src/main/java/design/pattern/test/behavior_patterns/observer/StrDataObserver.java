package design.pattern.test.behavior_patterns.observer;

/**
 * Observer pattern used if need to doing notifications
 **/
public class StrDataObserver {

    public void notifyModifiedField(String fieldName,String value){
        System.out.println(fieldName + " has modified and has set value: '" + value+ "'");
    }

    public void createObject(String description){
        System.out.println("created new StrData() with "+ description);
    }
}