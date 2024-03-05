package Task.Filters;

/**
 * Represents a filter that checks if a string contains a specific condition.
 */

public class StringContainsFilter implements Filter<String> {
    /**
     * This method checks if the item contains the condition.
     * @param item the item to check
     * @param condition the condition to check
     * @return true if the item contains the condition, false otherwise
     */
    @Override
    public boolean matches(String item, String condition) {
        return item.contains(condition);
    }
}
