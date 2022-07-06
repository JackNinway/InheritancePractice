package org.example;

import java.time.LocalDate;
import java.util.Arrays;

public class SalesPerson extends Employee {

    private String[] clients;
    private int aquiredClients;
    public static final double CLIENT_BONUS = 1_000;
    public static final double AQ_CLIENT_BONUS = 2_000;

    public SalesPerson(String name, LocalDate dateHired, String[] clients, int aquiredClients) {
        super(name, dateHired);
        this.clients = clients;
        this.aquiredClients = aquiredClients;
    }

    @Override
    public void calculateSalary() {
        double saleSalary = BASE_SALARY +
                (clients.length * CLIENT_BONUS)  +
                (aquiredClients * AQ_CLIENT_BONUS) ;

        setSalary(saleSalary);
    }

    @Override
    public String toString() {
        return "SalesPerson{" +
                "name= " + getName() +
                ", Hiredate= " + getDateHired() +
                ", clients=" + Arrays.toString(clients) +
                ", aquiredClients=" + aquiredClients +
                '}';
    }
}