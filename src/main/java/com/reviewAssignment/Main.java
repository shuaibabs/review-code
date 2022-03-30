package com.reviewAssignment;

public class Main {
    public static void main(String[] args) {
        Employee empObj = (Employee) new Worker(91791,"MH Shuaib","Software Engineer",32000, "MCA");
        EmployeeManagement manageObj = new EmployeeManagement();
        manageObj.appointEmployee(empObj);
        manageObj.display();
    }
}
