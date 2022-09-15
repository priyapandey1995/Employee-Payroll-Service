package com.bridgelabz.empolyeepayroll;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollFileIOService {
    //absolute path is given
    public static String PAYROLL_FileName = "C:\\Users\\pande\\OneDrive\\Documents\\Assignments_Batch_175\\Employee-Payroll-Services\\Employee-Payroll-Service\\Employee-Payroll-Services\\src\\main\\resources\\file.txt";
    public void writeData(List<EmployeePayrollData> employeePayrollDataList) {
        StringBuffer empBuffer = new StringBuffer();
        employeePayrollDataList.forEach(employee ->{
            String empDataString = employee.toString().concat("\n");
            empBuffer.append(empDataString);
        });
        try{
            Files.write(Paths.get(PAYROLL_FileName), empBuffer.toString().getBytes());
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    // to print the employee payroll
    public void printData() {
        try{
            Files.lines(new File(PAYROLL_FileName).toPath()).forEach(System.out::println);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
// to count the employee payroll
    public long countEntry() {
        long entries = 0;
        try{
            entries = Files.lines(new File(PAYROLL_FileName).toPath()).count();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return entries;
    }


}