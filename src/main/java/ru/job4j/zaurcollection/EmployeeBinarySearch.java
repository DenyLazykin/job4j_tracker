package ru.job4j.zaurcollection;

import java.util.Objects;

public class EmployeeBinarySearch implements Comparable<EmployeeBinarySearch> {
    private int id;
    private String name;
    private int salary;

    public EmployeeBinarySearch(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "EmployeeBinarySearch{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", salary=" + salary
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmployeeBinarySearch that = (EmployeeBinarySearch) o;
        return id == that.id && salary == that.salary && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }

    @Override
    public int compareTo(EmployeeBinarySearch o) {
        int nameCompare = o.name.compareTo(name);
        return nameCompare != 0 ? Integer.compare(o.id, id) : nameCompare;
    }
}
