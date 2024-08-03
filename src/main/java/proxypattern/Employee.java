package proxypattern;

public interface Employee {
    void create(String name, int empId);

    void delete(int empId);

    String getName(int empId);
}
