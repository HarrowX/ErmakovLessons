package homeworks;

import lombok.Getter;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

public class Student {

    @Getter @NonNull
    private String name;
    @Getter()
    private final List<Integer> marks = new ArrayList<>();

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
    public boolean isExcellent() {
        return Math.round(getAvgMarks()) == 5;
    }
    public Student(String name, int... marks){
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name must be not empty");
        this.name = name;
        for (int mark : marks) {
            addMark(mark);
        }
    }
    public void addMark(int mark) {
        if(mark < 2 || mark > 5) throw new IllegalArgumentException("Mark must be 2, 3, 4 or 5");
        this.marks.add(mark);
    }

    @Override
    public String toString() {
        return name + ": " + marks;
    }

}

class TestStudent {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student("Вася", 3, 4, 5);
        Student student2 = new Student("Максим");

        System.out.println(student1);
        System.out.println(student2);
    }
}