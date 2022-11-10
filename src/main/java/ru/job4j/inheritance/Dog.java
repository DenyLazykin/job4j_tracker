package ru.job4j.inheritance;

public class Dog extends Animal {
    @Override
    public void instanceInvoke() {
        System.out.println("Вызов метода instanceInvoke(); из класса Dog");
    }

    public static void staticInvoke() {
        System.out.println("Вызов метода staticInvoke(); из класса Dog");
    }
}
