package my.utils;

public class DynamicArray {
    public int[] array = new int[32];
    public int length;
    private static final int sizeExtend = 32;

    public int at(int index) {
        if (index < 0) index = length + index;
        return array[index];
    }

    public DynamicArray(int[] array) {
        extendArray(array.length);
        System.arraycopy(array, 0, this.array, 0, array.length);
    }

    private void extendArray(int length) {
        this.length = length;
        if (length <= array.length) return;
        System.out.println("log: " + array.toString() + " start to extend");
        int countExtend = length / sizeExtend + 1;
        int[] copyArray = new int[array.length];
        System.arraycopy(array, 0, copyArray, 0, array.length);
        array = new int[countExtend * sizeExtend];
        System.arraycopy(copyArray, 0, array, 0, copyArray.length);
        System.out.println("log: " + array.toString() + " was been extended");
    }

    public DynamicArray append(int number) {
        return insert(number, length);
    }

    public DynamicArray shift(int number) {
        return insert(number, 0);
    }

    public DynamicArray insert(int number, int destPos) {
        extendArray(length + 1);
        for (int i = length - 1; i > destPos; i--) {
            array[i] = array[i - 1];
        }
        array[destPos] = number;
        return this;
    }

    public String stringify() {
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
