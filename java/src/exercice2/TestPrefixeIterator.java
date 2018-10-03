package exercice2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPrefixeIterator {

    private Expression  p1;
    private Contexte context;

    @Before
    public void setUp() {
        Constante c1 = new Constante(6);
        Constante c2 = new Constante(8);

        this.context = new Contexte();
        context.addMapValue("x", 26);

        this.p1 = new Multiplication(c1,c2);

    }

    @Test
    public void testHasNext() {
        ExpressionIterator i = new PrefixeIterator(new Constante(6));
        boolean b = i.hasNext();
        assertTrue(b);
        try {
            i.next();
        } catch (Exception exp) {
            exp.printStackTrace();
        }
        boolean b2 = i.hasNext();
        assertFalse(b2);
    }

    @Test
    public void testRF() {
        ExpressionIterator i = new PrefixeIterator(new Constante(6));
        Expression exp = null;
        try {
            exp = i.next();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        assertEquals("should be '6'","6",exp.toString());
    }

    @Test
    public void testAsymetric() {
        ExpressionIterator i = new PrefixeIterator(new Plus(p1,new Variable("x")));
        Expression exp = null;

        try {
            exp = i.next();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        assertEquals("should be '((6*8)+x)'","((6*8)+x)",exp.toString());

        try {
            exp = i.next();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        assertEquals("should be '(6*8)'","(6*8)",exp.toString());

        try {
            exp = i.next();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        assertEquals("should be '6'","6",exp.toString());

        try {
            exp = i.next();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        assertEquals("should be '8'","8",exp.toString());

        try {
            exp = i.next();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        assertEquals("should be 'x'","x",exp.toString());

    }

    @Test(expected = Exception.class)
    public void testException() throws Exception {
        ExpressionIterator i = new PrefixeIterator(null);
        i.next();
    }

}
