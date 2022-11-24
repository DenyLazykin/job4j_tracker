package ru.job4j.zaurcollection;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(4);
        priorityQueue.offer(1);
        priorityQueue.offer(7);
        priorityQueue.offer(10);
        priorityQueue.offer(8);
        System.out.println("Когда выводим priorityQueue, у ее элементов нет сортировки по приоритету "
                + priorityQueue);
        System.out.println("Но, когда используем элемент, применяется натуральная сортировка\n "
                + priorityQueue.poll());
        System.out.println("Но, когда используем элемент, применяется натуральная сортировка\n "
                + priorityQueue.poll());
        System.out.println("Но, когда используем элемент, применяется натуральная сортировка\n "
                + priorityQueue.poll());
        System.out.println("Но, когда используем элемент, применяется натуральная сортировка\n "
                + priorityQueue.poll());
        System.out.println("Но, когда используем элемент, применяется натуральная сортировка\n "
                + priorityQueue.poll());
        System.out.println();
        System.out.println("Пример со студентами");
        PriorityQueue<StudentPriorityQueue> studentPriorityQueues = new PriorityQueue<>();
        StudentPriorityQueue studentDen = new StudentPriorityQueue("Den", 1);
        StudentPriorityQueue studentNasty = new StudentPriorityQueue("Nasty", 3);
        StudentPriorityQueue studentIvan = new StudentPriorityQueue("Ivan", 2);
        StudentPriorityQueue studentRus = new StudentPriorityQueue("Rus", 5);
        StudentPriorityQueue studentEldar = new StudentPriorityQueue("Eldar", 5);
        studentPriorityQueues.offer(studentDen);
        studentPriorityQueues.offer(studentNasty);
        studentPriorityQueues.offer(studentIvan);
        studentPriorityQueues.offer(studentRus);
        studentPriorityQueues.offer(studentEldar);
        System.out.println(studentPriorityQueues);
        System.out.println(studentPriorityQueues.poll());
        System.out.println(studentPriorityQueues.poll());
        System.out.println(studentPriorityQueues.poll());
        System.out.println(studentPriorityQueues.poll());
        System.out.println(studentPriorityQueues.poll());
    }
}
