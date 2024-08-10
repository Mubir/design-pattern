package proxypattern.hiding_feature;

import java.util.ArrayList;
import java.util.List;

public class AtmMachine implements GetAtmFutsuData {

    String getSecretData() {
        return "Secret";
    }

    List<Integer> getPin() {
        return new ArrayList<>();
    }

    @Override
    public String getAtmState() {
        return "Active";
    }

    @Override
    public int getCashInAtmMachine() {
        return 786;
    }
}
