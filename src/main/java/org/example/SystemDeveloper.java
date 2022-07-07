package org.example;

import java.time.LocalDate;
import java.util.Arrays;

public class SystemDeveloper extends Employee{

    private String[] certificates;
    private String [] languages;
    public static final double LANGUAGE_BONUS = 1_000;
    public static final double CERTIFICATE_BONUS = 2_000;

    public SystemDeveloper(String name, LocalDate hiredDate, String[] languages, String[] certificates) {
        super(name, hiredDate);
        this.languages = languages;
        this.certificates = certificates;
        calculateSalary();
    }

    @Override
    public void calculateSalary() {
        double programmerSalary = BASE_SALARY +
                (languages.length  * LANGUAGE_BONUS) +
                (certificates.length * CERTIFICATE_BONUS);

        setSalary(programmerSalary);
    }

    @Override
    public String toString() {
        return "SystemDeveloper{" +
                "name= " + getName() +
                "Hiredate= " + getDateHired() +
                "certificates=" + Arrays.toString(certificates) +
                ", languages=" + Arrays.toString(languages) +
                '}';
    }
}
