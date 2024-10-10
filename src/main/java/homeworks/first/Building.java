package homeworks.first;

import lombok.Getter;

public class Building {
    @Getter
    private final int countFloor;

    public Building(int countFloor) {
        if (countFloor <= 0) throw new IllegalArgumentException("count floors must be positive");
        this.countFloor = countFloor;
    }

    @Override
    public String toString() {
        if (countFloor > 1) return "Здание с " + countFloor + " этажами";
        return "Здание с 1 этажом";
    }
}

class TestBuilding {
    public static void main(String[] args) {
        Building building1 = new Building(2);
        Building building2 = new Building(35);
        Building building3 = new Building(91);

        System.out.println(building1);
        System.out.println(building2);
        System.out.println(building3);

        //building1.countFloor = 1;
    }
}