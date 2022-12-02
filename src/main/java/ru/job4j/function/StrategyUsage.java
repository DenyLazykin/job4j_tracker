package ru.job4j.function;

import java.util.function.Function;
import java.util.function.Predicate;

public class StrategyUsage {
    /**
     * Для провекрки строк
     * isEmpty - проверяет пуста строка или нет
     * startsWith - сравнивает начало строки с указаным в аргументах значением
     * contains - проверяет содержит ли строка указываемое значение
     *
     * @param predicate Функциональный интерфейс
     * @param s         Строка, которую проверяем
     * @return True - если проверка подтвердилась
     */
    public boolean check(Predicate<String> predicate, String s) {
        return predicate.test(s);
    }

    /**
     * Для перобразования строк
     * toUpperCase - приводит все символы строки к верхнему регистру
     * concat - производит конкатенацию двух строк
     * trim - удаляет из строки пробелы в начале и конце строки
     *
     * @param function Функциональный интерфейс
     * @param s        Строка, которую преобразовываем
     * @return Преобразованную строку
     */
    public String transform(Function<String, String> function, String s) {
        return function.apply(s);
    }

    public static void main(String[] args) {
        StrategyUsage strategyUsage = new StrategyUsage();
        System.out.println(
                "Результат работы: " + strategyUsage.check(
                        str -> str.isEmpty(), ""
                )
        );
        System.out.println(
                "Результат работы: " + strategyUsage.check(
                        str -> str.startsWith("Fun"), "Functional Interface"
                )
        );
        System.out.println(
                "Результат рыботы: " + strategyUsage.check(
                        str -> str.contains("rn"), "Surname Name"
                )
        );
        System.out.println(
                "Строка после преобразования: " + strategyUsage.transform(
                        str -> str.toUpperCase(), "sdfajkAjnafsdAnlkjFNA"
                )
        );
        System.out.println(
                strategyUsage.transform(
                        str -> str.concat("Работает корректно"), "Строка после преобразования: "
                )
        );
        System.out.println(
                "Строка после преобразования" + strategyUsage.transform(
                        str -> str.trim(), "      aBc DefGhJ Lmnp RStu    "
                )
        );
    }
}
