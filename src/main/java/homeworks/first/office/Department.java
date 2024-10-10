package homeworks.first.office;

import lombok.Getter;

import java.beans.ConstructorProperties;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Department {
    private final String name;
    private Boss boss;
    private List<Person> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public List<Person> getEmployees() {
        return new ArrayList<>(employees);
    }

    public void setBoss(Person person) {
        if (boss != null && !boss.equals(person) && boss.isLive())
            throw new IllegalArgumentException("You must kill another boss before you stay a new boss");
        if (boss != null && !boss.equals(person) && !boss.isLive()) {
            System.out.println(STR."теперь \{(Boss) person} т.к. \{boss.getName()} умер");
        }
        if (boss != null && boss.equals(person) && boss.isLive())
            throw new IllegalArgumentException("You already boss this department, you may die");
        if (boss != null && boss.equals(person) && !boss.isLive())
            throw new IllegalArgumentException("I just joke, bro...");

        employees.remove(person);

        if (person instanceof Employee)
            person = new Boss(person);
        boss = (Boss)person;
        boss.setDepartment(this);
        employees.add(boss);
    }

    public void addEmployee(Employee... persons) {
         for (Employee person : persons) {
             if (employees.contains(person)) throw new IllegalArgumentException(STR."person already work in \{this}");
             employees.add(person);
             person.setDepartment(this);
         }
    }
    public void fireEmployee(Employee employee) {
        employees.remove(employee);
    }


    @Override
    public String toString() {
        return name;
    }
}
