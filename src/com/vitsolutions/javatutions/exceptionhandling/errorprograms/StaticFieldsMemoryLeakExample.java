package com.vitsolutions.javatutions.exceptionhandling.errorprograms;

import java.util.ArrayList;
import java.util.List;

public class StaticFieldsMemoryLeakExample {
    private static List<Integer> integers = new ArrayList<>();
    private static List<Integer> integers2 = new ArrayList<>();

    public void insertIntegers() {
        for (int i = 0; i < 100000000; i++) {
            integers.add(i);
        }
        System.out.println("Added");
        for (int i = 0; i < 100000000; i++) {
            integers2.add(i);
        }
        System.out.println("Added");

    }

    public static void main(String[] args) {
        new StaticFieldsMemoryLeakExample().insertIntegers();
    }
}