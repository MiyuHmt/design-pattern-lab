package exercice1;

import static org.junit.Assert.*;

import com.sun.tools.internal.jxc.ap.Const;
import org.junit.Test;

public class TestPlus {

    @Test
    public void testOperation1() {
        Constante c4 = new Constante(29);
        Constante c3 = new Constante(1);
        Plus p2 = new Plus(c4,c3);
        int resultat1 = p2.evaluate(new Contexte());
        assertEquals("Should be 30", 30, resultat1);

    }

    @Test
    public void testToString() {
        Constante c1 = new Constante(8);
        Constante c2 = new Constante(12);
        Plus p1 = new Plus(c1,c2);
        String s1 = p1.toString();
        assertEquals("Should be (8+12)", "(8+12)", s1);
    }

}
