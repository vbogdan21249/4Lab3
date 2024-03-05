package Task.Filters;
/**
 * Represents a generic filter interface that can be used for matching items based on a condition.
 *
 * @param <T> the type of items to filter
 */
public interface Filter<T> {
    /**
     * Determines whether the given item matches the specified condition.
     *
     * @param item      the item to check against the condition
     * @param condition the condition to apply
     * @return true if the item matches the condition, false otherwise
     */
    boolean matches(T item, String condition);
}
