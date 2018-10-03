package exercice1;

import static org.junit.Assert.*;

import com.sun.tools.internal.jxc.ap.Const;
import org.junit.Test;

public class TestMoins {

    @Test
    public void testOperation1() {
        Constante c4 = new Constante(10);
        Constante c3 = new Constante(9);
        Moins m2 = new Moins(c4,c3);
        int resultat1 = m2.evaluate(new Contexte());
        assertEquals("Should be 1", 1, resultat1);

    }

    @Test
    public void testToString() {
        Constante c1 = new Constante(6);
        Constante c2 = new Constante(5);
        Moins m1 = new Moins(c1,c2);
        String s1 = m1.toString();
        assertEquals("Should be (6-5)", "(6-5)", s1);
    }

}
