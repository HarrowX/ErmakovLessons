package homeworks.first.cities;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    @Getter
    private List<Road> roads = new ArrayList<>();
    private List<Road> roadsTo;
    @Getter
    private Town currentTown;


    public void setCurrentTown(Town currentTown) {
        this.currentTown = currentTown;
        initRoadsTo(currentTown);
    }

    public Graph print() {
        System.out.println(this);
        return this;
    }
    public Graph to(int index) {
         Road road = roadsTo.get(index);
         setCurrentTown(road.to);
         return road.to.getGraph();
    }

    private void checkAndAddRoadTo(Road road, Town town) {
        if (road.getFrom().canEqual(town)) roadsTo.add(road);
    }
    private void initRoadsTo(Town town) {
        roadsTo = new ArrayList<>();
        for (Road road : roads) {
            checkAndAddRoadTo(road, town);
        }
    }
    private Graph addRoad(Road road) {
        roads.add(road);
        checkAndAddRoadTo(road, currentTown);
        if (road.to.getGraph() == null) road.to.setGraph(this);
        return this;
    }
    public Graph addRoad(Town from, Town to, int cost) {
        if (!roads.contains(new Road(from, to, cost)))
            return addRoad(new Road(from, to, cost));
        throw new IllegalArgumentException("Road must be only one");
    }
    public Graph addRoad(Town from, Town to, int cost, boolean isTwoSides) {

        if (isTwoSides) return addRoadTwice(from, to, cost);
        return addRoad(from, to, cost);
    }
    private Graph addRoadTwice(Town from, Town to, int cost) {
        return addRoad(from, to, cost).addRoad(to, from, cost);
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder(currentTown.toString());
        out.append("\n");
        for (Road road : roadsTo) {
            out.append('\t').append(road).append('\n');
        }
        return out.toString();
    }
    @Getter @EqualsAndHashCode
    public static class Road {
        private Town from, to;
        private int cost;

        public Road(Town from, Town to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }


        @Override
        public String toString() {
            return from +
                    " - " + to +
                    " : " + cost;
        }
    }
}
