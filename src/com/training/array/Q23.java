package com.training.array;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
    private String name;
    private Integer salary;

    public Employee(String name,Integer salary){
      this.name = name;
      this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class Q23 {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
//        int n = obj.nextInt();
        obj.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(obj.nextLine());
        List<Employee> employees =  new ArrayList<>();
        while(stringTokenizer.hasMoreTokens()){
           employees.add(new Employee(stringTokenizer.nextToken(), Integer.valueOf(stringTokenizer.nextToken()))) ;
        }
        List<Employee> sortedList = employees.stream()
                                    .sorted(Comparator.comparing(Employee::getSalary))
                                    .toList();

        sortedList.forEach(x -> System.out.println(x.getName()));
    }
}
