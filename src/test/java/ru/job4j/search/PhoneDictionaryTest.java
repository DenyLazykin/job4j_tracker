package ru.job4j.search;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class PhoneDictionaryTest {
    @Test
    public void whenFindSurname() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Denis", "Lazykin", "8882328", "Mytishchi")
        );
        ArrayList<Person> person = phones.find("Lazykin");
        assertThat(person.get(0).getSurname()).isEqualTo("Lazykin");
    }

    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Denis", "Lazykin", "8882328", "Mytishchi")
        );
        ArrayList<Person> person = phones.find("Denis");
        assertThat(person.get(0).getName()).isEqualTo("Denis");
    }

    @Test
    public void whenNoFind() {
        var phones = new PhoneDictionary();
        phones.add(new Person("Anastasia", "Lazykina", "1002252", "Mytishchi"));
        ArrayList<Person> person = phones.find("1012252");
        assertThat(person.size()).isEqualTo(0);
    }
}