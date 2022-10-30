package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Денис Лазыкин");
        student.setGroup(1);
        student.setDate(2022);
        System.out.println("Студент : " + student.getName() + " поступил на курс "
                + student.getDate() + " году в "
        + student.getGroup() + " группу");
    }
}
