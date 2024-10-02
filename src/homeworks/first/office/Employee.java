package homeworks.first.office;

import java.util.List;

public class Employee {
    public String name;
    public Department department;


    public Employee(String name) {
        this.name = name;
    }

    public void setDepartment(Department department) {
        this.department = department;
        department.employees.add(this);
    }

    public Employee(String name, Department department) {
        this(name);
        setDepartment(department);
    }
    public List<Employee> getColleagues() {
        return department.getEmployees();
    }

    @Override
    public String toString() {
        if (this == department.boss) return name + " начальник " + department + "а";
        return name + " работает в "+ department +"e, начальник которого " + department.boss.name;
    }
}
