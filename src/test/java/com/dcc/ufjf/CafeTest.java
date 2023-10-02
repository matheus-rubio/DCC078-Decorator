package com.dcc.ufjf;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CafeTest {

    @Test
    public void testCafeSimples() {
        ICafe cafeSimples = new CafePreto(1.0f);
        assertEquals("Café Preto", cafeSimples.getIngredientes());
        assertEquals(1.0f, cafeSimples.getValor(), 0.01);
    }

    @Test
    public void testCafeComChocolate() {
        ICafe cafeComChocolate = new Chocolate(new CafePreto(1.0f));
        assertEquals("Café Preto, Chocolate", cafeComChocolate.getIngredientes());
        assertEquals(2.25f, cafeComChocolate.getValor(), 0.01);
    }

    @Test
    public void testCafeComLeite() {
        ICafe cafeComLeite = new Leite(new CafePreto(1.0f));
        assertEquals("Café Preto, Leite", cafeComLeite.getIngredientes());
        assertEquals(2.5f, cafeComLeite.getValor(), 0.01);
    }

    @Test
    public void testCafeComCanela() {
        ICafe cafeComCanela = new Canela(new CafePreto(1.0f));
        assertEquals("Café Preto, Canela", cafeComCanela.getIngredientes());
        assertEquals(1.75f, cafeComCanela.getValor(), 0.01);
    }

    @Test
    public void testCafeComChocolateELeite() {
        ICafe cafeComChocolateELeite = new Leite(new Chocolate(new CafePreto(1.0f)));
        assertEquals("Café Preto, Chocolate, Leite", cafeComChocolateELeite.getIngredientes());
        assertEquals(3.75f, cafeComChocolateELeite.getValor(), 0.01);
    }

    @Test
    public void testCafeComChocolateECanela() {
        ICafe cafeComChocolateECanela = new Canela(new Chocolate(new CafePreto(1.0f)));
        assertEquals("Café Preto, Chocolate, Canela", cafeComChocolateECanela.getIngredientes());
        assertEquals(3.0f, cafeComChocolateECanela.getValor(), 0.01);
    }

    @Test
    public void testCafeComLeiteECanela() {
        ICafe cafeComLeiteECanela = new Canela(new Leite(new CafePreto(1.0f)));
        assertEquals("Café Preto, Leite, Canela", cafeComLeiteECanela.getIngredientes());
        assertEquals(3.25f, cafeComLeiteECanela.getValor(), 0.01);
    }

    @Test
    public void testCafeComChocolateLeiteECanela() {
        ICafe cafeComChocolateLeiteECanela = new Canela(new Leite(new Chocolate(new CafePreto(1.0f))));
        assertEquals("Café Preto, Chocolate, Leite, Canela", cafeComChocolateLeiteECanela.getIngredientes());
        assertEquals(4.5f, cafeComChocolateLeiteECanela.getValor(), 0.01);
    }
}
