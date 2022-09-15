package com.bridgelabz.empolyeepayroll;

public class EmployeeMain {
    /**
     * firstly,the object of employee payroll object is created
     * then with the help of object two methods are called;
     * read () and write();
     */
   public static void main(String[] args) {
        System.out.println("Welcome to Employee Payroll Service Program");
        EmployeePayrollService employeeService = new EmployeePayrollService();
       employeeService.readEmployeeData();
       employeeService.writeEmployeeData(EmployeePayrollService.IOService.CONSOLE_IO);

    }
}