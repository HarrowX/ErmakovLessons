package homeworks.first.office;

import homeworks.first.Gun;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
public class Boss extends Person {
    private Gun gun = null;
    private boolean hasGun = false;
    @Setter
    private Department department;

    public void takeGun(Gun gun) {
        this.gun = gun;
        hasGun = true;
    }

    public Boss(String name) {
        super(name);
    }

    public Boss(Person person) {
        super(person);
    }

    public boolean killEmployee(Employee employee) {
        if (!employee.getDepartment().equals(department))
            throw new IllegalArgumentException();
        if (!hasGun)
            throw new IllegalArgumentException();
        if (gun.fire()) {
            System.out.println(STR."\{getName()} убивает \{employee.getName()}");
            employee.die();
            System.out.println(STR."\{employee.getName()} больше не работает в \{department}e по состоянию здоровья");
            department.fireEmployee(employee);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return STR."\{super.toString()}он начальник \{department}а";
    }

    public void reloadGun() {
        if (!hasGun)
            throw new IllegalArgumentException();
        gun.reload();

    }
}
