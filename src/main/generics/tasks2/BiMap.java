package main.generics.tasks2;

import java.util.*;

public class BiMap<K, V> {

    private final Map<K, V> keyToValue = new HashMap<>();
    private final Map<V, K> valueToKey = new HashMap<>();

    public void put(K key, V value) {
        if (keyToValue.containsKey(key)) {
            V oldValue = keyToValue.get(key);
            valueToKey.remove(oldValue);
        }
        if (valueToKey.containsKey(value)) {
            K oldKey = valueToKey.get(value);
            keyToValue.remove(oldKey);
        }
        keyToValue.put(key, value);
        valueToKey.put(value, key);
    }

    public V getByKey(K key) {
        return keyToValue.get(key);
    }

    public K getByValue(V value) {
        return valueToKey.get(value);
    }

    public V removeByKey(K key) {
        V removedValue = keyToValue.remove(key);
        if (removedValue != null) {
            valueToKey.remove(removedValue);
        }
        return removedValue;
    }

    public K removeByValue(V value) {
        K removedKey = valueToKey.remove(value);
        if (removedKey != null) {
            keyToValue.remove(removedKey);
        }
        return removedKey;
    }

    public boolean containsKey(K key) {
        return keyToValue.containsKey(key);
    }

    public boolean containsValue(V value) {
        return valueToKey.containsKey(value);
    }

    public int size() {
        return keyToValue.size();
    }

    public boolean isEmpty() {
        return keyToValue.isEmpty();
    }

    public void clear() {
        keyToValue.clear();
        valueToKey.clear();
    }
    
}
