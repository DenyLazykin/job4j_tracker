package ru.job4j.zaurlambda;

import java.util.ArrayList;
import java.util.function.Supplier;

public class CarInfo {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arrayList.add(carSupplier.get());
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() ->
                new Car("Hyundai Elantra", "Black", 2D));
        System.out.println("Our cars: " + ourCars);
    }
}
