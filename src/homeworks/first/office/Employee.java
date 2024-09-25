package homeworks.first.office;

public class Employee {
    String name;
    Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        if (this == department.boss) return name + " начальник " + department + "а";
        return name + " работает в "+ department +"e, начальник которого " + department.boss.name;
    }
}
