package design.pattern.test.behavior_patterns.visitor;

import java.util.List;

/**
 * Through Visitor pattern can visit another objects without modifying structure of those object
**/
public class VisitorClass {

    public void visitController(ControllerManagement controllerManagement){
        List<String> allUrls = controllerManagement
                .getAllUrls();
        System.out.println("********************* all controller urls ***********************");
        System.out.println(allUrls);
        System.out.println();
    }

    public void visitRepository(StrRepository strRepository){
        List<String> strList = strRepository.getAll();
        System.out.println("********************* all datas ***********************");
        System.out.println(strList);
        System.out.println();
    }
}
