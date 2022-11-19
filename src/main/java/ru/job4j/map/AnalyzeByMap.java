package ru.job4j.map;

import java.util.*;

public class AnalyzeByMap {
    /**
     * Вычисляет общий средний балл
     *
     * @param pupils Список учеников и предметов
     * @return Общий средний бал по ученикам из списка
     */
    public static double averageScore(List<Pupil> pupils) {
        double score = 0D;
        int count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                count++;
                score += subject.score();
            }
        }
        return score / count;
    }

    /**
     * Вычисляет средний балл по каждому ученику
     *
     * @param pupils Список учеников и предметов
     * @return Список из объекта Label(имя ученика и средний балл)
     */
    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double score = 0D;
            int count = 0;
            for (Subject subject : pupil.subjects()) {
                count++;
                score += subject.score();
            }
            list.add(new Label(pupil.name(), score / count));
        }
        return list;
    }

    /**
     * Вычисляет средний балл по каждому предмету
     *
     * @param pupils Список учеников и предметов
     * @return Список из объектов Label (название предмета и средний балл)
     */
    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                int score = map.getOrDefault(subject.name(), 0);
                score += subject.score();
                map.put(subject.name(), score);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.add(new Label(entry.getKey(), (double) entry.getValue() / map.size()));
        }
        return result;
    }

    /**
     * Вычисляет лучшего ученика
     *
     * @param pupils Список учеников и предметов
     * @return Объект Label (имя ученика и суммарный балл)
     */
    public static Label bestStudents(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        double score = 0D;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
            }
            list.add(new Label(pupil.name(), score));
            score = 0D;
        }
        list.sort(Comparator.naturalOrder());
        return list.get(list.size() - 1);
    }

    /**
     * Возвращает предмет с наибольшим баллом для всех студентов
     *
     * @param pupils Список учеников и предметов
     * @return Объект Label (имя предмета, сумма баллов каждого ученика по этому предмету)
     */
    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                int score = map.getOrDefault(subject.name(), 0);
                score += subject.score();
                map.put(subject.name(), score);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.add(new Label(entry.getKey(), (double) entry.getValue()));
        }
        result.sort(Comparator.naturalOrder());
        return result.get(result.size() - 1);
    }
}
