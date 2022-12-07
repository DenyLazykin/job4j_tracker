package ru.job4j.zaurstream.reduse;

import java.util.ArrayList;
import java.util.List;

/**
 * Выполняет сокращение элементов этого потока, используя ассоциативную функцию накопления,
 * и возвращает необязательное значение, описывающее уменьшенное значение, если таковое имеется.
 */
public class ReduceDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);
        int result = list.stream()
                .reduce((accumulator, element) ->
                        accumulator * element).get();
        System.out.println(result);
        System.out.println();
        List<String> list1 = new ArrayList<>();
        list1.add("hi");
        list1.add("how are u");
        list1.add("ok");
        list1.add("bye");
        String result1 = list1.stream()
                .reduce((a, e) ->
                        a + " " + e).get();
        System.out.println(result1);
    }
}
