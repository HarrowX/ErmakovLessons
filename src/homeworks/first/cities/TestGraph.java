package homeworks.first.cities;

public class TestGraph {
    public static void main(String[] args) {
        Town A = new Town("A");
        Town B = new Town("B");
        Town C = new Town("C");
        Town D = new Town("D");
        Town E = new Town("E");
        Town F = new Town("F");

        Graph map = new Graph();
        map.setCurrentTown(A);
        map.addRoad(A, B, 5, true)
                .addRoad(A, F, 1)
                .addRoad(A, D, 6, true)
                .addRoad(F, B, 1)
                .addRoad(F, E, 2, true)
                .addRoad(D, E, 2)
                .addRoad(C, D, 4, true)
                .addRoad(B, C, 3, true);

        map.print()
                .to(0).print()
                .to(1).print()
                .to(0).print()
                .to(1).print()
                .to(0).print();


    }
}
