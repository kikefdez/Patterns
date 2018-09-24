package Interface;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
