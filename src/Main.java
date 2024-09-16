import homeworks.Problem1;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}, extendedArray;
        extendedArray = Problem1.addNumber2End(array, 6);
        printArray(extendedArray);
        Problem1.replaceNumber(array, 1, -2);
        printArray(array);
    }


    public static void printArray(int[] array) {
        if (array.length == 0) return;
        StringBuilder out = new StringBuilder("{");
        out.append(array[0]);
        for (int i = 1; i < array.length; i++) {
            out.append(", ").append(array[i]);
        }
        out.append("}");
        System.out.println(out);
    }
}