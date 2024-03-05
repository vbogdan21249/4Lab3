package Task.Filters;

public class IntegerGreaterThanFilter implements Filter<Integer> {
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
