package ru.job4j.lambda;

public interface FuncInterface {
    Model function(String s);
}

class Model {
    private String name;

    public Model() {
    }

    public Model(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }
}

class ConstructorFerMain {
    public static void main(String[] args) {
        FuncInterface modelConstructor = Model::new;
        Model model = modelConstructor.function("Example");
        System.out.println("Значение равно: " + model.getName());
    }
}
