package design.pattern.test.structure_patterns.decorator;

public class DecoratorDataBaseService implements DecoratorService {
    public String getData() {
        return "data from MYSQL DB";
    }
}
