package homeworks.first.cities;

public class Road {
    Town targetTown;
    int cost;

    boolean isTwoSides;

    public Road(Town targetTown, int cost) {
        this(targetTown, cost, false);
    }

    public Road(Town targetTown, int cost, boolean isTwoSides) {
        this.targetTown = targetTown;
        this.cost = cost;
        this.isTwoSides = isTwoSides;
    }

    @Override
    public String toString() {
        return "to "+ targetTown.name + " - " + cost + " cost";
    }

}