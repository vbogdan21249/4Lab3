package Task.Iterators;

import java.util.List;

public class ReverseIterator<T> implements Iterator<T> {
    private List<T> data;
    private int index;

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
