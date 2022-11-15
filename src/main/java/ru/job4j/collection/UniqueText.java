package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Преобразовать строку в массив слов. Для этого используется метод String.split(" ").
 * Массив строк вставить через цикл for-each в коллекцию HashSet.
 * Преобразовать проверяемый текст в массив слов по аналогии с пунктом 1.
 * Проверить массив строк через цикл for-each в коллекции HashSet используя метод contains.
 */
public class UniqueText {
    /**
     * Для проверки уникальности текста
     *
     * @param originText    Оригинальный текст
     * @param duplicateText Проверяемый
     * @return False - если текст не уникальный
     */
    public boolean isEquals(String originText, String duplicateText) {
        boolean result = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>(Arrays.asList(origin));
        for (String word : text) {
            if (!check.contains(word)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
