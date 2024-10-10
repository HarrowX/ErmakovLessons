package homeworks.first.office;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;

@Getter @EqualsAndHashCode
public abstract class Person {
    @NonNull
    private String name;
    private boolean isLive = true;

    public Person(String name) {
        if (name.isBlank()) throw new IllegalArgumentException("name must not be a blank");
        this.name = name;
    }
    public Person(Person person) {
        name = person.getName();
        isLive = person.isLive();
    }

    public void die() {
        isLive = false;
        System.out.println(STR."\{name} умерает");
    }

    @Override
    public String toString() {
        return STR."\{name} - \{isLive ? "жив и " : "мертв и больше не "}";
    }
}
