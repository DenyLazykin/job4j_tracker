package ru.job4j.zaurstream.peek;

import java.util.stream.Stream;

/**
 * Обычно служит для того, что бы посмотреть как проходит наша цепочка методов
 */
public class PeekDemo {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 4);
        System.out.println(stream
                .distinct()
                .peek(System.out::println)
                .count());
    }
}
