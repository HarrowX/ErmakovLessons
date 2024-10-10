package homeworks.first.office;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Employee extends Person {
    private Department department;
    public Employee(String name) {
        super(name);
    }

    public Employee(Person person) {
        super(person);
    }

    @Override
    public String toString() {
        return STR."\{super.toString()}работает в \{department}e";
    }
}
