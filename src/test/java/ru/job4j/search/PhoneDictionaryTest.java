package ru.job4j.search;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Denis", "Lazykin", "8882328", "Mytishchi")
        );
        ArrayList<Person> people = phones.find("888");
        assertThat(people.get(0).getSurname()).isEqualTo("Lazykin");
    }

    @Test
    public void whenNoFind() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Anastasia", "Lazykina", "1002252", "Mytishchi"));
        ArrayList<Person> people = phones.find("1012252");
        assertThat(people.size()).isEqualTo(0);
    }
}