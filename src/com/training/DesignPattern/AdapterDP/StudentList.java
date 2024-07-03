package com.training.DesignPattern.AdapterDP;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

    public List<Student> StudentList(){
        List<Student> students = new ArrayList<>();
        CollegeStudent collegeStudent = new CollegeStudent("Vengat","Prasad");
        SchoolStudent schoolStudent =  new SchoolStudent("Vetri","Maran");
        students.add(collegeStudent);
        students.add(new NameAdapter(schoolStudent));
        return students;
    }
}
