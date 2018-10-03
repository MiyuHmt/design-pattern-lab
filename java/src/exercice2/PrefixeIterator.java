package exercice2;


import java.util.NoSuchElementException;

public class PrefixeIterator extends ExpressionIterator {

    public PrefixeIterator(Expression root){
        super();
        prefixe(root);
    }

    public void prefixe(Expression exp){
        if (exp != null) {
            queue.add(exp);
        }
        if(exp instanceof OpBinaire){
            Expression left=((OpBinaire) exp).exp1;
            prefixe(left);
        }
        if(exp instanceof OpBinaire){
            Expression right=((OpBinaire) exp).exp2;
            prefixe(right);
        }
    }

}

