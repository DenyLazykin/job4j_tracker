package ru.job4j.search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PriorityQueueTest {
    @Test
    public void whenHighPrioritySecond() {
        var queue = new PriorityQueue() {
            {
                put(new Task("low", 5));
                put(new Task("urgent", 1));
                put(new Task("middle", 3));
            }
        };
        var result = queue.take();
        assertThat(result.getDesc()).isEqualTo("urgent");
    }

    @Test
    public void whenHigherPriorityEquals() {
        var queue = new PriorityQueue() {{
            put(new Task("low", 5));
            put(new Task("urgent", 5));
            put(new Task("middle", 5));
        }};
        var result = queue.take();
        assertThat(result.getDesc()).isEqualTo("low");
    }
}