package com.vitsolutions.javatutions.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowDemo {

    public void readFile(String filePath) throws FileNotFoundException{
        File file = new File(filePath);
        FileInputStream inputStream = new FileInputStream(file);
    }

    public static void main(String[] args) {
        ThrowDemo t1 = new ThrowDemo();
        try {
            t1.readFile("c:/data/test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("// hey guys please upload the file correctly");
        }

        ThrowDemo t2 = new ThrowDemo();
        try {
            t2.readFile("c:/data/check.txt");
        } catch (FileNotFoundException e) {
            System.out.println("// Give the file name correctly, file not found");
        }

        ThrowDemo t3 = new ThrowDemo();
        try {
            t3.readFile("c:/data/Heck.txt");
        } catch (FileNotFoundException e) {
            System.out.println("// File not found");
        }

    }
}
