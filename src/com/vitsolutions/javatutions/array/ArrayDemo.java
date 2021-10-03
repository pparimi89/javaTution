package com.vitsolutions.javatutions.array;

public class ArrayDemo {

    public static void main(String[] args) {

        int numbers[] = new int[100];
        numbers[0] = 3;
        numbers[1] = 20;
        numbers[2] = 15;
        numbers[50] = 30;

        System.out.println("Value at index 0 is :: "+numbers[0]);
        System.out.println("Value at index 1 is :: "+numbers[1]);
        System.out.println("Value at index 2 is :: "+numbers[2]);
        System.out.println("Value at index 2 is :: "+numbers[90]);
        //System.out.println("Value at index 2 is :: "+numbers[101]);


        for(int i = 0; i < numbers.length; i++){
            System.out.println("In for loop Value at index" + i + " is :: "+numbers[i]);
        }
    }

}
