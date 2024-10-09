package homeworks;

import java.util.ArrayList;
import java.util.List;

public class Student {

    public String name;
    public List<Integer> marks = new ArrayList<>();

    public Student(String name) {
        this(name,new int[0]);
    }

    public double getAvgMarks() {
        if (marks.isEmpty()) {
            return 0;
        }
        double avg = 0;
        for (Integer mark : marks) {
            avg += mark;
        }
        avg /= marks.size();
        return avg;
    }

    public Student(String name, int... marks) {
        this.name = name;
        setMarks(marks);
    }

    public void setMarks(int... marks) {
        for (int mark : marks) {
            this.marks.add(mark);
        }
    }

    @Override
    public String toString() {
        return name + ": " + marks;
    }

}

class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Вася", 3, 4, 5);
        Student student2 = new Student("Максим");

        System.out.println(student1);
        System.out.println(student2);
    }
}