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
        List<EmployeeForComparator> listComparator = new ArrayList<>();
        EmployeeForComparator employeeDenForComparator =
                new EmployeeForComparator(4, "Den", "Lazykin", 150);
        EmployeeForComparator employeeNastyForComparator =
                new EmployeeForComparator(24, "Nasty", "Lazykina", 300);
        EmployeeForComparator employeeIvanForComparator =
                new EmployeeForComparator(2, "Ivan", "Boychenko", 500);
        listComparator.add(employeeDenForComparator);
        listComparator.add(employeeNastyForComparator);
        listComparator.add(employeeIvanForComparator);
        System.out.println("Before sort \n" + listComparator);
        listComparator.sort(new EmployeeAcsIdComparator());
        System.out.println("After sort add comparator \n" + listComparator);
        listComparator.sort(new EmployeeAscNameComparator());
        System.out.println("After sort by name \n" + listComparator);
    }
}
