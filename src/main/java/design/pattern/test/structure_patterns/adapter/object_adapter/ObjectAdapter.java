package design.pattern.test.structure_patterns.adapter.object_adapter;

/**
 * ObjectAdapter pattern has Adapter Object in it and when will invoke method in ObjectAdapter it will invoke method of Adapter Object
 **/
public class ObjectAdapter {

    private Adapter adapter = new Adapter();

    public void met(){
        adapter.adapte();
    }
}
