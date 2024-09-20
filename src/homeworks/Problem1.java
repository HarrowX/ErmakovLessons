package homeworks;

public class Problem1 {
    public static int[] add(int[] array, int number) {
        return add(array, array.length, number);
    }
    public static int[] add(int[] array, int destPos, int number) {
        int[] extendedArray = new int[array.length + 1];

        System.arraycopy(array, 0,  extendedArray, 0, destPos);
        extendedArray[destPos] = number;
        System.arraycopy(array, destPos,  extendedArray, destPos + 1, array.length - destPos);

        return extendedArray;
    }

}
