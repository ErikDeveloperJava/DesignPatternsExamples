package design.pattern.test.structure_patterns.proxy;

public class TextPrinterImpl implements TextPrinter {

    private String text;

    public TextPrinterImpl(String text) {
        this.text = text;
    }

    public void print() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(text);
    }
}
