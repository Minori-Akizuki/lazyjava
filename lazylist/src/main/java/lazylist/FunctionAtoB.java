package lazylist;

public interface FunctionAtoB<A, B> {
    B execute(A param);
}
