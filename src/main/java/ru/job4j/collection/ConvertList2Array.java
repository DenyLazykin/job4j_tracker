package ru.job4j.collection;

import java.util.List;

public class ConvertList2Array {
    /**
     * Метод для преобразования одномерного списка в двухмерный массив
     * В переменной groups расчитываем сколько какое количество групп будет иметь массив
     * Math.ceil - делает округление в большую сторону
     * Для заполнения ячеек массива используем row, cell
     *
     * @param list  Список со значениями.
     * @param cells Количество ячеек на которые разбиваем список.
     * @return Преобразованный двухмерный массив.
     */
    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0, cell = 0;
        for (Integer num : list) {
            array[row][cell] = num;
            cell++;
            if (cell == cells) {
                cell = 0;
                row++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        int[][] result = toArray(list, 3);
        for (int[] row : result) {
            for (int cell : row) {
                System.out.println(cell + " ");
            }
            System.out.println();
        }
    }
}
