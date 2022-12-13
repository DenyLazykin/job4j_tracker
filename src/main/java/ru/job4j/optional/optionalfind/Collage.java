package ru.job4j.optional.optionalfind;

import java.util.Map;
import java.util.Optional;
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
    public Optional<Student> findByAccount(String account) {
        Optional<Student> result = Optional.empty();
        for (Student student : students.keySet()) {
            if (account.equals(student.getAccount())) {
                result = Optional.of(student);
                break;
            }
        }
        return result;
    }

    /**
     * Поиск предмета по аккаунту и имени предмета/
     *
     * @param account Аккаунт студента.
     * @param name    Имя студента.
     * @return Если предмет не найден - возвращает null.
     */
    public Optional<Subject> findBySubjectName(String account, String name) {
        Optional<Subject> result = Optional.empty();
        Optional<Student> student = findByAccount(account);
        if (student.isPresent()) {
            Set<Subject> subjects = students.get(student.get());
            for (Subject subject : subjects) {
                if (name.equals(subject.getName())) {
                    result = Optional.of(subject);
                    break;
                }
            }
        }
        return result;
    }
}
