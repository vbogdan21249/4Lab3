package Task;

import Task.Filters.Filter;
import Task.Iterators.ForwardIterator;
import Task.Iterators.Iterator;
import Task.Iterators.ReverseIterator;

import java.util.ArrayList;
import java.util.List;

public class MyTable<T> {
    private List<T> data;

    public MyTable(List<T> data) {
        this.data = data;
    }

    public Iterator<T> createIterator() {
        return new ForwardIterator<>(data);
    }

    public Iterator<T> createReverseIterator() {
        return new ReverseIterator<>(data);
    }

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
