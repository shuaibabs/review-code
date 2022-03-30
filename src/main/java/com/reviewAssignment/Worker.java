package com.reviewAssignment;

public class Worker extends Employee
{
    public String specialization;
    Worker(int id, String name, String designation, double salary, String s) {
        super(id, name, designation, salary);
        this.specialization = s;
    }
}
