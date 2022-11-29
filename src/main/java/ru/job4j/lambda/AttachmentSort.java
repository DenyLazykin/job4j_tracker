package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );
        Comparator<Attachment> comparatorBySize = new Comparator<>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return Integer.compare(left.getSize(), right.getSize());
            }
        };
        System.out.println("Sort by size:");
        attachments.sort(comparatorBySize);
        System.out.println(attachments);
        System.out.println();
        Comparator<Attachment> comparatorByName = new Comparator<>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return left.getName().compareTo(right.getName());
            }
        };
        System.out.println("Sort by name:");
        attachments.sort(comparatorByName);
        System.out.println(attachments);
        System.out.println();
        System.out.println("Create anonymous class, and override method add:");
        ArrayList<Integer> list = new ArrayList<>() {
            @Override
            public boolean add(Integer o) {
                System.out.println("Add a new element to list: " + o);
                return super.add(o);
            }
        };
        list.add(100500);
        System.out.println(list);
    }
}