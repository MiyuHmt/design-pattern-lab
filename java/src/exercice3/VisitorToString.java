package exercice3;

public class VisitorToString extends Visitor {


    @Override

    public Object visit(Variable v) {
        return ""+v.varName;
    }

    public Object visit(Constante c){
        return ""+c.value;
    }

    public Object visit(Plus p) {
        return p.exp1.accept(this)+" + "+p.exp2.accept(this);
    }

    public Object visit(Moins m) {
        return m.exp1.accept(this)+" - "+m.exp2.accept(this);
    }

    public Object visit(Multiplication m) {
        return m.exp1.accept(this)+" * "+m.exp2.accept(this);
    }

    public Object visit(Diviser d) {
        return d.exp1.accept(this)+" / "+d.exp2.accept(this);
    }

}
