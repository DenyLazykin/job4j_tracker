package ru.job4j.ooa;

public final class Car {
    public final void printMark() {
        System.out.println("Метод выводит марку авто");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.printMark();
    }
}
