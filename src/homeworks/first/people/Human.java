package homeworks.first.people;

public class Human {
    public Name name;
    public int height;

    public Human father;

    public Human(String name, int height) {
        this(name, height, null);
    }

    public Human(String name, int height, Human father) {
        this(new Name(name), height, father);
    }

    public Human(Name name, int height) {
        this(name, height, null);
    }

    public Human(Name name, int height, Human father) {
        this.name = name;
        this.height = height;
        setFather(father);
    }

    public void setFather(Human father) {
        this.father = father;
        correctDataRelationship();
    }


    public void correctDataRelationship() {
        if (father == null) return;
        if (name.surname == null && father.name.surname != null) name.surname = father.name.surname;
        if (name.patronymic == null && father.name.name != null) name.patronymic = father.name.name + "ович";

    }

    public String getName() {
        if (name.name != null) return name.name;
        return "";
    }

    public String getSurName() {
        if (name.surname != null) return name.surname;
        if (father != null) return father.getSurName();
        return "";
    }

    public String getPatronymic() {
        if (name.patronymic != null) return name.patronymic;
        if (father != null) return father.getName();
        return "";
    }

    @Override
    public String toString() {
        return (getName() + " " + getSurName() + " " + getPatronymic().trim()) + ", " + height;
    }
}

class TestHuman {
    public static void main(String[] args) {
        Human p1 = new Human("Лев", 170);
        Human p2 = new Human(new Name("Сергей","Пушкин"), 168, p1);
        Human p3 = new Human("Александр", 167, p2);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}

