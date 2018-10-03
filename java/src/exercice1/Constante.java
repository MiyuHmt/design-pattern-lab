package exercice1;

import javax.naming.Context;

public class Constante implements Expression {


	public Constante(int value) {
		this.value = value;
	}

	public int value;


	public int evaluate(Contexte c) {
		return value;
	}

	/**
	 *
	 * @return l'expression
	 */
	public String toString() {
		return ""+value;
	}
	
	

}
