package ru.job4j.comparation;

public class EmployeeForComparator {
    private int id;
    private String name;
    private String surname;
    private int salary;

    public EmployeeForComparator(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSalary() {
        return salary;
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
}
