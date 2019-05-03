package design.pattern.test.behavior_patterns.strategy;

/**
 * Strategy object has one Class or Interface and it adapting it through children of Interface or class
 **/
public class StrategyObject {

    private Repository repository;

    public StrategyObject(Repository repository) {
        this.repository = repository;
    }

    public String getData(){
        return repository.getData();
    }
}
