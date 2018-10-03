package exercice2;

public abstract class Expression {
	public abstract String toString();
	public abstract int evaluate(Contexte c);

	public ExpressionIterator getInfixeIterator() {
		ExpressionIterator iterator = new InfixeIterator(this);
		return iterator;
	}
}
