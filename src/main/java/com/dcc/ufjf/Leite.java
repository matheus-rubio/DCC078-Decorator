package com.dcc.ufjf;

public class Leite extends CafeDecorator {

    public Leite(ICafe cafe) {
        super(cafe);
    }

    public float getValorIngrediente() {
        return 1.50f;
    }

    public String getNomeIngrediente() {
        return "Leite";
    }
}