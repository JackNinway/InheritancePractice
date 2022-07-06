package org.example;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SalesPerson salesPerson;
        SystemDeveloper systemDeveloper;
        SystemDeveloper dev1 = new SystemDeveloper(
                "Jack NInway",
                LocalDate.parse("2011-01-01"),
                new String[]{"c++", "Python", "java", "Cobol"},
                new String[]{"OCA", "OCP", "OCE", "OCM"}
        );
        System.out.println(dev1);
        dev1.calculateSalary();
        System.out.println(dev1.getSalary());

        SalesPerson salesPerson1 =new SalesPerson("Sale1",LocalDate.of(2020,11,01),
                new String[] {"a", "b", "c"},10);
        System.out.println(salesPerson1);
        salesPerson1.calculateSalary();
        System.out.println(salesPerson1.getSalary());

    }
}