package my.utils;

public class DynamicArray {
    public int[] array = new int[256];
    public int length;
    private static final int sizeExtend = 256;

    public DynamicArray(int[] array) {
        extendArray(array.length);
        System.arraycopy(array, 0, this.array, 0, array.length);
    }

    private void extendArray(int length) {
        this.length = length;
        if (length <= array.length) return;
        int countExtend = (length / sizeExtend + 1) * sizeExtend;
        int[] copyArray = new int[array.length];
        System.arraycopy(array, 0, copyArray, 0, array.length);
        array = new int[countExtend * sizeExtend];
        System.arraycopy(copyArray, 0, array, 0, copyArray.length);
    }

    public void append(int number) {
        insert(number, length);
    }

    public void insert(int number, int destPos) {
        if (array.length < length + 1) extendArray(length + 1);
        length++;
        for (int i = length - 1; i > destPos; i--) {
            array[i] = array[i-1];
        }
        array[destPos] = number;
    }
    public String array2String() {
        if (length == 0) return "{}";
        StringBuilder out = new StringBuilder("{");
        out.append(array[0]);
        for (int i = 1; i < length; i++) {
            out.append(", ").append(array[i]);
        }
        out.append("}");
        return out.toString();
    }
}
