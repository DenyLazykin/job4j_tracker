package ru.job4j.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueRunner {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("first");
        queue.add("second");
        queue.add("third");
        System.out.println("State of Queue before remove: ");
        for (String s : queue) {
            System.out.println(s);
        }
        queue.remove();
        System.out.println();
        System.out.println("State of Queue after remove:  ");
        for (String s : queue) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println(queue.peek());
    }
}
