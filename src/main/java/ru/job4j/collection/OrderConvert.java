package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderConvert {
    /**
     * Преобразовывает одну поллекцию в другую
     * Проходим по всем элементам списка orders и вставляем их в мапу
     *
     * @param orders
     * @return
     */
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Map.Entry<String, Order> entry : map.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }
}
