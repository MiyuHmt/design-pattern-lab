package exercice2;


import java.util.NoSuchElementException;

public class InfixeIterator extends ExpressionIterator {

    public InfixeIterator(Expression root){
        super();
        infixe(root);
    }

    public void infixe(Expression exp){
        if(exp instanceof OpBinaire){
            Expression left=((OpBinaire) exp).exp1;
            infixe(left);
        }
        if (exp != null) {
            queue.add(exp);
        }

        if(exp instanceof OpBinaire){
            Expression right=((OpBinaire) exp).exp2;
            infixe(right);
        }
    }
}
