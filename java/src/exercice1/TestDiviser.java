package exercice1;

import static org.junit.Assert.*;
import org.junit.Test;


public class TestDiviser {

    @Test
    public void testOperation1() {
        Constante c4 = new Constante(10);
        Constante c3 = new Constante(1);
        Diviser d2 = new Diviser(c4,c3);
        int resultat = d2.evaluate(new Contexte());
        assertEquals("Should be 10", 10, resultat);
    }

    @Test
    public void testToString() {
        Constante c1 = new Constante(6);
        Constante c2 = new Constante(5);
        Diviser d1 = new Diviser(c1,c2);
        String s1 = d1.toString();
        assertEquals("Should be (6/5)", "(6/5)", s1);
    }

    // division par zéro
    @Test(expected = Exception.class)
    public void testZero() {
        Constante c1 = new Constante(8);
        Constante c2 = new Constante(0);
        Diviser d3 = new Diviser(c1,c2);
        int resultat = d3.evaluate(new Contexte());
    }

}
