package proxypattern.hiding_feature;

/**
 * This interface will contain just those methods
 * that you want the proxy to provide access to
 */
public interface GetAtmFutsuData {

    public String getAtmState();

    public int getCashInAtmMachine();
}
