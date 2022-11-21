package ru.job4j.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkSpace {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee employeeDen = new Employee(4, "Den", "Lazykin", 150);
        Employee employeeNasty = new Employee(24, "Nasty", "Lazykina", 300);
        Employee employeeIvan = new Employee(2, "Ivan", "Boychenko", 500);
        list.add(employeeDen);
        list.add(employeeNasty);
        list.add(employeeIvan);
        System.out.println("Before sort \n" + list);
        Collections.sort(list);
        System.out.println("After sort \n" + list);

    }
}
