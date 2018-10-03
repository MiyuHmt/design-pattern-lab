package exercice2;


import java.util.NoSuchElementException;

public class PostfixeIterator extends ExpressionIterator {

    public PostfixeIterator(Expression root){
        super();
        postfixe(root);
    }

    public void postfixe(Expression exp){

        if(exp instanceof OpBinaire) {
            Expression gauche = ((OpBinaire) exp).exp1;
            postfixe(gauche);
        }
        if(exp instanceof OpBinaire){
            Expression droite =((OpBinaire) exp).exp2;
            postfixe(droite);
        }

        if (exp != null) {
            queue.add(exp);
        }

    }

}

