package ru.job4j.lambda;

import java.util.function.Supplier;

/**
 * Переменная, объявленная внутри лямбда-выражения, доступна только в самом лямбда-выражении
 * Переменная, объявленная вне лямбда-выражения, доступна как внутри лямбда-выражения, так и вне его
 */
public class ScopeInsideLambda {
    private static String echo(Supplier<String> stringSupplier) {
        String sound = stringSupplier.get();
        return sound + " " + sound + " " + sound;
    }

    public static void main(String[] args) {
        String name = echo(
                () -> {
                    String ayyyy = "ayyyyy";
                    return ayyyy;
                }
        );
        System.out.println(name);
    }
}

class ScopeOutsideLambda {
    private static String echo(Supplier<String> stringSupplier) {
        String sound = stringSupplier.get();
        return sound + " " + sound + " " + sound;
    }

    public static void main(String[] args) {
        String ayyyy = "ayyyyy";
        String name = echo(
                () -> ayyyy
        );
        System.out.println(ayyyy);
        System.out.println(name);
    }
}
