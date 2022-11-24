package ru.job4j.zaurcollection;

import java.util.Set;
import java.util.TreeSet;

public class ThreeSetExample {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(10);
        System.out.println(treeSet);
        treeSet.remove(1);
        System.out.println(treeSet);
        System.out.println(treeSet.contains(1));
        System.out.println(treeSet.contains(2));
        TreeSet<StudentTreeSet> studentTreeSets = new TreeSet<>();
        StudentTreeSet studentDen = new StudentTreeSet("Den", 1);
        StudentTreeSet studentNasty = new StudentTreeSet("Nasty", 3);
        StudentTreeSet studentIvan = new StudentTreeSet("Ivan", 2);
        StudentTreeSet studentRus = new StudentTreeSet("Rus", 5);
        StudentTreeSet studentEldar = new StudentTreeSet("Eldar", 5);
        studentTreeSets.add(studentDen);
        studentTreeSets.add(studentNasty);
        studentTreeSets.add(studentIvan);
        studentTreeSets.add(studentRus);
        studentTreeSets.add(studentEldar);
        System.out.println(studentTreeSets);
        System.out.println(studentTreeSets.first());
        System.out.println(studentTreeSets.last());
        System.out.println(studentEldar.equals(studentRus));
        System.out.println(studentEldar.hashCode());
        System.out.println(studentRus.hashCode());
    }
}
