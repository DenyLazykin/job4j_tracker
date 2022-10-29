package ru.job4j.oop;

public class Computer {
    private boolean multiMonitor;
    private int ssd;
    private String cpu;

    public Computer() {
    }

    public Computer(int ssd, String cpu) {
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public void printInfo() {
        System.out.println("Много мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("Модель CPU: " + cpu);
        System.out.println();
    }

    public static void main(String[] args) {
        Computer computer = new Computer(true, 500, "Intel Core I7-10700K");
        Computer computer1 = new Computer();
        Computer comp = new Computer(true, 256, "AMD Ryzen 5 3600");
        comp.printInfo();
        computer.printInfo();
        computer1.printInfo();
        Computer first = new Computer();
        Computer second = new Computer(true, 500, "Intel Core I7-10700K");
        Computer third = new Computer(256, "AMD Ryzen 5 3600");
        first.printInfo();
        second.printInfo();
        third.printInfo();
    }
}
