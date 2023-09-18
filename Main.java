package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------------------------------- MyArrayList test");

        MyArrayList testArr = new MyArrayList();            // MyArrayList test

        testArr.add("first");
        testArr.add("second");
        testArr.add("third");

        System.out.println(testArr.size());

        testArr.remove(0);

        System.out.println(testArr.size());

        System.out.println(testArr.get(1));

        testArr.clear();
        System.out.println(testArr.size());

        System.out.println("----------------------------------- MyLinkedList test");

        MyLinkedList testLink = new MyLinkedList();

        testLink.add("Rick");
        testLink.add("Jerry");
        testLink.add("Morty");
        System.out.println(testLink.size());

        testLink.remove(1);
        System.out.println(testLink.size());

        System.out.println(testLink.get(1));

        testLink.clear();
        System.out.println(testLink.size());

        System.out.println("----------------------------------- MyQueue test");


    }
}