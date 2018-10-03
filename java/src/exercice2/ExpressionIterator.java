package exercice2;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import java.util.Stack;

public abstract class ExpressionIterator {

    protected Queue<Expression> queue;

    public boolean hasNext() {
        return !queue.isEmpty();
    }

    public ExpressionIterator(){
        queue = new LinkedList<Expression>();
    }

    public Expression next() throws NoSuchElementException {
        if(hasNext()){
            return queue.poll();
        }else{
            throw new NoSuchElementException();
        }
    }

}