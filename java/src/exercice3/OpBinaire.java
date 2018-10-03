package exercice3;

public abstract class OpBinaire extends Expression {

	public Expression exp1;
	public Expression exp2;


    /**
     * constructeur de OpBinaire
     * @param exp1
     * @param exp2
     */
	public OpBinaire(Expression exp1, Expression exp2) {
		this.exp1 = exp1;
		this.exp2 = exp2;
	}



    /**
     *
     * @return chaîne de caractères correspondant à l'opération
     */
    protected abstract String typeOperation();

	protected abstract int operation(int exp1, int exp2);

}
