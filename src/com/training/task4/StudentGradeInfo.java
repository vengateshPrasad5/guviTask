package com.training.task4;

import java.util.HashMap;
import java.util.Scanner;

public class StudentGradeInfo {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Option \n 1--> Display All \n 2 ---> Add Student \n 3 ---> remove student \n 0 ---> Exit");
        int option ;
        StudentGrade.studentWithGrades.put("john",97);
        StudentGrade.studentWithGrades.put("peter",67);
        StudentGrade.studentWithGrades.put("jessie",86);

        do {
            option = obj.nextInt();
            switch (option){
                case 1 : StudentGrade.displayStudents();
                    break;
                case 2: StudentGrade.addStudents();
                    break;
                case 3: StudentGrade.removeStudent();
                    break;
                default:
                    System.out.println("Out of option");
                    break;
            }

        }while (option !=0);
    }
}
