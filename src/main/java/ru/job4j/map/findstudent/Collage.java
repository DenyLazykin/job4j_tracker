package ru.job4j.map.findstudent;

import java.util.Map;
import java.util.Set;

public class Collage {
    private final Map<Student, Set<Subject>> students;

    public Collage(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    /**
     * Поиск студента по аккаунту.
     *
     * @param account Аккаунт студента.
     * @return Если студент не найден - возвращает null.
     */
    public Student findByAccount(String account) {
        return students.keySet()
                .stream()
                .filter(student -> student.getAccount().equals(account))
                .findFirst()
                .orElse(null);
    }

    /**
     * Поиск предмета по аккаунту и имени предмета/
     *
     * @param account Аккаунт студента.
     * @param name    Имя студента.
     * @return Если предмет не найден - возвращает null.
     */
    public Subject findBySubjectName(String account, String name) {
        Student a = findByAccount(account);
        if (a != null) {
            return students.get(a)
                    .stream()
                    .filter(subject -> subject.getName().equals(name))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    public static void main(String[] args) {
        Map<Student, Set<Subject>> students = Map.of(new Student("Student", "00001", "201-18-15"),
                Set.of(
                        new Subject("Math", 70),
                        new Subject("English", 85)
                        )
        );
        Collage collage = new Collage(students);
        Student student = collage.findByAccount("00001");
        System.out.println("Найденный студент: " + student);
        Subject english = collage.findBySubjectName("00001", "English");
        System.out.println("Оценка по найденому предмету: " + english.getScope());
    }
}
