package exercice3;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public abstract class ExpressionIterator {

    protected Queue<Expression> queue;

    public ExpressionIterator(){
        queue = new LinkedList<Expression>();
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }
    public Expression next() throws NoSuchElementException {
        if(hasNext()){
            return queue.poll();
        }else{
            throw new NoSuchElementException();
        }
    }

}