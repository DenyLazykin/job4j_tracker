package ru.job4j.stream.tour;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    /**
     * Преобразует список профилей в список адрессов
     *
     * @param profiles Список профилей
     * @return Преобразованный список адрессов
     */
    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::address)
                .collect(Collectors.toList());
    }

    /**
     * Сортирует список в порядке возрастания по полю city исключая дубликы
     *
     * @param profiles Список профилей
     * @return Отсортированный список
     */
    public static List<Address> collectSortWithoutDuplicate(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::address)
                .sorted(Comparator.comparing(Address::getCity))
                .distinct()
                .collect(Collectors.toList());
    }
}
