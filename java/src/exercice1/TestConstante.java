package exercice1;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestConstante {

    @Test
    public void testEvaluate() {
        Constante c1= new Constante(4);
        int resultat = c1.evaluate(new Contexte());
        assertEquals("Should be 4", 4, resultat);
    }
}
