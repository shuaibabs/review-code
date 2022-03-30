package com.reviewAssignment;

public class Manager extends Employee
{
    String department;

    Manager(int id, String name, String designation, double salary) {
        super(id, name, designation, salary);
    }

    void setDepartment( String d){
        this.department = d;
    }
    String getDepartment() {
        return this.department;
    }
}
