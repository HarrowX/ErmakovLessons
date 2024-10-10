package homeworks.first.cities;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.experimental.FieldNameConstants;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode
@Getter @Setter
@ToString()
public class Town {
    @ToString.Include
    private String name;
    @ToString.Exclude
    private Graph graph;

    public Town(String name) {
        this(name, null);
    }

    public Town(String name, Graph graph) {
        this.name = name;
        this.graph = graph;
    }
    public void print() {
        System.out.println(this);
    }

    public List<Graph.Road> getRoads() {
        List<Graph.Road> roads = new ArrayList<>();
        for (Graph.Road road : graph.getRoads()) {
            if (road.getFrom() == this) roads.add(road);
        }
        return roads;
    }
}

