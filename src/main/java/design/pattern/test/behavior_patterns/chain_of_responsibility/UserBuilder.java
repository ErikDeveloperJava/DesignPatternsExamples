package design.pattern.test.behavior_patterns.chain_of_responsibility;

import design.pattern.test.behavior_patterns.chain_of_responsibility.responsibilities.CommonResponsibility;
import design.pattern.test.behavior_patterns.chain_of_responsibility.responsibilities.IntegerValueResponsibility;
import design.pattern.test.behavior_patterns.chain_of_responsibility.responsibilities.StringValueResponsibility;
import sun.reflect.misc.ReflectUtil;

import java.util.Arrays;
import java.util.List;

public class UserBuilder {

    private List<CommonResponsibility> responsibilityList = Arrays
            .asList(
                    new IntegerValueResponsibility(),
                    new StringValueResponsibility()
                    );

    private UserBuilder(){

    }

    public static UserBuilder getInstance(){
        return new UserBuilder();
    }


    public Object buildObject(Class<?> clazz){
        try {
            Object instance  = ReflectUtil.newInstance(clazz);
            responsibilityList.forEach(commonResponsibility -> commonResponsibility.modify(instance));
            return instance;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
