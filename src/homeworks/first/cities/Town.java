package homeworks.first.cities;

import java.util.ArrayList;
import java.util.List;


public class Town {
    public String name;
    public List<Road> roads = new ArrayList<>();

    public Town(String name) {
        this.name = name;
    }

    public Town addRoad(Road road) {

        if (!roads.contains(road)) roads.add(road);

        if (!road.isTwoSides) return this;

        if (!road.targetTown.roads.contains(road)) // TODO - сделать норм проверку
            road.targetTown.roads.add(new Road(this, road.cost, true));

        return this;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder("Town is ");
        out.append(name).append(":\n");
        for (Road road : roads) {
            out.append(road).append("\n");
        }
        return out.toString();
    }
}

