package exercice1;

import static org.junit.Assert.*;
import org.junit.Test;


public class TestMultiplication {

    @Test
    public void testOperation1() {
        Constante c4 = new Constante(10);
        Constante c3 = new Constante(9);
        Multiplication m2 = new Multiplication(c4,c3);
        int resultat = m2.evaluate(new Contexte());
        assertEquals("Should be 90", 90, resultat);

    }

    @Test
    public void testToString() {
        Constante c1 = new Constante(6);
        Constante c2 = new Constante(5);
        Multiplication m1 = new Multiplication(c1,c2);
        String s1 = m1.toString();
        assertEquals("Should be (6*5)", "(6*5)", s1);
    }


}
