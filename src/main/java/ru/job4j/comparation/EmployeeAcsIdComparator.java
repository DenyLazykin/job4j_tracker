package ru.job4j.comparation;

import java.util.Comparator;

public class EmployeeAcsIdComparator implements Comparator<EmployeeForComparator> {
    @Override
    public int compare(EmployeeForComparator employee1, EmployeeForComparator employee2) {
        return Integer.compare(employee2.getId(), employee1.getId());
    }
}
