package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {
    private static final String INGREDIENT_CHEESE = " + extra cheese";

    public String name() {
        return super.name() + INGREDIENT_CHEESE;
    }
}
