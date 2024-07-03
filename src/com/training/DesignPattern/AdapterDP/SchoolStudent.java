package com.training.DesignPattern.AdapterDP;

public class SchoolStudent {

    private String fname;
    private String lname;

    public SchoolStudent(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    @Override
    public String toString() {
        return "SchoolStudent{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
