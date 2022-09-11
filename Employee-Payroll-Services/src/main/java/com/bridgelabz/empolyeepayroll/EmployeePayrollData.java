package com.bridgelabz.empolyeepayroll;

/**
 *
 */
public class EmployeePayrollData {
    /**
     * Employee payroll data has id,name and salary
     * constructors are used to initialise those variables
     *
     */
    public int id;
    public String name;
    public double salary;

    public EmployeePayrollData(int id ,String name ,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     *
     * @return attributes in string format
     */
    @Override
    public String toString() {
        return "EmployeePayrollData{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
    }
}
