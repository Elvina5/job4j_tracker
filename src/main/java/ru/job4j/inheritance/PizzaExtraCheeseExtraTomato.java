package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends  PizzaExtraCheese {
    private static final String INGREDIENT_TOMATO = " + extra tomato";

    public PizzaExtraCheeseExtraTomato(String name) {
        super(name);
    }

    public PizzaExtraCheeseExtraTomato() {
    }

    public String name() {
        return super.name() + INGREDIENT_TOMATO;
    }
}

