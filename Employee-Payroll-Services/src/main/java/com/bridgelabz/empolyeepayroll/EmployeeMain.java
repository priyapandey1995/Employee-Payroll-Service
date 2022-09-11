package com.bridgelabz.empolyeepayroll;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee Payroll Service");
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.toReadEmployeePayrollData(consoleInputReader);
        employeePayrollService.toWriteEmployeePayrollData();
    }
}