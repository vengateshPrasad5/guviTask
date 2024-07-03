package com.training.DesignPattern.AdapterDP;

public class NameAdapter implements Student{

    SchoolStudent schoolStudent;

    public NameAdapter(SchoolStudent schoolStudent) {
        this.schoolStudent = schoolStudent;
    }

    @Override
    public String toString() {
        return "schoolStudent=" + schoolStudent ;

    }

    @Override
    public String firstName() {
        return this.schoolStudent.getFname();
    }

    @Override
    public String lastName() {
        return this.schoolStudent.getLname();
    }
}
