package proxypattern.hiding_feature;

public class AtmMachineProxy implements GetAtmFutsuData {
    AtmMachine atm = new AtmMachine();

    @Override
    public String getAtmState() {
        return atm.getAtmState();
    }

    @Override
    public int getCashInAtmMachine() {
        return atm.getCashInAtmMachine();
    }
}
