package proxypattern.transactionmanagement;

import java.util.ArrayList;
import java.util.List;

public class UsingRegularProxy<T> {
    public DbOperation delegate;

    UsingRegularProxy(DbOperation delegate) {
        this.delegate = delegate;
    }

    public void save() {
        try {
            System.out.println("Saving data ....");
            delegate.save();
            System.out.println("Data saved successfully.");
        } catch (RuntimeException e) {
            System.out.println("»»»»»»»»»»»» rolling back «««««««««««");
        }
    }

    public List<T> show() {
        try {
            System.out.println("Fetching data.....");
            return delegate.show();
        } catch (RuntimeException e) {
            System.out.println("»»»»»»»»»»»» cant reach db «««««««««««");
            return new ArrayList<>();
        }
    }

}
