/**
 * Purpose:In empolyee payroll services is to read and write the empolyee payroll data to console
 * Author:Priya
 *
 */
package com.bridgelabz.empolyeepayroll;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollService {
    /**
     * Firstly ,Arraylist is created to store the data
     *then ,we read those attributes which is declared in employee payroll data via ReadEmployee function
     * Object of employee payroll data is created in employee service in-order to access those id,salary and name
     * once the data is accessed we add those data into the arraylist
     * then its printed onto the console,which is called as output stream
     *
     */
ArrayList<EmployeePayrollData> employeeDataList = new ArrayList<>();

public void toReadEmployeePayrollData(Scanner consoleInputReader){
    System.out.println("Enter the Employee Id");
    int id = consoleInputReader.nextInt();

    System.out.println("Enter the Employee Name:");
    String name = consoleInputReader.next();

    System.out.println("Enter the Employee Salary");
    double salary = consoleInputReader.nextDouble();

    //Adding all data's to the list

    employeeDataList.add(new EmployeePayrollData(id , name , salary));

}

    /**
     * method to write the data
     */
    public void toWriteEmployeePayrollData(){
    System.out.println("Employee payroll data are:" + employeeDataList);
}


}
