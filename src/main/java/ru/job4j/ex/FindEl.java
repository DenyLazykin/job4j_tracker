package ru.job4j.ex;

public class FindEl {
    /**
     * Проверяет, что в списке есть ключ шаблона сообщения.
     * Метод может выкинуть исключение ElementNotFoundException.
     *
     * @param value массив значений
     * @param key   слово, которое ищем
     * @return номер элемента в массиве
     * @throws ElementNotFoundException может выкинуть исключение ElementNotFoundException
     */
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                System.out.println("Элемент найден: " + i);
                rsl = i;
                break;
            }
            if (rsl == -1) {
                throw new ElementNotFoundException("Элемента нет в массиве");
            }
        }
        return rsl;
    }

    /**
     * Отправляет сообщение, если ключ не входит в ключи запрещенных ключей.
     *
     * @param value  ключь
     * @param abuses массив ключей запрещенных ключей
     * @return true, если ключ не входит в ключи запрещенных ключей
     * @throws ElementAbuseException Метод может выкинуть исключение ElementAbuseException.
     */
    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        if (value.equals(abuses)) {
            return Boolean.parseBoolean(value);
        }
        throw new ElementAbuseException("Неверный элемент");
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {
        String[] names = new String[]{"Petr", "Ivan", "Nik", "Vasiliy"};
        try {
            indexOf(names, "Petr");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
        process(names, "Petr", names);
        try {
            sent("Petr", names);
        } catch (ElementAbuseException e) {
            e.printStackTrace();
        }
    }
}
