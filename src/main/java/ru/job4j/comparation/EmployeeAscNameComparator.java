package ru.job4j.comparation;

import java.util.Comparator;

public class EmployeeAscNameComparator implements Comparator<EmployeeForComparator> {
    @Override
    public int compare(EmployeeForComparator o1, EmployeeForComparator o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
