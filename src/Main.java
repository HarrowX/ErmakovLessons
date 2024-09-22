import my.utils.DynamicArray;
import my.utils.Parser;

public class Main {
    public static void main(String[] args) {

        int[] array = Parser.getArrayFromArgs(args);

        DynamicArray array1 = new DynamicArray(array);

        System.out.println(array1.stringify() + " -> " + array1.append(6).stringify());
        System.out.println(array1.stringify() + " -> " + array1.append(7).stringify());
        System.out.println(array1.stringify() + " -> " + array1.shift(-1).stringify());
        System.out.println(array1.stringify() + " -> " + array1.shift(-2).stringify());
        System.out.println(array1.stringify() + " -> " + array1.insert(-2, 4).stringify());
        System.out.println(array1.stringify() + " -> " + array1.insert(3, 3).stringify());

        System.out.println(array1.at(-1));
        System.out.println(array1.at(0));
    }
}