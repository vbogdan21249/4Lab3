package Task.Filters;

/**
 * Filter implementation for integers, checking whether the value of an integer is greater than the value specified in the condition
 */
public class IntegerGreaterThanFilter implements Filter<Integer> {
    /**
     * Checks if the given integer value is greater than the specified condition.
     *
     * @param item      the integer value to check
     * @param condition the condition to compare against
     * @return true if the item is greater than the condition, false otherwise
     */
    @Override
    public boolean matches(Integer item, String condition) {
        try {
            int value = Integer.parseInt(condition);
            return item > value;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
