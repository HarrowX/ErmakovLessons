package homeworks.first.people;

public class Human {
    public Name name;
    public int height;

    public Human father;

    public Human(Name name, int height) {
        this.name = name;
        this.height = height;
    }

    public void setFather(Human father) {
        this.father = father;
        correctDataRelationship();
    }


    public void correctDataRelationship() {
        if (father != null) {
            if (name.surname == null && father.name.surname != null) name.surname = father.name.surname;
            if (name.patronymic == null && father.name.name != null) name.patronymic = father.name.name + "ович";
        }
    }

    @Override
    public String toString() {
        String out = "Человек с именем ";
        if (name != null) out += name;
        else out += "Анонимус";
        out += " и ростом " + height;
        return out;
    }
}

class TestHuman {
    public static void main(String[] args) {
//        test1();
        test2();
    }

    public static void test1() {
        Name name1 = new Name("Клеопатра",
                null,
                null);

        Name name2 = new Name("Александр",
                "Сергеевич",
                "Пушкин");

        Name name3 = new Name("Владимир",
                null,
                "Маяковский");

        Human person1 = new Human(name1, 152);
        Human person2 = new Human(name2, 167);
        Human person3 = new Human(name3, 189);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }

    public static void test2() {
        Name name1 = new Name("Иван",
                "Чудов",
                null);

        Name name2 = new Name("Петр",
                "Чудов",
                null);

        Name name3 = new Name("Борис",
                null,
                null);

        Human person1 = new Human(name1, 152);
        Human person2 = new Human(name2, 167);
        Human person3 = new Human(name3, 189);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        System.out.println();

        person2.setFather(person1);
        person3.setFather(person2);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}

