package exercice3;

public class Constante extends Expression {


	public Constante(int value) {
		this.value = value;
	}

	public int value;


	public int evaluate(Contexte c) {
		return value;
	}

	public Object accept(Visitor v) {
		return v.visit(this);
	}
	
	

}
