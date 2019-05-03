package design.pattern.test.structure_patterns.decorator;

public class CountTimeDecoratorService implements DecoratorService {

    private DecoratorService decoratorService;

    public CountTimeDecoratorService(DecoratorService decoratorService) {
        this.decoratorService = decoratorService;
    }

    public String getData() {
        long startTime = System.currentTimeMillis();
        String data = decoratorService.getData();
        long endTime = System.currentTimeMillis();
        System.out.println("passed  " + (endTime - startTime) + " millis");
        return data;
    }
}
