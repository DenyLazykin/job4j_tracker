package ru.job4j.zaurcollection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "<denis2>";
        List<Character> list = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            list.add(ch);
        }
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverserIterator = list.listIterator(list.size());
        boolean isPalindrome = false;
        while (iterator.hasNext() && reverserIterator.hasPrevious()) {
            if (iterator.next() == reverserIterator.previous()) {
                isPalindrome = true;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
