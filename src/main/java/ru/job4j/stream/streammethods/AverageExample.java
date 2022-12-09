package ru.job4j.stream.streammethods;

import ru.job4j.stream.streammethods.maptointtask.Person;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/**
 * (24) Поток объектов Person преобразовывается в поток int.
 * (25) average() считает среднее значение среди элементов потока.
 * (26) Получаем результат вычислений из переменной average
 */
public class AverageExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Mickey", 35),
                new Person("John", 26),
                new Person("Den", 18),
                new Person("Nasty", 24),
                new Person("Ivan", 33)
        );
        OptionalDouble average = people.stream()
                .mapToInt(Person::getAge)
                .average();
        double avg = average.getAsDouble();
        System.out.println(avg);
    }
}
