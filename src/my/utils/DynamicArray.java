package my.utils;

public class DynamicArray {
    public int[] array = new int[SIZE_EXTEND];
    public int length;
    private static final int SIZE_EXTEND = 32;

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
        int countExtend = length / SIZE_EXTEND + 1;
        int[] copyArray = new int[array.length];
        System.arraycopy(array, 0, copyArray, 0, array.length);
        array = new int[countExtend * SIZE_EXTEND];
        System.arraycopy(copyArray, 0, array, 0, copyArray.length);
    }

    public DynamicArray append(int number) throws Exception {
        return insert(number, length);
    }

    public DynamicArray unshift(int number) throws Exception {
        return insert(number, 0);
    }

    public DynamicArray insert(int number, int destPos) throws Exception {
        return insertValuesFromArray(new int[]{number}, destPos);
    }

    public DynamicArray insertValuesFromArray(int[] array, int destPos) throws Exception {
        if (destPos > this.array.length) {
            throw new Exception("insert cant be doing out array.");
        }
        shift(destPos, array.length);
        for (int i = destPos, j = 0; j < array.length; i++, j++) {
            this.array[i] = array[j];
        }
        return this;
    }

    private void shift(int srcPos, int count) {
        extendArray(length + count);
        for (int i = length - 1; i - count >= srcPos ; i--) {
            array[i] = array[i - count];
        }
    }

    @Override
    public String toString() {
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
