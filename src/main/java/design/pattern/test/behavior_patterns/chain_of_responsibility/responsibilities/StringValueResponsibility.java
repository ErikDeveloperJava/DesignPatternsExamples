package design.pattern.test.behavior_patterns.chain_of_responsibility.responsibilities;

import design.pattern.test.behavior_patterns.chain_of_responsibility.anotations.StringValue;

import java.lang.reflect.Field;

public class StringValueResponsibility implements CommonResponsibility {

    @Override
    public void modify(Object object) {
        Class<?> clazz = object.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            if(field.isAnnotationPresent(StringValue.class)){
                String value = field.getAnnotation(StringValue.class).value();
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
