package org.example;

public class MyStack {
    private Object[] array;
    private int size;


    public MyStack() {
        array = new Object[0];
        size = 0;
    }

    private void increaseArray() {
        int newSize = array.length + 1;
        Object[] newArray = new Object[newSize];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    private void decreaseArray() {
        int newSize = array.length -1;
        Object[] newArray = new Object[newSize];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }


    public void push(Object value) {
        increaseArray();
        array[array.length-1] = value;
        size++;
    }

    public Object pop() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        Object value = array[array.length-1];
        size--;
        decreaseArray();
        return value;
    }


    public Object peek() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[array.length-1];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Wrong index");
        }

        int elementsToMove = size - index - 1;
        if (elementsToMove > 0) {
            System.arraycopy(array, index + 1, array, index, elementsToMove);
        }

        size--;

        decreaseArray();
    }


    public void clear() {
        array = new Object[0];
        size = 0;
    }

    public int size() {
        return size;
    }


}
