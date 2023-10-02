package com.dcc.ufjf;

public class Chocolate extends CafeDecorator {

    public Chocolate(ICafe cafe) {
        super(cafe);
    }

    public float getValorIngrediente() {
        return 1.25f;
    }

    public String getNomeIngrediente() {
        return "Chocolate";
    }
}