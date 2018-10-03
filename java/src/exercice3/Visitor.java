package exercice3;


public abstract class Visitor {


    public abstract Object visit(Variable v);

    public abstract Object visit(Constante c);

    public Object visit(Expression e) {
        return null;
    }

    public abstract Object visit(Plus p);

    public abstract Object visit(Moins m);

    public abstract Object visit(Diviser d);

    public abstract Object visit(Multiplication m);
}
