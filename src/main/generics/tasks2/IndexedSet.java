package main.generics.tasks2;

import java.util.*;

public class IndexedSet<K> {

    private final LinkedHashSet<K> set = new LinkedHashSet<>();
    private final List<K> list = new ArrayList<>();

    public boolean add(K element) {
        if (set.add(element)) {
            list.add(element);
            return true;
        }
        return false;
    }

    public boolean remove(K element) {
        if (set.remove(element)) {
            list.remove(element);
            return true;
        }
        return false;
    }

    public K get(int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return list.get(index);
    }

    public boolean contains(K element) {
        return set.contains(element);
    }

    public int size() {
        return set.size();
    }

    public boolean isEmpty() {
        return set.isEmpty();
    }

    public void clear() {
        set.clear();
        list.clear();
    }
    
}
