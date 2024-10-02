package homeworks.first.people;

public class Name {
    public String name;
    public String surname;
    public String patronymic;

    public Name(String name, String surname, String patronymic) {
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
        Name person1 = new Name("Клеопатра",
                null,
                null);

        Name person2 = new Name("Александр",
                "Пушкин",
                "Сергеевич"
        );

        Name person3 = new Name("Владимир",
                "Маяковский",
                null);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
