package ru.job4j.zaurcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkSpace {
    public static void main(String[] args) {
        EmployeeBinarySearch employeeBinarySearchDen = new EmployeeBinarySearch(123, "Den", 12345);
        EmployeeBinarySearch employeeBinarySearchNasty = new EmployeeBinarySearch(321, "Nasty", 1222);
        EmployeeBinarySearch employeeBinarySearchIvan = new EmployeeBinarySearch(456, "Ivan", 4531);
        EmployeeBinarySearch employeeBinarySearchBen = new EmployeeBinarySearch(123, "Ben", 12356);
        EmployeeBinarySearch employeeBinarySearchRus = new EmployeeBinarySearch(7865, "Rus", 631223);
        EmployeeBinarySearch employeeBinarySearchLena = new EmployeeBinarySearch(234, "Lena", 633226);
        EmployeeBinarySearch employeeBinarySearchAndrey = new EmployeeBinarySearch(123, "Andrey", 754332);
        List<EmployeeBinarySearch> employeeBinarySearchList = new ArrayList<>();
        employeeBinarySearchList.add(employeeBinarySearchDen);
        employeeBinarySearchList.add(employeeBinarySearchNasty);
        employeeBinarySearchList.add(employeeBinarySearchIvan);
        employeeBinarySearchList.add(employeeBinarySearchBen);
        employeeBinarySearchList.add(employeeBinarySearchRus);
        employeeBinarySearchList.add(employeeBinarySearchLena);
        employeeBinarySearchList.add(employeeBinarySearchAndrey);
        System.out.println(employeeBinarySearchList);
        Collections.sort(employeeBinarySearchList);
        System.out.println(employeeBinarySearchList);
    }
}
