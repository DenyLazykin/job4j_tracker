package ru.job4j.zaurcollection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(3);
        deque.addFirst(5);
        deque.addLast(7);
        deque.offerFirst(1);
        deque.offerLast(8);
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.removeFirst());
        System.out.println(deque);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.removeLast());
        System.out.println(deque);
        System.out.println(deque.peekFirst());
        System.out.println(deque);
        System.out.println(deque.pollLast());
    }
}
