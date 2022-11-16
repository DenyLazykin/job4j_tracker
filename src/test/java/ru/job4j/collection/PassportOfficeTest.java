package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PassportOfficeTest {
    @Test
    public void whenTestAddMethod() {
        Citizen citizen = new Citizen("2f44a", "Denis Lazykin");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
    }

    @Test
    public void whenTestDuplicate() {
        Citizen citizen = new Citizen("2f44a", "Denis Lazykin");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        Citizen citizen1 = new Citizen("2f44a", "Lazykin Denis");
        assertThat(office.add(citizen1)).isFalse();
    }
}