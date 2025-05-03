package main.generics.tasks2;

import java.util.*;

public class MultiMap<K, V> {

    private final Map<K, List<V>> map = new HashMap<>();

    public void put(K key, V value) {
        List<V> values = map.get(key);
        if (values == null) {
            values = new ArrayList<V>();
            map.put(key, values);
        }
        values.add(value);
    }

    public List<V> get(K key) {
        List<V> values = map.get(key);
        if (values == null) {
            return Collections.emptyList();
        }
        return values;
    }

    public boolean remove(K key, V value) {
        List<V> values = map.get(key);
        if (values == null) {
            return false;
        }
        boolean removed = values.remove(value);
        if (values.isEmpty()) {
            map.remove(key);
        }
        return removed;
    }

    public List<V> removeAll(K key) {
        return map.remove(key);
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public int keyCount() {
        return map.size();
    }

}
