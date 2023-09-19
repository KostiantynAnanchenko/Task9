package org.example;

public class MyQueue {
    private class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;
    private int size;


    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }


    public void add(Object value) {
        Node newNode = new Node(value);
        if (size == 0) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }


    public void clear() {
        front = null;
        rear = null;
        size = 0;
    }


    public int size() {
        return size;
    }


    public Object peek() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return front.data;
    }


    public Object poll() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        Object value = front.data;
        front = front.next;
        size--;
        if (size == 0) {
            rear = null;
        }
        return value;
    }

}