package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList();
        animals.add("cat");
        animals.add("mouse");
        animals.add("dog");
        animals.add("bird");

        for (String i: animals
             ) {
            System.out.println(i);
        }
    }
}