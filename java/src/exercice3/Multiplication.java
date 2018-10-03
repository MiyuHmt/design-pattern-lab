package exercice3;

public class Multiplication extends OpBinaire {

    /**
     * Constructeur
     * @param exp1
     * @param exp2
     */
    public Multiplication(Expression exp1, Expression exp2) {
        super(exp1, exp2);
    }

    public int operation(int exp1, int exp2) {
        return exp1*exp2;
    }


    public String typeOperation() {
        return "*";
    }

    public Object accept(Visitor v) {
        return v.visit(this);
    }
}
