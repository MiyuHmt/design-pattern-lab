package exercice2;

public class Variable extends Expression {

	public String varName;
	public int value;

	public Variable(String varName) {
		this.varName = varName;
	}

	public int evaluate(Contexte c) {
		return c.getValue(this.varName);
	}
	public String toString() {
		return ""+varName;
	}
}
