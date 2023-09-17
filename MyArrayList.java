package org.example;

public class MyArrayList {

    private Object[] array;
    private int size;


    public MyArrayList() {
        array = new Object[0];
        size = 0;
    }

    private void increaseArray() {             // Increase array length by 1
        int newSize = array.length + 1;
        Object[] newArray = new Object[newSize];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }


    public void add(Object value) {
        increaseArray();
        array[size] = value;
        size++;
    }

    public void remove(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Wrong index");
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        array[size - 1] = null;
        size--;
    }

    public void clear() {
        array = new Object[0];
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Wrong index");
        }
        return array[index];
    }


}
