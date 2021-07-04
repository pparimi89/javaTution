package com.vitsolutions.javatutions.cse;

import com.vitsolutions.javatutions.eee.Empl;
import com.vitsolutions.javatutions.examcell.ExamLocation;

public class Lecturer extends Empl{

    Lecturer(){
        super();
    }

    void printLeturenrEmp(){
        printEmployee();
        System.out.println("Lecturer--->>> "+marks);
    }

    public static void main(String[] args) {
        //Empl empl = new Empl();
        Lecturer lecturer = new Lecturer();
        lecturer.printLeturenrEmp();
        lecturer.printEmployee();

    }
}
