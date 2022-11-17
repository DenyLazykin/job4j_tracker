package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

public class OrderConvert {
    /**
     * Преобразовывает одну поллекцию в другую
     * Проходим по всем элементам списка orders и вставляем их в мапу
     *
     * @param orders Список заявок
     * @return Преобразованный список из листа в мапу
     */
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order order : orders) {
            map.put(order.getNumber(), order);
        }
        return map;
    }
}
