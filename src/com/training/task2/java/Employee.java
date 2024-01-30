package com.training.task2.java;

public class Employee extends Person {
    public Integer employeeID;
    public Double salary;

    public Employee ( String name, int age, int employeeID, double salary ){
      super(name,age);
      this.employeeID = employeeID;
      this.salary = salary;
      System.out.println("Emp ID "+this.employeeID);// Output : Emp ID  123
      System.out.println("Salary "+this.salary);// Output : Salary 18500.24
    }

}
