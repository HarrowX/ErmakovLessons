package homeworks.first.cities;

class TestTown {
    public static void main(String[] args) {
        Town A = new Town("A"), B = new Town("B"), C = new Town("C"), D = new Town("D"), E = new Town("E"), F = new Town("F");

        A.addRoad(new Road(B, 5, true)).addRoad(new Road(F, 1)).addRoad(new Road(D, 6, true));
        D.addRoad(new Road(E, 2));
        F.addRoad(new Road(E, 2, true)).addRoad(new Road(B, 1));
        C.addRoad(new Road(D, 4, true)).addRoad(new Road(B,  3, true));

        System.out.println(A);
        System.out.println();
        System.out.println(B);
        System.out.println();
        System.out.println(C);
        System.out.println();
        System.out.println(D);
        System.out.println();
        System.out.println(E);
        System.out.println();
        System.out.println(F);


    }
}
