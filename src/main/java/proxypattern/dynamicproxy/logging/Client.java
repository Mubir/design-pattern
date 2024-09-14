package proxypattern.dynamicproxy.logging;

import java.lang.reflect.Proxy;

public class Client {
    /**
     * `Class<T>` is a way to refer to the type of a class at runtime.
     * When we pass a `Class<T>` as a parameter, we are typically passing
     * metadata about a class that allows us to perform operations on
     * the class itself, such as creating instances, accessing fields or
     * methods via reflection, or checking type information.
     * <p>
     * Usage:
     * »» Reflection: To dynamically create objects, invoke methods,
     * or access fields of a class.
     * »» Type Information: To pass type information at runtime,
     * especially in generic contexts.
     * <p>
     * ®®®®®®®®®®®®®®®®®®®® where as ®®®®®®®®®®®®®®®®®®
     * <p>
     * method(Interface obj) :
     * We are passing an object that implements that interface (or extends that class).
     * usage::
     * »» Concrete Object: You are dealing with a concrete object that you can
     * interact with directly (i.e., you can call methods on it).
     * »» Polymorphism: The method can accept any object that implements the
     * given interface, allowing for flexible and extensible design.
     * »» Dependency Management: The actual instance (often created elsewhere)
     * is injected, making the code easier to test and more modular.
     */
    public static <T> T withLogging(T target, Class<T> intrface) {
        return (T) Proxy.newProxyInstance(
                intrface.getClassLoader(),
                // Client.class.getClassLoader(),
                // Person.class.getClassLoader(),
                new Class<?>[]{intrface},
                new LoggingHandler(target)
        );
    }

    public static void main(String[] args) {
        Person person = new Person();
        Human logged = withLogging(person, Human.class);
        logged.talk();
        logged.walk();
        logged.talk();
        System.out.println(logged);
    }
}
