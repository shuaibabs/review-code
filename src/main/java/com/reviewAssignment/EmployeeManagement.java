package com.reviewAssignment;
import java.util.HashSet;
import java.util.Set;
public class EmployeeManagement {
    Set<Employee> emp = new HashSet<>();
    boolean appointEmployee(Employee e) {
        Worker w = (Worker) e;
        if(w.specialization == null)
            return false;
        if( (w.specialization.equals("MCA")) || (w.specialization.equals("B.TECH")) ){
            emp.add(e);
            return true;
        }
        return false;
    }
    void display() {
        System.out.println(emp);
    }
}
