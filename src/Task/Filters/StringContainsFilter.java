package Task.Filters;

public class StringContainsFilter implements Filter<String> {
    @Override
    public boolean matches(String item, String condition) {
        return item.contains(condition);
    }
}
