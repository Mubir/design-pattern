package proxypattern.hiding_feature;

public class exposeOnlyWhatNecessary {
    public static void main(String[] args) {
        /** NEW STUFF : Proxy Design Pattern Code
         The interface limits access to just the methods you want
         made accessible
         */

        GetAtmFutsuData getDataForRefill = new AtmMachineProxy();
        System.out.println(getDataForRefill.getAtmState());
        System.out.println(getDataForRefill.getCashInAtmMachine());
        // do not have access to harmful method.

    }
}
