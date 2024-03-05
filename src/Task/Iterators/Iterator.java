/**
 * Iterator package
 */
package Task.Iterators;

/**
 * Iterator interface
 * @param <T> type of data
 */
public interface Iterator<T> {
    boolean hasNext();

    T next();
}
