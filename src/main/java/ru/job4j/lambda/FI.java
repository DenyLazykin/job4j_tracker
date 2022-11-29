package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        Attachment[] attachments = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 2", 23),

        };
        String[] fruits = {
                "watermelon",
                "pineapple",
                "apple",
                "banana"
        };
        Comparator<Attachment> comparatorBySize =
                (left, right) -> Integer.compare(left.getSize(), right.getSize());
        Arrays.sort(attachments, comparatorBySize);
        System.out.println("Sort by size:");
        for (Attachment attachment : attachments) {
            System.out.println(attachment);
        }
        Comparator<String> comparatorByAscSizeLength =
                (left, right) -> Integer.compare(left.length(), right.length());
        Arrays.sort(fruits, comparatorByAscSizeLength);
        System.out.println();
        System.out.println("Sort by asc size length:");
        for (String f : fruits) {
            System.out.println(f);
        }
        Comparator<String> comparatorText =
                (left, right) -> left.compareTo(right);
        Arrays.sort(fruits, comparatorText);
        System.out.println();
        System.out.println("Sort by Text:");
        for (String f : fruits) {
            System.out.println(f);
        }
        Comparator<String> comparatorByDescSizeLength =
                (left, right) -> Integer.compare(right.length(), left.length());
        Arrays.sort(fruits, comparatorByDescSizeLength);
        System.out.println();
        System.out.println("Sort by desc size length:");
        for (String f : fruits) {
            System.out.println(f);
        }
    }
}