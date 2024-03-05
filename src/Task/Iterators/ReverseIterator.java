package Task.Iterators;

import java.util.List;

/**
 * This class is a reverse iterator.
 * It implements the Iterator interface.
 * @param <T> is the type of the data.
 */
public class ReverseIterator<T> implements Iterator<T> {
    private List<T> data;
    private int index;

    /**
     * Constructor for ReverseIterator
     * @param data List of data
     */
    public ReverseIterator(List<T> data) {
        this.data = data;
        this.index = data.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public T next() {
        if (this.hasNext()) {
            return data.get(index--);
        }
        return null;
    }
}
