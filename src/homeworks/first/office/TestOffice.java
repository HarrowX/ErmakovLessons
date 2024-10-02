package homeworks.first.office;



public class TestOffice {
    public static void main(String[] args) {
        Department department = new Department("IT отдел");

        Employee person1 = new Employee("Петров", department);
        Employee person2 = new Employee("Козлов", department);
        Employee person3 = new Employee("Сидоров", department);

        department.setBoss(person2);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        System.out.println(person1.getColleagues());
    }
}
