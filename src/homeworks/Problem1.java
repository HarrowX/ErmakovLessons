package homeworks;

public class Problem1 {
    public static int[] addNumber2End(int[] array, int number) {
        int[] extendedArray = new int[array.length + 1];
        System.arraycopy(array, 0, extendedArray, 0, array.length);
        extendedArray[array.length] = number;
        return extendedArray;
    }
    public static void replaceNumber(int[] array, int destPos, int number) {
        array[destPos] = number;
    }

}
