package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book bookC = new Book("C++", 2500);
        Book bookJava = new Book("Java", 2500);
        Book bookPython = new Book("Python", 12);
        Book bookCleanCode = new Book("Clean code", 1500);
        Book[] books = new Book[4];
        books[0] = bookC;
        books[1] = bookJava;
        books[2] = bookPython;
        books[3] = bookCleanCode;
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getPagesNumber());
        }
        System.out.println();
        books[3] = bookC;
        books[0] = bookCleanCode;
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getPagesNumber());
        }
        System.out.println();
        System.out.println("print only Clean code book");
        for (Book book : books) {
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getPagesNumber());
            }
        }
    }
}
