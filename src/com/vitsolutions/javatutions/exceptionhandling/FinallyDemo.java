package com.vitsolutions.javatutions.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyDemo {
    public static void main(String[] args) throws IOException {
        //Read input from Console.
        try{
            System.out.println("Enter Input value");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Integer number = Integer.parseInt(br.readLine());
            if(number <= 0){
                throw new IllegalArgumentException("Input Cannot be zero");
            }
            int result = 100/number;
            System.out.println("Output Value is ::: "+ result);
        }
        finally {
            System.out.println("Finally block is executed");
        }
    }
}
