package homeworks.first.office;

import java.util.ArrayList;
import java.util.List;

public class Department {
    public String name;
    public Employee boss;
    public List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void setBoss(Employee boss) {
        this.boss = boss;
    }

    @Override
    public String toString() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
