package ru.job4j.cpecialistlection;

public class Program {
    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();
        switcher.addElectricityListener(lamp);
        switcher.addElectricityListener(radio);
        switcher.addElectricityListener(
                () -> System.out.println("Пожар")
        );
        switcher.switchOn();
    }
}
