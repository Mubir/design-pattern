package proxypattern;

public class SalaryManProxy implements Employee {
    SalaryMan mainObj;

    SalaryManProxy() {
        mainObj = new SalaryMan();
    }

    @Override
    public void create(String name, int empId) {
        System.out.println("Creating via proxy");
        mainObj.create(name, empId);
    }

    @Override
    public void delete(int empId) {
        System.out.println("Game over via proxy");
        mainObj.delete(empId);
    }

    @Override
    public String getName(int empId) {
        System.out.println("Fetching via proxy");
        return mainObj.getName(empId);
    }
}
