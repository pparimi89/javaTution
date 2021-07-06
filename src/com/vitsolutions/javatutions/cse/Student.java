package com.vitsolutions.javatutions.cse;

import com.vitsolutions.javatutions.examcell.ExamLocation;
import static com.vitsolutions.javatutions.examcell.ExamLocation.printExamLocation;
import static com.vitsolutions.javatutions.examcell.ExamLocation.examCellName;
import com.vitsolutions.javatutions.eee.Department;

public class Student {

    public static void main(String[] args) {
        ExamLocation examLocation = new ExamLocation();
        examLocation.printExamCenter();
        System.out.println("Herere");
        printExamLocation();
        System.out.println(examCellName);

/*
        Department department = new Department();
        department.printDept();
        department.val;
*/

    }
}
