package proxypattern.transactionmanagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerService implements DbOperation<Integer>{
    @Override
    public void save() {
        System.out.println("‡‡‡‡‡‡‡‡ save data ‡‡‡‡‡‡‡‡‡");
    }

    @Override
    public List<Integer> show() {
        return new ArrayList<Integer>(Arrays.asList(1,2,3,4));
    }
}
