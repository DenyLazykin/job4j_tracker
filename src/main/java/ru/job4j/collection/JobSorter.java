package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl task", 2),
                new Job("Reboot server", 1),
                new Job("X task", 0)
        );
        jobs.sort(new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println(jobs);
        Comparator<Job> comparatorName = Comparator.comparing(Job::getName);
        Comparator<Job> comparatorPriority = Comparator.comparing(Job::getPriority);
        Comparator<Job> comparatorComboNamePriority = comparatorName.thenComparing(comparatorPriority);
        jobs.sort(comparatorComboNamePriority);
        System.out.println(jobs);
     }
}
