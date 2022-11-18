package ru.job4j.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BankServiceTest {
    @Test
    public void addUser() {
        User user = new User("3434", "Denis Lazykin");
        BankService bankService = new BankService();
        bankService.addUser(user);
        assertThat(bankService.findByPassport("3434")).isEqualTo(user);
    }

    @Test
    public void deleteUserIsTrue() {
        User first = new User("3434", "Denis Lazykin");
        User second = new User("3434", "Denis Lazykin");
        BankService bankService = new BankService();
        bankService.addUser(first);
        bankService.addUser(second);
        assertThat(bankService.deleteUser("3434")).isTrue();
    }

    @Test
    public void deleteUserIsFalse() {
        User user = new User("3434", "Denis Lazykin");
        BankService bankService = new BankService();
        bankService.addUser(user);
        assertThat(bankService.deleteUser("1111")).isFalse();
    }

    @Test
    public void whenEnterInvalidPassport() {
        User user = new User("3434", "Denis Lazykin");
        BankService bankService = new BankService();
        bankService.addUser(user);
        bankService.addAccount(user.getPassport(), new Account("5546", 150D));
        assertThat(bankService.findByRequisite("34", "5546")).isNull();
    }

    @Test
    public void whenAddAccount() {
        User user = new User("3434", "Denis Lazykin");
        BankService bankService = new BankService();
        bankService.addUser(user);
        bankService.addAccount(user.getPassport(), new Account("5546", 150D));
    }

    @Test
    public void whenDuplicateAccount() {
        User user = new User("3434", "Denis Lazykin");
        BankService bankService = new BankService();
        bankService.addUser(user);
        bankService.addAccount(user.getPassport(), new Account("5546", 150D));
        bankService.addAccount(user.getPassport(), new Account("5546", 500D));
        assertThat(bankService.getAccounts(user).size()).isEqualTo(1);
    }

    @Test
    public void whenTransferMoneyOk() {
        User user = new User("3434", "Denis Lazykin");
        BankService bankService = new BankService();
        bankService.addUser(user);
        bankService.addAccount(user.getPassport(), new Account("5546", 150D));
        bankService.addAccount(user.getPassport(), new Account("112", 50D));
        bankService.transferMoney(user.getPassport(), "5546", user.getPassport(), "112", 150D);
        assertThat(bankService.findByRequisite(user.getPassport(), "112").getBalance()).isEqualTo(200D);
    }

    @Test
    public void whenTransferMoneySourceNull() {
        User user = new User("3434", "Denis Lazykin");
        BankService bankService = new BankService();
        bankService.addUser(user);
        bankService.addAccount(user.getPassport(), new Account("5546", 150D));
        bankService.addAccount(user.getPassport(), new Account("112", 50D));
        bankService.transferMoney(user.getPassport(), "554", user.getPassport(), "112", 150D);
        assertThat(bankService.findByRequisite(user.getPassport(), "5546").getBalance()).isEqualTo(150D);
    }

    @Test
    public void whenTransferMoneyDontHaveEnoughMoney() {
        User user = new User("3434", "Denis Lazykin");
        BankService bankService = new BankService();
        bankService.addUser(user);
        bankService.addAccount(user.getPassport(), new Account("5546", 150D));
        bankService.addAccount(user.getPassport(), new Account("112", 50D));
        bankService.transferMoney(user.getPassport(), "5546", user.getPassport(), "112", 300D);
        assertThat(bankService.findByRequisite(user.getPassport(), "112").getBalance()).isEqualTo(50D);
    }

    @Test
    public void transferMoneyDestinationsIsNull() {
        User user = new User("3434", "Denis Lazykin");
        BankService bankService = new BankService();
        bankService.addUser(user);
        bankService.addAccount(user.getPassport(), new Account("5546", 150D));
        bankService.addAccount(user.getPassport(), new Account("112", 50D));
        bankService.transferMoney(user.getPassport(), "5546", user.getPassport(), "1112", 150D);
        assertThat(bankService.findByRequisite(user.getPassport(), "5546").getBalance()).isEqualTo(150D);
    }
}