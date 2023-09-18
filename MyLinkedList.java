package org.example;

public class MyLinkedList {
    // Клас Node внутрішнього класу для представлення вузла списку
    private class Node {
        Object data;
        Node next;
        Node prev;

        Node(Object data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }


    public void add(Object value) {
        Node newNode = new Node(value);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Wrong index");
        }

        Node nodeToRemove = getNode(index);
        Node prevNode = nodeToRemove.prev;
        Node nextNode = nodeToRemove.next;

        if (prevNode != null) {
            prevNode.next = nextNode;
        } else {

            head = nextNode;
        }

        if (nextNode != null) {
            nextNode.prev = prevNode;
        } else {

            tail = prevNode;
        }

        size--;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Wrong index");
        }
        Node node = getNode(index);
        return node.data;
    }


    private Node getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Wrong index");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current;
    }


}
