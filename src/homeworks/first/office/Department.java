package homeworks.first.office;

public class Department {
    String name;
    Employee boss;

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
}
