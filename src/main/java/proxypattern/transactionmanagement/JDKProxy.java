package proxypattern.transactionmanagement;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKProxy<T> implements InvocationHandler {
    private final T targetObj;

    JDKProxy(T obj) {
        this.targetObj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String name = method.getName();
        if (name.contains("save")) {
            try {
                System.out.println("Saving data ....using JDK proxy");
                method.invoke(targetObj, args);
                System.out.println("Data saved successfully.");
            } catch (RuntimeException e) {
                System.out.println("»»»»»»»»»»»» rolling back «««««««««««");
            }
        } else {
            return method.invoke(targetObj, args);
        }
        return null;
    }
}
