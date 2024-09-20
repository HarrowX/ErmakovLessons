import my.utils.DynamicArray;
import my.utils.Parser;

public class Main {
    public static void main(String[] args) {

        int[] array = Parser.getArrayFromArgs(args);

        DynamicArray array1 = new DynamicArray(array);
        DynamicArray array2 = new DynamicArray(array);

        array1.append(6);
        System.out.println(array1.array2String());
        array2.insert(-2, 1);
        System.out.println(array2.array2String());

    }
}