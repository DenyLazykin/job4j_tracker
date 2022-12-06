package ru.job4j.stream.tour;

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
}
