package design.pattern.test.structure_patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Through Proxy pattern can create another object which implements or extends from class which need to become proxy object
 * then can add extra logic before or after invoking method of original object
 **/
public class ProxyAbstractFactory {


    private ProxyAbstractFactory(){}

    public Object addTimeLogicInObject(final Object object){
        return Proxy.newProxyInstance(
                object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        long startMillis = System.currentTimeMillis();
                        Object result = method.invoke(object, args);
                        long endMillis = System.currentTimeMillis();
                        System.out.println("passed " + (endMillis - startMillis) + " millis");
                        return result;
                    }
                });
    }

    public static ProxyAbstractFactory getInstance(){
        return new ProxyAbstractFactory();
    }
}