package main.generics.tasks2;

import java.util.*;

public class PrioritySet<T> {

    private final Set<T> set = new HashSet<>();
    private final PriorityQueue<PrioritizedElement<T>> queue;

    public PrioritySet() {
        queue = new PriorityQueue<>(new Comparator<PrioritizedElement<T>>() {

            @Override
            public int compare(PrioritizedElement<T> o1, PrioritizedElement<T> o2) {
                return Integer.compare(o1.getPriority(), o2.getPriority());
            }
            
        });
    }

    public boolean add(T element, int priority) {
        if (set.contains(element)) {
            return false;
        }
        PrioritizedElement<T> prioritizedElement = new PrioritizedElement<>(element, priority);
        set.add(element);
        queue.add(prioritizedElement);
        return true;
    }

    public T poll() {
        PrioritizedElement<T> element = queue.poll();
        if (element != null) {
            set.remove(element.getElement());
            return element.getElement();
        }
        return null;
    }

    public boolean contains(T element) {
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
        queue.clear();
    }

    private static class PrioritizedElement<T> {
        
        private final T element;
        private final int priority;

        public PrioritizedElement(T element, int priority) {
            this.element = element;
            this.priority = priority;
        }

        public T getElement() {
            return element;
        }

        public int getPriority() {
            return priority;
        }
    }
}
