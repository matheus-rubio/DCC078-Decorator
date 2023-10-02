package com.dcc.ufjf;

public class CafePreto implements ICafe {

    private float valor;

    public CafePreto(float valor) {
        this.valor = valor;
    }

    @Override
    public float getValor() {
        return this.valor;
    }

    @Override
    public String getIngredientes() {
        return "Café Preto";
    }
}