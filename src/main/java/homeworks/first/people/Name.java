package homeworks.first.people;

import lombok.Getter;
import lombok.Setter;

public class Name {
    @Getter @Setter
    private String name, surname, patronymic;


    public Name(String name) {
        this(name, null, null);
    }

    public Name(String name, String surname) {
        this(name, surname, null);
    }

    public Name(String name, String surname, String patronymic) {
        if (name == null && surname == null && patronymic == null) throw new IllegalArgumentException("name must be have more then 0 arg");
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        String out = "";

        if (surname != null) out += surname + " ";
        if (name != null) out += name + " ";
        if (patronymic != null) out += patronymic;

        return out.trim();
    }
}

class TestName {

    public static void main(String[] args) {
        Name person1 = new Name("Клеопатра");

        Name person2 = new Name("Александр",
                "Пушкин",
                "Сергеевич"
        );

        Name person3 = new Name("Владимир",
                "Маяковский");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
