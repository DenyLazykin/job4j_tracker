package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class NotifyAccountTest {
    @Test
    public void whenTwoAccountsAddSent() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Denis Lazykin", "yRte3412F"),
                new Account("143", "Denis Lazykin", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Denis Lazykin", "yRte3412F"),
                        new Account("143", "Denis Lazykin", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts)).containsAll(expect);
    }

    @Test
    public void whenOneAccountsAddSent() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Denis Lazykin", "yRte3412F"),
                new Account("123", "Denis Lazykin", "yRte3412F"),
                new Account("143", "Denis Lazykin", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Denis Lazykin", "yRte3412F"),
                        new Account("123", "Denis Lazykin", "yRte3412F"),
                        new Account("143", "Denis Lazykin", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts)).containsAll(expect);
    }
}