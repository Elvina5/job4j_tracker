package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {
    private static final String INGREDIENT_CHEESE = " + extra cheese";

    public PizzaExtraCheese(String name) {
        super(name);
    }

    public PizzaExtraCheese() {
    }

    public String name() {
        return super.name() + INGREDIENT_CHEESE;
    }
}
