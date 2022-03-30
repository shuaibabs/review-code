package com.reviewAssignment;

public class Employee
{
    int id;
    String name;
    String designation;
    double salary;

    Employee(int id,String name,String designation,double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
    public String getEmployee() {
        return
                "ID: " + this.id + " || " +
                "Name: " + this.name + " || " +
                "Designation: " + this.designation + " || " +
                "Salary: " + this.salary;
    }
    public String toString(){
        return
                "ID: " + this.id + " || " +
                "Name: " + this.name + " || " +
                "Designation: " + this.designation + " || " +
                "Salary: " + this.salary;
    }
}
