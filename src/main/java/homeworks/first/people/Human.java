package homeworks.first.people;

import lombok.Getter;

public class Human {
    private Name name;
    @Getter
    private int height;

    public void setHeight(int height) {
        if (height > 500 || height < 0) throw new IllegalArgumentException("height must be in range 1 to 499");
        this.height = height;
    }

    @Getter
    private Human father;

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

    private void setFather(Human father) {
        this.father = father;
        correctDataRelationship();
    }


    public void correctDataRelationship() {
        if (father == null) return;
        if (name.getSurname() == null && father.name.getSurname() != null) name.setSurname(father.name.getSurname());
        if (name.getPatronymic() == null && father.name.getName() != null) name.setPatronymic(father.name.getName() + "ович");

    }

    public String getName() {
        if (name.getName() != null) return name.getName();
        return "";
    }
    public Name getObjectName() {
        return name;
    }

    public String getSurName() {
        if (name.getSurname() != null) return name.getSurname();
        if (father != null) return father.getSurName();
        return "";
    }

    public String getPatronymic() {
        if (name.getPatronymic() != null) return name.getPatronymic();
        if (father != null) return father.getName();
        return "";
    }

    @Override
    public String toString() {
        return (getName() + " " + getSurName() + " " + getPatronymic()).trim() + ", " + height;
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

