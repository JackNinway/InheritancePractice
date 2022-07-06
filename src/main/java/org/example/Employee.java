package org.example;

import java.time.LocalDate;

public abstract class Employee {
    private double salary;
    private String name;
    private LocalDate dateHired;
    public static final double BASE_SALARY = 25_000;
    public Employee(String name,  LocalDate dateHired) {
        this.name = name;
        this.dateHired = dateHired;
    }

    public abstract void calculateSalary();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(LocalDate dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", dateHired=" + dateHired +
                '}';
    }
}
