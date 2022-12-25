package ru.job4j.optional;

import java.util.Optional;

public class TrainingOptional {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());
        System.out.println();
        String name = "name";
        Optional<String> optional = Optional.of(name);
        System.out.println(optional.isPresent());
    }
}

