package proxypattern.dynamicproxy.logging;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class LoggingHandler implements InvocationHandler {
    private final Object target;

    private Map<String, Integer> callCounter = new HashMap<>();

    public LoggingHandler(Object target) {
        this.target = target;
    }

    /**
     * Get to call the `method` of `proxy` object with `args` arguments
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String name = method.getName();
        callCounter.merge(name, 1, Integer::sum);
        if (name.contains("toString")) {
            return callCounter.toString();
        }
        try {
            return method.invoke(target, args);
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }

    }
}
