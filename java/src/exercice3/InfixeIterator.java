package exercice3;


public class InfixeIterator extends ExpressionIterator {

    public InfixeIterator(Expression root){
        super();
        infixe(root);
    }

    public void infixe(Expression e){
        if(e instanceof OpBinaire){
            Expression left=((OpBinaire) e).exp1;
            infixe(left);
        }
        if (e != null) {
            queue.add(e);
        }

        if(e instanceof OpBinaire){
            Expression right=((OpBinaire) e).exp2;
            infixe(right);
        }
    }
}
