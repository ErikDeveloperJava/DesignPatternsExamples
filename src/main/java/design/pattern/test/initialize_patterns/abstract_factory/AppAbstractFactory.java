package design.pattern.test.initialize_patterns.abstract_factory;

/**
 * AbstractFactory pattern unites money Objects and gives References of those Objects
 **/
public class AppAbstractFactory {

    private AppAbstractFactory(){

    }

    public static AppAbstractFactory createInstance(){
        return new AppAbstractFactory();
    }

    public ControllerManagement getControllerManagement(){
        return new ControllerManagement();
    }

    public RepositoryManagement getRepositoryManagement(){
        return new RepositoryManagement();
    }

    public SecurityManagement getSecurityManagement(){
        return new SecurityManagement();
    }
}