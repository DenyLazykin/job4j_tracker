package ru.job4j.oop;

/**
 * создаем объекта класса Car.Теперь этот объект можно записать в переменную с типом Transport и Object.
 * делаем приведение к типу родителя Transport.
 * делаем приведение к типу родителя Object.
 * Приведение типа при создании объекта.
 * Приведение типа за счет понижения по иерархии.
 * Ошибка в приведении типа.
 * код завершится с ошибкой приведения типов ClassCastException. Car cb = (Car) bicycle; - Bicycle cb = (Bicycle) bicycle;
 */
public class HierarchyUsage {
    public static void main(String[] args) {
        Car car = new Car();
        Transport tp = car;
        Object obj = car;
        Object ocar = new Car();
        Car carFromObject = (Car) ocar;
        Object bicycle = new Bicycle();
        Bicycle cb = (Bicycle) bicycle;
    }
}
