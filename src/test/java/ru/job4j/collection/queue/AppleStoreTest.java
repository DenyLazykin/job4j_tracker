package ru.job4j.collection.queue;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.assertj.core.api.Assertions.assertThat;

class AppleStoreTest {
    @Test
    void whenGetLast() {
        Queue<Customer> customers = new LinkedList<>();
        customers.add(new Customer("Petr", 1000));
        customers.add(new Customer("Stas", 1000));
        customers.add(new Customer("Andrey", 1000));
        customers.add(new Customer("Alexei", 1000));
        customers.add(new Customer("Iryna", 1000));
        customers.add(new Customer("Elena", 1000));
        customers.add(new Customer("Rail", 1000));
        int count = 4;
        AppleStore appleStore = new AppleStore(customers, count);
        String customer = appleStore.getLastHappyCustomer();
        assertThat(customer).isEqualTo("Alexei");
    }

    @Test
    void whenGetFirst() {
        Queue<Customer> customers = new LinkedList<>();
        customers.add(new Customer("Petr", 1000));
        customers.add(new Customer("Stas", 1000));
        customers.add(new Customer("Andrey", 1000));
        customers.add(new Customer("Alexei", 1000));
        customers.add(new Customer("Iryna", 1000));
        customers.add(new Customer("Elena", 1000));
        customers.add(new Customer("Rail", 1000));
        int count = 4;
        AppleStore appleStore = new AppleStore(customers, count);
        String customer = appleStore.getLastUpsetCustomer();
        assertThat(customer).isEqualTo("Iryna");
    }
}