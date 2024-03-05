package Task.Filters;

public interface Filter<T> {
    boolean matches(T item, String condition);
}
