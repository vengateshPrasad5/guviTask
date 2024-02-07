package com.training.task3.java;

public class Employee implements Taxable {
    long empId;
    String name;
    long salary;

    public Employee( long empId, String name, long salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "[EmpID: "+empId+", Name: " + name + ", Monthly Salary: "+salary+"]";
    }

    @Override
    public void calculateTax() {
        double result = (salary*12)*incomeTax;// calculate for yearly salary
        System.out.println("Income Tax yearly :"+ String.format("%.2f",result));
    }
}
