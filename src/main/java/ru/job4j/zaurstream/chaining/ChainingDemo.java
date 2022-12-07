package ru.job4j.zaurstream.chaining;

import java.util.Arrays;

public class ChainingDemo {
    public static void main(String[] args) {
        int[] array = {3, 7, 1, 56, 2, 8, 9, 4, 13};
        int result = Arrays.stream(array)
                .filter(e ->
                        e % 2 == 1)
                .map(e -> {
                    if (e % 3 == 0) {
                        e = e / 3;
                    }
                    return e;
                })
                .reduce(Integer::sum).getAsInt();
        System.out.println(result);
    }
}
