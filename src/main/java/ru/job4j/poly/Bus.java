package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Я поехал");
    }

    @Override
    public void passengers(int count) {
        int passengers = count;
    }

    @Override
    public int refuel(int fuel) {
        int gas = 0;
        gas += fuel;
        return gas;
    }
}
