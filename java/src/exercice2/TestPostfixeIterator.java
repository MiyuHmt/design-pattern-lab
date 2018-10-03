package exercice2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPostfixeIterator {

    private Expression  p1;
    private Contexte c;

    @Before
    public void setUp() {
        Constante c1 = new Constante(2);
        Constante c2 = new Constante(5);

        this.c = new Contexte();
        c.addMapValue("a", 26);

        this.p1 = new Multiplication(c1,c2);
    }

    @Test
    public void testHasNext() {
        ExpressionIterator i = new PostfixeIterator(new Constante(2));
        boolean b = i.hasNext();
        assertTrue(b);
        try {
            i.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean b2 = i.hasNext();
        assertFalse(b2);
    }

    @Test
    public void testRacineFeuille() {
        ExpressionIterator i = new PostfixeIterator(new Constante(2));
        Expression e = null;
        try {
            e = i.next();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        assertEquals("should be '2'","2",e.toString());
    }

    @Test
    public void testAsymetrique() {
        ExpressionIterator i = new PostfixeIterator(new Moins(p1,new Variable("a")));
        Expression e = null;
        try {
            e = i.next();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        assertEquals("should be '2'","2",e.toString());

        try {
            e = i.next();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        assertEquals("should be '5'","5",e.toString());

        try {
            e = i.next();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        assertEquals("should be '(2*5)'","(2*5)",e.toString());

        try {
            e = i.next();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        assertEquals("should be 'a'","a",e.toString());

        try {
            e = i.next();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        assertEquals("should be '((2*5)-a)'","((2*5)-a)",e.toString());

    }

    @Test(expected = Exception.class)
    public void testException() throws Exception {
        ExpressionIterator i = new PostfixeIterator(null);
        i.next();
    }

}
