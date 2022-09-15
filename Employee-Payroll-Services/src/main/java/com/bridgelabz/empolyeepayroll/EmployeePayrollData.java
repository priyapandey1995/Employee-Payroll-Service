package com.bridgelabz.empolyeepayroll;

public class EmployeePayrollData {
    /**
     * three variables are created and for eacg variables getter and setter is added
     * in-order to achieve abstraction.
     * */

    private int id;
    private String name;
    private int salary;

    public EmployeePayrollData() {
    }

    public EmployeePayrollData(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     *
     * @return the objects
     *
     */

    @Override
    public String toString() {
        return "EmployeePayrollData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}