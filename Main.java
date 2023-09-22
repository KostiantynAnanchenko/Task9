package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- MyArrayList test ---");

        MyArrayList testArr = new MyArrayList();

        testArr.add("Rick");
        testArr.add("Jerry");
        testArr.add("Morty");

        System.out.println(testArr.size());

        testArr.remove(0);

        System.out.println(testArr.size());

        System.out.println(testArr.get(1));

        testArr.clear();
        System.out.println(testArr.size());



        System.out.println("--- MyLinkedList test ---");

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



        System.out.println("--- MyQueue test ---");

        MyQueue testQueue = new MyQueue();

        testQueue.add("Rick");
        testQueue.add("Jerry");
        testQueue.add("Morty");
        System.out.println(testQueue.size());

        System.out.println(testQueue.peek());

        System.out.println(testQueue.poll());
        System.out.println(testQueue.size());

        testQueue.clear();
        System.out.println(testQueue.size());



        System.out.println("--- MyStack test ---");

        MyStack testStack =new MyStack();

        testStack.push("Rick");
        testStack.push("Jerry");
        testStack.push("Morty");

        System.out.println(testStack.size());

        testStack.remove(1);
        System.out.println(testStack.size());

        System.out.println(testStack.peek());

        System.out.println(testStack.pop());
        System.out.println(testStack.size());

        testStack.clear();
        System.out.println(testStack.size());


        System.out.println("--- MyHashMap test ---");

        MyHashMap testHash = new MyHashMap();

        testHash.put(234,"Rick");
        testHash.put(70,"Jerry");
        testHash.put(120,"Morty");

        System.out.println(testHash.size());

        System.out.println(testHash.get(234));

        testHash.remove(70);
        System.out.println(testHash.size());

        testHash.clear();
        System.out.println(testHash.size());


    }
}