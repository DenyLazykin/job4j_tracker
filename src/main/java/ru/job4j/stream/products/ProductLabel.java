package ru.job4j.stream.products;

import java.util.List;
import java.util.stream.Collectors;

public class ProductLabel {
    /**
     * Генерирует ярлыки продуктов со скидкой
     * Фильтруем продукты в соответствии с описанием
     * Преобразовываем элементы потока, создавая продукты по новой цене
     *
     * @param products Лист с продуктами
     * @return Список продуктов со скидкой
     */
    public List<String> generateLabels(List<Product> products) {
        return products.stream()
                .filter(product -> product.standard() - product.actual() >= 0
                        && product.standard() - product.actual() <= 3)
                .map(product -> new Label(product.name(), product.price() / 2))
                .map(Label::toString)
                .collect(Collectors.toList());

    }
}
