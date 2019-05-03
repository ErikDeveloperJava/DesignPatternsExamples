package design.pattern.test.behavior_patterns.strategy;

public class InMemoryRepository implements Repository {
    public String getData() {
        return "data from InMemoryRepository";
    }
}
