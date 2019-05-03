package design.pattern.test.behavior_patterns.visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrRepository {

    private List<String> strList = Arrays.asList(
            "value_01",
            "value_02",
            "value_03",
            "value_04"
            );

    public List<String> getAll(){
        return strList;
    }
}
