package homeworks.first;

public class Building {
    public int countFloor;

    public Building(int countFloor) {
        this.countFloor = countFloor;
    }

    @Override
    public String toString() {
        if (countFloor > 1) return "Здание с " + countFloor + " этажами";
        if (countFloor == 1) return "Здание с 1 этажом";
        return "здание с невалидным количеством этажей";
    }
}

class TestBuilding {
    public static void main(String[] args) {
        Building building1 = new Building(1);
        Building building2 = new Building(5);
        Building building3 = new Building(23);

        System.out.println(building1);
        System.out.println(building2);
        System.out.println(building3);
    }
}