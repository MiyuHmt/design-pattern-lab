package exercice3;

public class Diviser extends OpBinaire {

    /**
     * Constructeur Diviser
     * @param exp1
     * @param exp2
     */
    public Diviser(Expression exp1, Expression exp2) {
        super(exp1, exp2);
    }

    /**
     *
     * @param exp1
     * @param exp2
     * @return le résultat de la division
     */
    public int operation(int exp1, int exp2) {
        return exp1/exp2;
    }

    public String typeOperation() {
        return "/";
    }

    public Object accept(Visitor v) {
        return v.visit(this);
    }

}
