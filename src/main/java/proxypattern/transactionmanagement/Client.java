package proxypattern.transactionmanagement;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {

        // useSimpleProxy();
        useJDKProxy();
    }

    public static void useSimpleProxy() {
        DbOperation customer = new CustomerService();
        UsingRegularProxy customerServiceProxy = new UsingRegularProxy<>(customer);

        customerServiceProxy.save();
        customerServiceProxy.show().stream().forEach(System.out::println);
        ;
    }

    public static void useJDKProxy() {
        DbOperation customer = new CustomerService();
        JDKProxy jdkProxy = new JDKProxy<>(customer);
        DbOperation obj = (DbOperation) Proxy.newProxyInstance(
                CustomerService.class.getClassLoader(),
                new Class[]{DbOperation.class},
                jdkProxy
        );
        obj.save();
        obj.show().stream().forEach(System.out::println);
    }

}
