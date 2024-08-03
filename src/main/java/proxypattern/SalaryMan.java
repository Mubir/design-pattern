package proxypattern;

public class SalaryMan implements Employee {
    @Override
    public void create(String name, int empId) {
        System.out.printf("A new salary man %s is crated\n", name);
    }

    @Override
    public void delete(int empId) {
        System.out.printf("%d ur fired\n", empId);
    }

    @Override
    public String getName(int empId) {
        System.out.println("<<<--  -->>>");
        return "";
    }
}
