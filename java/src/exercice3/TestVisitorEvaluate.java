package exercice3;

import  static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class TestVisitorEvaluate {
    private Expression e1, e2, e3, e4;
    private Contexte context1;
    private Visitor v;

    @Before
    public void before() {
        Variable x = new Variable("x");
        Constante c1 = new Constante(8);
        Constante c2 = new Constante(3);
        context1 = new Contexte();
        context1.addMapValue("x", 23);


        this.e1 = new Plus(c1,c2);
        this.e2 = new Moins(c1,c2);
        this.e3 = new Diviser(c1,c2);
        this.e4 = new Multiplication(c1,c2);

    }

    @Test
    public void testCste() {
        context1 = new Contexte();
        context1.addMapValue("x", 3);
        v = new EvaluateVisitor(this.context1);
        assertEquals("Should be 3", 3,context1.getValue("x"));
    }

    @Test
    public void testVariable() {
        context1 = new Contexte();
        context1.addMapValue("y", 10);
        v = new EvaluateVisitor(this.context1);
        assertEquals("should be 10",10,context1.getValue("y"));


    }

    @Test
    public void testPlus() {
        Constante cste1 = new Constante(11);
        v = new EvaluateVisitor(this.context1);
        context1.addMapValue("cste1",11);
        Constante cste2 = new Constante(2);
        context1.addMapValue("cste2",2);
        Plus plus1 = new Plus(cste1,cste2);
        String s = plus1.typeOperation();
        assertEquals("Should be +","+",s);
    }


    @Test
    public void testTree() {
        v = new EvaluateVisitor(this.context1);
        context1.addMapValue("cste1",11);
        context1.addMapValue("cste2",2);
        Constante cste1 = new Constante(11);
        Constante cste2 = new Constante(2);

        Plus plus1 = new Plus(cste1,cste2);

        int s3 = (Integer)v.visit(plus1);
        Object v = new VisitorToString().visit(plus1);

        Variable var1 = new Variable("x");

        Moins m1 = new Moins(cste2,var1);

        context1.addMapValue("x",1);

        Object v2 = new VisitorToString().visit(m1);

        assertEquals("Should be 11 + 2","11 + 2", v);

        assertEquals("Should be 2 - x ","2 - x", v2);

    }

}
