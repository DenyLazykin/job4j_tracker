package ru.job4j.stream.builder;

/**
 * Модель данных для пользователя.
 */
public class User {
    private String name;
    private String surname;
    private byte age;
    private String login;
    private String password;
    private boolean activated;
    private String gender;

    @Override
    public String toString() {
        return String.format("User(name=%s , surname=%s , age=%s , login=%s , password=%s , activated=%s , gender=%s)",
                this.name,
                this.surname,
                this.age,
                this.login,
                this.password,
                this.activated,
                this.gender);
    }

    /**
     * Вложенный класс для реализации шаблона строитель.
     */
    static class Builder {
        private String name;
        private String surname;
        private byte age;
        private String login;
        private String password;
        private boolean activated;
        private String gender;

        /**
         * Метод для ининциализации поля name.
         *
         * @param name Имя
         * @return Имя пользователя
         */
        Builder buildName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Метод для ининциализации поля surname.
         *
         * @param surname Фамилия
         * @return Фамилию пользователя
         */

        Builder buildSurName(String surname) {
            this.surname = surname;
            return this;
        }

        /**
         * Метод для ининциализации поля age.
         *
         * @param age Возраст
         * @return Возраст пользователя
         */
        Builder buildAge(byte age) {
            this.age = age;
            return this;
        }

        /**
         * Метод для ининциализации поля login.
         *
         * @param login Логин
         * @return Логин пользователя
         */
        Builder buildLogin(String login) {
            this.login = login;
            return this;
        }

        /**
         * Метод для ининциализации поля password.
         *
         * @param password Пароль
         * @return Пароль пользователя
         */
        Builder buildPassword(String password) {
            this.password = password;
            return this;
        }

        /**
         * Метод для ининциализации поля activated.
         *
         * @param activated Активация
         * @return True - если есть активация
         */
        Builder buildActivated(boolean activated) {
            this.activated = activated;
            return this;
        }

        /**
         * Метод для ининциализации поля gender.
         *
         * @param gender Пол
         * @return Пол пользователя
         */
        Builder buildGender(String gender) {
            this.gender = gender;
            return this;
        }

        /**
         * Метод строит готовый объект, и позвращает его экземпляр.
         *
         * @return Готовый экземпляр класса User
         */
        User build() {
            User user = new User();
            user.name = name;
            user.surname = surname;
            user.age = age;
            user.login = login;
            user.password = password;
            user.activated = activated;
            user.gender = gender;
            return user;
        }
    }
}

class UserMain {
    public static void main(String[] args) {
        User user = new User.Builder().buildName("Den")
                .buildSurName("Lazykin")
                .buildAge((byte) 33)
                .buildLogin("lazy420")
                .buildPassword("!secretWordS")
                .buildActivated(true)
                .buildGender("male")
                .build();
        System.out.println(user);
    }
}
