package ru.job4j.zaurlambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class CarInfo {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arrayList.add(carSupplier.get());
        }
        return arrayList;
    }

    public static  void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() ->
                new Car("Hyundai Elantra", "Black", 2D));
        System.out.println("Our cars: " + ourCars);
        System.out.println();
        System.out.println("Consumer demonstration");
        changeCar(ourCars.get(0), car -> {
            car.color = "red";
            car.engine = 3.5;
            System.out.println("upgrade car: " + car);
        });
    }
}
