package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactTest {
    @Test
    public void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Fact().calc(-1);
                });
        assertThat(exception.getMessage()).isEqualTo("Число не должно быть меньше нуля");
    }

    @Test
    public void whenNumber15FactIs2004310016() {
        int number = 15;
        int expected = 2004310016;
        int result = new Fact().calc(number);
        assertThat(expected).isEqualTo(result);
    }
}