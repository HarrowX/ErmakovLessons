package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

    public String name;
    public List<Integer> marks = new ArrayList<>();

    public Student(String name) {
        this.name = name;
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
        Student student1 = new Student("Вася");
        Student student2 = new Student("Петя");
        Student student3 = new Student("Андрей");
        int[] marks = new int[]{3, 4, 5};


        student1.setMarks(marks);
        student2.marks = student1.marks;
        student3.setMarks(Arrays.copyOf(marks, marks.length));

        marks[0] = 5;

        System.out.println(student1);
        System.out.println(student2);


        System.out.println(student3);
    }
}