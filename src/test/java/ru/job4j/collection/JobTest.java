package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;

class JobTest {
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority =
                new JobDescByName().thenComparing(new JobDescByPriority());
        int result = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenAscName() {
        Comparator<Job> cmpAscName = new JobAscByName();
        int result = cmpAscName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void whenAscPriority() {
        Comparator<Job> cmpAscPriority = new JobAscByPriority();
        int result = cmpAscPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenDescName() {
        Comparator<Job> cmpDescName = new JobDescByName();
        int result = cmpDescName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenDescPriority() {
        Comparator<Job> cmpDescPriority = new JobDescByPriority();
        int result = cmpDescPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void whenDescPrioritySomePriority() {
        Comparator<Job> cmpDescPriority = new JobDescByPriority();
        int result = cmpDescPriority.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 1)
        );
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void whenAscNameSomeName() {
        Comparator<Job> cmpAscName = new JobAscByName();
        int result = cmpAscName.compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)
        );
        assertThat(result).isEqualTo(0);
    }
}