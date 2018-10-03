package exercice3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestConstante {

    @Test
    public void testEvaluate() {
        Constante c1= new Constante(12);
        int resultat = c1.evaluate(new Contexte());
        assertEquals("Should be 12", 12, resultat);
    }
}
