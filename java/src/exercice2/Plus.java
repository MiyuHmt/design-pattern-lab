package exercice2;

public class Plus extends OpBinaire {

    /**
     * Constructeur
     * @param exp1
     * @param exp2
     */
	public Plus(Expression exp1, Expression exp2) {
		super(exp1, exp2);
	}

    public int operation(int exp1, int exp2) {
        return exp1+exp2;
    }


	public String typeOperation() {
	    return "+";
	}

}
