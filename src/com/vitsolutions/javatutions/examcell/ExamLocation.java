package com.vitsolutions.javatutions.examcell;

public class ExamLocation {

    public static String examCellName = "CommonExamCell";

    private String test1 = "We keep exams to the college";

    public ExamLocation(){
    }

    public ExamLocation(int i){
        this();
    }

    public String test = "CommonExamCell";

    public void printExamCenter(){
        printCellName();

    }

    public static void printExamLocation(){
        System.out.println("Exam Location");
    }

    private void printCellName(){
        System.out.println("My name is Exam Cell Center");
    }

}
