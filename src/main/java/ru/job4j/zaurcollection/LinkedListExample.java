package ru.job4j.zaurcollection;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        StudentLinkedList studentLinkedListIvan1 = new StudentLinkedList("Ivan", 1);
        StudentLinkedList studentLinkedListDen = new StudentLinkedList("Den", 5);
        StudentLinkedList studentLinkedListStan = new StudentLinkedList("Stan", 2);
        StudentLinkedList studentLinkedListNasty = new StudentLinkedList("Nasty", 3);
        StudentLinkedList studentLinkedListIvan4 = new StudentLinkedList("Ivan", 4);
        LinkedList<StudentLinkedList> studentLinkedLists = new LinkedList<>();
        studentLinkedLists.add(studentLinkedListIvan1);
        studentLinkedLists.add(studentLinkedListDen);
        studentLinkedLists.add(studentLinkedListStan);
        studentLinkedLists.add(studentLinkedListNasty);
        studentLinkedLists.add(studentLinkedListIvan4);
        System.out.println(studentLinkedLists);
        System.out.println(studentLinkedLists.get(2));
        StudentLinkedList studentLinkedListBen = new StudentLinkedList("Ben", 3);
        StudentLinkedList studentLinkedListJohn = new StudentLinkedList("John", 4);
        studentLinkedLists.add(studentLinkedListBen);
        System.out.println(studentLinkedLists);
        studentLinkedLists.add(1, studentLinkedListJohn);
        System.out.println(studentLinkedLists);
        studentLinkedLists.remove(3);
        System.out.println(studentLinkedLists);
    }
}
