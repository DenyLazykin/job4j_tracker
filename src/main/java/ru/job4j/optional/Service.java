package ru.job4j.optional;

import ru.job4j.bank.Account;
import ru.job4j.bank.User;

import java.util.*;

public class Service {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public Optional<User> findByPassport(String passport) {
        Optional<User> result = Optional.empty();
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                result = Optional.of(user);
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Service service = new Service();
        service.addUser(new User("123", "Deny Lazy"));
        Optional<User> optional = service.findByPassport("1232");
        if (optional.isPresent()) {
            System.out.println(optional.get().getUsername());
        }
    }
}
