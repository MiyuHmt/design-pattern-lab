package exercice1;
public abstract class OpBinaire implements Expression {
	
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
     * @return
     */
	public int evaluate(Contexte c){
	    return this.operation(this.exp1.evaluate(c), this.exp2.evaluate(c));
    };

	public String toString(){
	    return "("+this.exp1+this.typeOperation()+this.exp2+")";
    }

    /**
     *
     * @return chaîne de caractères correspondant à l'opération
     */
    protected abstract String typeOperation();

	protected abstract int operation(int exp1, int exp2);

}
