package proxypattern;

public class Client {
    public static void main(String[] args) {
        //Employee mySalMan = new SalaryMan();

        Employee mySalMan = new SalaryManProxy();

        mySalMan.create("Nemesis", 666);
        mySalMan.delete(786);
        mySalMan.getName(666);
    }
}
