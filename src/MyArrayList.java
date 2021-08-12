import java.util.Arrays;

public class MyArrayList {
    private Object[] array = new Object[10];
    private int size = 0;

    void add(Object item) {
//        Object[] newArray = new Object[array.length+1];
//        System.arraycopy(array,0,newArray,0,array.length);
        if (array.length == size) {
            resize(array.length + 10);
        }

        // array = Arrays.copyOf(array, array.length + 10);

        array[size++] = item;
    }

    private void resize(int newSize) {
        array = Arrays.copyOf(array, newSize);
    }

    void add(int index, Object item) {
        if (array.length == size) {
            resize(array.length + 10);
        }

        //Object[] newArray = new Object[array.length + 1];
        //System.arraycopy(array, 0, array, 0, index);
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = item;
        size++;
    }

    int size() {
        return size;
    }

}
