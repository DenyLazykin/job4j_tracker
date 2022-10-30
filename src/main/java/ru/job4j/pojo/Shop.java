package ru.job4j.pojo;

public class Shop {
    /**
     * Возвращает индекс первой пустой ячейки
     * @param products массив с продуктами
     * @return индекс первой пустой ячейки
     */
    public static int indexOfNull(Product[] products) {
        int index = -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                index = i;
                break;
            }
        } return index;
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName());
            }
        }
        System.out.println();
        int rsl = Shop.indexOfNull(products);
        System.out.println(rsl);
    }
}
