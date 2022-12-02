package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchFolder {
    /**
     * Фильтрует лист по реализованным в методе условиям
     *
     * @param list            Список, который нужно фильтровать
     * @param folderPredicate Функциональный интрфейс для фильтра листа
     * @return Отфильтрованный лист
     */
    public static List<Folder> filter(List<Folder> list, Predicate<Folder> folderPredicate) {
        List<Folder> result = new ArrayList<>();
        for (Folder folder : list) {
            if (folderPredicate.test(folder)) {
                result.add(folder);
            }
        }
        return result;
    }
}
