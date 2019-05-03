package design.pattern.test.structure_patterns.decorator;

public class PrintDecoratorService implements DecoratorService {

    private DecoratorService decoratorService;

    public PrintDecoratorService(DecoratorService decoratorService) {
        this.decoratorService = decoratorService;
    }

    public String getData() {
        String data = decoratorService.getData();
        System.out.println("returned data : " + data);
        return data;
    }
}