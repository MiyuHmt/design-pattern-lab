package exercice3;

public class EvaluateVisitor extends Visitor {

    private Contexte c;

    public EvaluateVisitor(Contexte c) {
        this.c = c;
    }

    @Override

    public Object visit (Variable v) {
        return this.c.getValue(v.varName);
    }

    public Object visit (Constante c){
        return c.value;
    }

    public Object visit (Plus p) {
        return ((Integer)p.exp1.accept(this))+((Integer)p.exp2.accept(this));
    }

    public Object visit (Moins m) {
        return ((Integer)m.exp1.accept(this))-((Integer)m.exp2.accept(this));
    }

    public Object visit (Multiplication m) {
        return ((Integer)m.exp1.accept(this))*((Integer)m.exp2.accept(this));
    }

    public Object visit (Diviser d) {
        return ((Integer)d.exp1.accept(this))/((Integer)d.exp2.accept(this));
    }

}
