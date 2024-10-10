package homeworks.first.office;


import homeworks.first.Gun;

public class TestOffice {
    public static void main(String[] args) {
        Department department = new Department("IT-отдел");

        Boss boss = new Boss("Мафиозник");
        department.setBoss(boss);

        Employee employee1 = new Employee("Алексей");
        Employee employee2 = new Employee("Сергей");

        department.addEmployee(employee1, employee2);

        System.out.println(boss);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(department.getEmployees());
        System.out.println();

        boss.takeGun(new Gun(1, 2));
        boss.killEmployee(employee1);

        System.out.println(boss);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(department.getEmployees());
        System.out.println();

        boss.killEmployee(employee2);

        System.out.println(boss);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(department.getEmployees());
        System.out.println();

        boss.reloadGun();
        boss.killEmployee(employee2);

        System.out.println(boss);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(department.getEmployees());
        System.out.println();

    }
}

