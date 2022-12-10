package ru.job4j.stream.builder;

import java.time.LocalDate;

public class Car {
    private String brand;
    private String model;
    private LocalDate created;
    private double volume;
    private String color;

    @Override
    public String toString() {
        return String.format("Car(brand=%s , model=%s , created=%s , volume=%s , color=%s)",
                this.brand,
                this.model,
                this.created,
                this.volume,
                this.color);
    }

    static class Builder {
        private String brand;
        private String model;
        private LocalDate created;
        private double volume;
        private String color;

        Builder buildBrand(String brand) {
            this.brand = brand;
            return this;
        }

        Builder buildModel(String model) {
            this.model = model;
            return this;
        }

        Builder buildCreated(LocalDate created) {
            this.created = created;
            return this;
        }

        Builder buildVolume(double volume) {
            this.volume = volume;
            return this;
        }

        Builder buildColor(String color) {
            this.color = color;
            return this;
        }

        Car build() {
            Car car = new Car();
            car.brand = brand;
            car.model = model;
            car.created = created;
            car.volume = volume;
            car.color = color;
            return car;
        }
    }
}

class CarBuild {
    public static void main(String[] args) {
        Car carElantra = new Car.Builder()
                .buildBrand("Hyundai")
                .buildModel("Elantra")
                .buildCreated(LocalDate.of(2008, 1, 1))
                .buildVolume(2.0)
                .buildColor("Black")
                .build();
        System.out.println(carElantra);
        Car carAccent = new Car.Builder()
                .buildBrand("Hyundai")
                .buildModel("Accent")
                .buildColor("Black")
                .build();
        System.out.println(carAccent);
    }
}