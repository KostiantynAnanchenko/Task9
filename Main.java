package org.example;

public class Main {
    public static void main(String[] args) {

        MyArrayList test = new MyArrayList();

        test.add("first");
        test.add("second");
        test.add("third");


        test.remove(0);

        System.out.println(test.size());
        System.out.println(test.get(1));

        test.clear();
        System.out.println(test.size());


    }
}