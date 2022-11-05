package ru.job4j.ex;

public class FindEl {
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

    public static void main(String[] args) {
        String[] names = new String[]{"Petr", "Ivan", "Nik", "Vasiliy"};
        try {
            indexOf(names, "Vladimir");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
