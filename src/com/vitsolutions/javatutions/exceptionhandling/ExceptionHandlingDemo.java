package com.vitsolutions.javatutions.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class UnchecedExceptionDemo{
    public void uncheckedException(){
        /**
         * Null pointer Exception causing scenario
         */
        String str = null;
        str.length();


        /**
         * Array index out of bound exception scenario
         */
        int[] arr = new int[2];
        System.out.println(arr[3]);

    }
}


public class ExceptionHandlingDemo {

    public static void main(String[] args) {
       //Checked Exception handling scenario
        /**
         * Here the fileinputstream constructor throws FileNotFoundException
         */
         File file = new File("c:/data/git");
       // FileInputStream fileInputStream = new FileInputStream(file);
        //fileInputStream.close();
    }
}
