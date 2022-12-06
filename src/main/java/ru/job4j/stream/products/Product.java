package ru.job4j.stream.products;

/**
 * Модель данных для продуктов
 * Поле name описывает название продуктов
 * Поле price описывает цену продуктов
 * Поле standard описывает сколько дней можно хранить продукт
 * Поле actual описывает сколько оно фактически хранится на складе
 */
public record Product(String name, float price, int standard, int actual) {
}
