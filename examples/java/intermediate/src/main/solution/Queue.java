package solution;

import java.util.LinkedList;

public class Queue {
    private LinkedList<Object> list = new LinkedList<>();

    public void enqueue(Object o) {
        list.add(o);
    }

    public Object dequeue() {
        return list.size() == 0 ? null : list.removeFirst();
    }

    public Object peek() {
        return list.size() == 0 ? null : list.get(0);
    }

}
