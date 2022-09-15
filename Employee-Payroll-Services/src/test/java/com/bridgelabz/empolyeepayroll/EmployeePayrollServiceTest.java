package com.bridgelabz.empolyeepayroll;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.bridgelabz.empolyeepayroll.EmployeePayrollService.IOService.FILE_IO;


public class EmployeePayrollServiceTest {

    @Test
    public void givenFourinputsShouldMatchTheEntries(){
        EmployeePayrollData[] arrayOfEmployees = {
                new EmployeePayrollData(1,"priya",10000),
                new EmployeePayrollData(2,"neha",20000),
                new EmployeePayrollData(3,"abhishek",30000),
                new EmployeePayrollData(3,"niraj",40000)
        };
        EmployeePayrollService employeeService = new EmployeePayrollService(Arrays.asList(arrayOfEmployees));
        /**
         * employee payroll service to write and print on the file.
         */
         employeeService.writeEmployeeData(FILE_IO);
          employeeService.printEmployeeData(FILE_IO);
    }
}

