package ru.job4j.zaurlambda;

import java.util.Scanner;
import java.util.function.*;

/**
 * 1) Функциональный интерфейс Predicate<T> проверяет соблюдение некоторого условия.
 * Если оно соблюдается, то возвращается значение true.
 * В качестве параметра лямбда-выражение принимает объект типа T
 * 2) BinaryOperator<T> принимает в качестве параметра два объекта типа T,
 * выполняет над ними бинарную операцию и возвращает ее результат также в виде объекта типа T
 * 3) UnaryOperator<T> принимает в качестве параметра объект типа T,
 * выполняет над ними операции и возвращает результат операций в виде объекта типа T
 * 4) Функциональный интерфейс Function<T,R> представляет функцию перехода от объекта типа T к объекту типа R
 * 5) Consumer<T> выполняет некоторое действие над объектом типа T, при этом ничего не возвращая
 * 6) Supplier<T> не принимает никаких аргументов, но должен возвращать объект типа T
 */
public class LambdaApp {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println(isPositive.test(-5));
        System.out.println(isPositive.test(5));
        BinaryOperator<Integer> multiply = (x, y) -> x * y;
        System.out.println(multiply.apply(3, 5));
        System.out.println(multiply.apply(10, -3));
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(12));
        Function<Integer, String> convert = x -> x + " dollars";
        System.out.println(convert.apply(12));
        Consumer<Integer> printer = x -> System.out.printf("%d dollars \n", x);
        printer.accept(600);
        Supplier<User> userSupplier = () -> {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter name");
            String name = in.nextLine();
            return new User(name);
        };
        User user = userSupplier.get();
        User user1 = userSupplier.get();
        System.out.println("User name: " + user.getName());
        System.out.println("User1 name: " + user1.getName());
    }
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
