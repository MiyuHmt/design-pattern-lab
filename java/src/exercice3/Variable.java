package exercice3;

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

	public Object accept(Visitor v) {
		return v.visit(this);
	}
}
