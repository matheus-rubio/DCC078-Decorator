package com.dcc.ufjf;

public abstract class CafeDecorator implements ICafe {

    private ICafe cafe;

    public CafeDecorator(ICafe cafe) {
        this.cafe = cafe;
    }

    public ICafe getCafe() {
        return cafe;
    }

    public void setCafe(ICafe cafe) {
        this.cafe = cafe;
    }

    public abstract float getValorIngrediente();
    public abstract String getNomeIngrediente();

    public float getValor() {
        return this.cafe.getValor() + this.getValorIngrediente();
    }

    public String getIngredientes() {
        return this.cafe.getIngredientes() + ", " + this.getNomeIngrediente();
    }
}