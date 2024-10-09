package homeworks.first.cities;


public class Town {
    private String name;
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

    public Graph getGraph() {
        return graph;
    }

    public void setGraph(Graph graph) {
        this.graph = graph;
    }

    @Override
    public String toString() {
        return name ;
    }
}

