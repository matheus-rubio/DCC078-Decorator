package com.dcc.ufjf;

public class Canela extends CafeDecorator {

    public Canela(ICafe cafe) {
        super(cafe);
    }

    public float getValorIngrediente() {
        return 0.75f;
    }

    public String getNomeIngrediente() {
        return "Canela";
    }

}