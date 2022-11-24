package ru.job4j.zaurcollection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Den");
        queue.offer("Nasty");
        queue.offer("Ivan");
        queue.offer("Eldar");
        queue.offer("Rus");
        System.out.println(queue);
        System.out.println("Delete element " + queue.poll());
        System.out.println(queue);
        System.out.println("First element in queue " + queue.peek());
        System.out.println("Delete element " + queue.poll());
        System.out.println("First element in queue " + queue.peek());
    }
}
