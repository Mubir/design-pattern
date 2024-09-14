package proxypattern.transactionmanagement;

public class Client {
    public static void main(String[] args) {
        useSimpleProxy();
    }

    public static void useSimpleProxy() {
        DbOperation customer = new CustomerService();
        UsingRegularProxy customerServiceProxy = new UsingRegularProxy<>(customer);

        customerServiceProxy.save();
        customerServiceProxy.show();
    }
}
