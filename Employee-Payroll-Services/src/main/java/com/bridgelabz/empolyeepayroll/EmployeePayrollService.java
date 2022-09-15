package com.bridgelabz.empolyeepayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//EmployeePayrollService Class to Perform Operations
public class EmployeePayrollService {
    List<EmployeePayrollData> employeePayrollDataList;
    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollDataList) {
        super();
        this.employeePayrollDataList = employeePayrollDataList;
    }
    public EmployeePayrollService(){
        super();
        this.employeePayrollDataList = new ArrayList<>();
    }

    /**
     * an array list is created to store the data of an employee
     * a read employee() is created
     * to scan the id ,name and salary object of employee payroll data is created
     * and hence these objects are added to arraylist;
     * secondly,to print the data inside the arraylist,write employee() is created
     *
     */
    public enum IOService{CONSOLE_IO,FILE_IO}

    //Function to Read Employee Data
    public void readEmployeeData() {

        EmployeePayrollData empData = new EmployeePayrollData();

        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Please Enter Employee ID");
        empData.setId(consoleInput.nextInt());
        System.out.println("Please Enter Employee Name");
        empData.setName(consoleInput.next());
        System.out.println("Please Enter Salary of Employee");
        empData.setSalary(consoleInput.nextInt());
        employeePayrollDataList.add(empData);

    }
    //Function to Write Employee Data
    public void writeEmployeeData(IOService ioService){
        if(ioService.equals(IOService.CONSOLE_IO)){
            System.out.println("Writing Employee Payroll Using Console \n"+employeePayrollDataList);
        } else if (ioService.equals(IOService.FILE_IO)) {
            new EmployeePayrollFileIOService().writeData(employeePayrollDataList);
        }
    }

//    public void printEmployeeData(IOService ioService) {
//        if(ioService.equals(IOService.FILE_IO))
//            new EmployeePayrollFileIOService().printData();
//    }
}