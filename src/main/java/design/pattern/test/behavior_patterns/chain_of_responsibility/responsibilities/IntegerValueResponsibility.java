package design.pattern.test.behavior_patterns.chain_of_responsibility.responsibilities;

import design.pattern.test.behavior_patterns.chain_of_responsibility.anotations.IntegerValue;

import java.lang.reflect.Field;

public class IntegerValueResponsibility implements CommonResponsibility{

    @Override
    public void modify(Object object) {
        Class<?> clazz = object.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            if(field.isAnnotationPresent(IntegerValue.class)){
                int value = field.getAnnotation(IntegerValue.class).value();
                field.setAccessible(true);
                try {
                    field.set(object,value);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
