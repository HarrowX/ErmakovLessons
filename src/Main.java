import my.utils.DynamicArray;
import my.utils.Parser;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] array = Parser.parseConsoleArgsToArrayInt(args);

        DynamicArray array1 = new DynamicArray(array);

        // TODO - обернуть это говно в тесты
        System.out.println(array1 + " -> " + array1.append(6));
        System.out.println(array1 + " -> " + array1.append(7));
        System.out.println(array1 + " -> " + array1.unshift(-1));
        System.out.println(array1 + " -> " + array1.unshift(-2));
        System.out.println(array1 + " -> " + array1.insert(-2, 4));
        System.out.println(array1 + " -> " + array1.insert(3, 3));
        System.out.println(array1 + " -> " + array1.insertValuesFromArray(new int[]{1, 2, 3, 4, 5, 6,  7, 8, 9, 10}, 2));

        System.out.println(array1.at(-1));
        System.out.println(array1.at(0));
    }
}