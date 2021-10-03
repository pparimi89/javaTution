package com.vitsolutions.javatutions.exceptionhandling.errorprograms;

public class StackOverFlowError {

    public static void test(int i){
        System.out.println("Method called");
        test(10);
    }

    public static void main(String[] args) {
        StackOverFlowError.test(20);
    }

}
