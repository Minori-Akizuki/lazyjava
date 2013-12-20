package lazylist;

/**
 * 
 * @author Minori
 *
 * @param <A>
 * @param <B>
 */
public interface FunctionAtoB<A, B> {
    B execute(A param);
}
