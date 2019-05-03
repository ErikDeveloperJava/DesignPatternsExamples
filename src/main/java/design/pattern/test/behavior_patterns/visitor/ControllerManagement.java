package design.pattern.test.behavior_patterns.visitor;

import java.util.Arrays;
import java.util.List;

public class ControllerManagement {

    public List<String> getAllUrls(){
        return Arrays.asList("/user","/user/1","/post","/login");
    }
}
