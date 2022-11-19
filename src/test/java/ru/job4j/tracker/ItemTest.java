package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemTest {
    @Test
    public void whenSortedAscByName() {
        List<Item> items = Arrays.asList(
                new Item(3, "Devil"),
                new Item(1, "God"),
                new Item(2, "Angel")
        );
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item(2, "Angel"),
                new Item(3, "Devil"),
                new Item(1, "God")
        );
        assertThat(expected).isEqualTo(items);
    }

    @Test
    public void whenSortedDescByName() {
        List<Item> items = Arrays.asList(
                new Item(3, "Devil"),
                new Item(1, "God"),
                new Item(2, "Angel")
        );
        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item(1, "God"),
                new Item(3, "Devil"),
                new Item(2, "Angel")
        );
        assertThat(expected).isEqualTo(items);
    }
}