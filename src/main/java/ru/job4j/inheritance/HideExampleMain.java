package ru.job4j.inheritance;

public class HideExampleMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        animal.instanceInvoke();
        dog.instanceInvoke();
        Animal.staticInvoke();
        Dog.staticInvoke();
    }
}
