package exercice1;
public class Moins extends OpBinaire {

    /**
     * constructeur de Moins
     * @param exp1
     * @param exp2
     */
    public Moins(Expression exp1, Expression exp2) {
        super(exp1, exp2);
    }

    /**
     *
     * @param exp1
     * @param exp2
     * @return le résultat de la soustraction
     */
    public int operation(int exp1, int exp2) {
        return exp1-exp2;
    }

    public String typeOperation() {
        return "-";
    }

}
