package proxypattern.transactionmanagement;

import java.util.List;

public interface DbOperation<T> {
    void save();

    List<T> show();
}
