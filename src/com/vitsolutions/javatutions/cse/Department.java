package com.vitsolutions.javatutions.cse;

import com.vitsolutions.javatutions.examcell.ExamLocation;
public class Department{
    public static void main(String[] args) {
        ExamLocation examLocation = new ExamLocation();
        examLocation.printExamCenter();
        int i = 0;
        long j = i;
        int k = (int)j;
        float t = 12.12345678f;
        double d2 = 12.12345678123456789898d;
        char ch = '0';
        char ch1 = 'A';
        System.out.println(t);
        System.out.println(d2);
        System.out.println(ch);
        System.out.println(ch1);

        //System.out.println(examLocation.test1); // You cant access private variable
        //examLocation.printCellName(); //// You cant access private method
        //System.out.println(examLocation.test1);
    }
}
