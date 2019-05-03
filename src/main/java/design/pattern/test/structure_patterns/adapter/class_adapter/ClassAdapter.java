package design.pattern.test.structure_patterns.adapter.class_adapter;

/**
 * ClassAdapter pattern implements two interfaces, on of them introduces client app and other introduces adapter
 **/
public class ClassAdapter implements Adapter,ClientAdapter{

    public void adapt() {

    }

    public void met() {
        adapt();
    }
}
