package com.vitsolutions.javatutions.cse;

import com.vitsolutions.javatutions.examcell.ExamLocation;
public class Department{
    public static void main(String[] args) {
        ExamLocation examLocation = new ExamLocation();
        examLocation.printExamCenter();
        //System.out.println(examLocation.test1); // You cant access private variable
        //examLocation.printCellName(); //// You cant access private method
        //System.out.println(examLocation.test1);
    }
}
