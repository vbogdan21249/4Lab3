package Task;

import Task.Filters.Filter;
import Task.Iterators.ForwardIterator;
import Task.Iterators.Iterator;
import Task.Iterators.ReverseIterator;

import java.util.ArrayList;
import java.util.List;
/**
 * MyTable class
 * @param <T> Type of data
 */
public class MyTable<T> {
    private List<T> data;
    /**
     * Constructor for MyTable
     * @param data List of data
     */
    public MyTable(List<T> data) {
        this.data = data;
    }
    /**
     * Create forward iterator
     * @return ForwardIterator
     */
    public Iterator<T> createIterator() {
        return new ForwardIterator<>(data);
    }
    /**
     * Create reverse iterator
     * @return ReverseIterator
     */
    public Iterator<T> createReverseIterator() {
        return new ReverseIterator<>(data);
    }
    /**
     * Perform selection
     * @param filter Filter
     * @param condition Condition
     * @return List of data
     */
    public List<T> performSelection(Filter<T> filter, String condition) {
        List<T> result = new ArrayList<>();
        for (T item : data) {
            if (filter.matches(item, condition)) {
                result.add(item);
            }
        }
        return result;
    }

}
