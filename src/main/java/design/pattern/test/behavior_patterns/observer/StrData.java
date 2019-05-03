package design.pattern.test.behavior_patterns.observer;

public class StrData {

    private static StrDataObserver observer = new StrDataObserver();

    private String id;

    private String text;

    public StrData(String id, String text) {
        this.id = id;
        this.text = text;
        observer.createObject("all args constructor(" + id + "," + text+")");
    }

    public StrData() {
        observer.createObject("no args constructor");
    }

    public void setId(String id) {
        this.id = id;
        observer.notifyModifiedField("id",id);
    }

    public void setText(String text) {
        observer.notifyModifiedField("text",text);
        this.text = text;
    }
}
