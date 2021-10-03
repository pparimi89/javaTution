package com.vitsolutions.javatutions.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchDemo {

    public static void main(String[] args) {
        try{
            File file = new File("c:/data/test.txt");
            FileInputStream inputStream = new FileInputStream(file);
        }catch(FileNotFoundException ex){
            System.out.println(ex);
            System.out.println("File is not available in the location, please verify the location");
        }
    }

}
