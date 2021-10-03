package com.vitsolutions.javatutions.exceptionhandling.errorprograms;

public class OutOfMemoryError {

    public void generateOOmError() throws InterruptedException {
        int itrVal = 20;
        for(int i = 0; i < 20 ; i++){
            int[] arr = new int[itrVal];
            arr[0] = 1;
            System.out.println("Iteration -> "+ itrVal+"  Free space"+ Runtime.getRuntime().freeMemory());
            Thread.sleep(1000);
            itrVal = itrVal * 5;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        OutOfMemoryError outOfMemoryError = new OutOfMemoryError();
        outOfMemoryError.generateOOmError();
    }

}
