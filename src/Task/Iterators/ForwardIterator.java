package Task.Iterators;

import java.util.List;

/**
 * ForwardIterator class
 * @param <T> type of data
 */

public class ForwardIterator<T> implements Iterator<T> {
    private List<T> data;
    private int index = 0;

    /**
     * Constructor for ForwardIterator
     * @param data List of data
     */
    public ForwardIterator(List<T> data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        return index < data.size();
    }

    @Override
    public T next() {
        if (this.hasNext()) {
            return data.get(index++);
        }
        return null;
    }
}
