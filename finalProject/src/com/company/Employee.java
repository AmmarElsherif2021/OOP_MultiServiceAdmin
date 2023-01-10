package com.company;
//sheet4----------
public class Employee {
    public String first_name;
    public String last_name;
    public double salary;
    Employee (String first, String last){
        first_name=first;
        last_name=last;
    };
    public void setSalary(double cash){
        salary=cash;
    };
    public double getSalary(){
        return salary;
    };
};

class EmployeeTest{
    public static void main(String[] args){
        Employee emp1= new Employee("Ahmed","Aly") ;
        emp1.setSalary(1000.00);
        System.out.println(emp1.first_name);
        System.out.println(emp1.getSalary());
        emp1.setSalary(emp1.salary * 1.1);
        System.out.println(emp1.getSalary());
    };
};