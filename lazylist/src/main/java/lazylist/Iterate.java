package lazylist;

import java.util.Iterator;

public class Iterate<E> implements Iterator<E> {

    private FunctionAtoB<E, E> f;
    private E nextValue;

    public Iterate(FunctionAtoB<E, E> f, E init) {
        this.f = f;
        this.nextValue = init;
    }

    public boolean hasNext() {
        return true;
    }

    public E next() {
        E tmp = nextValue;
        nextValue = f.execute(nextValue);
        return tmp;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

}
