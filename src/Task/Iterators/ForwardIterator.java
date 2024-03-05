package Task.Iterators;

import java.util.List;

public class ForwardIterator<T> implements Iterator<T> {
    private List<T> data;
    private int index = 0;

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
