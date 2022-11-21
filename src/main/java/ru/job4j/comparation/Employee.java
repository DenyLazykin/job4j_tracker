package ru.job4j.comparation;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String surname;
    private int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", surname='" + surname + '\''
                + ", salary=" + salary
                + '}';
    }

    @Override
    public int compareTo(Employee another) {
        return Integer.compare(id, another.id);
    }
}
