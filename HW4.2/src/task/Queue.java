package task;


import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Queue<T> {
    private LinkedList<T> queue;

    public Queue() {
        queue = new LinkedList<T>();
    }

    public void enqueue(T element) {
        queue.add(element);
    }

    public T dequeue() {
        if (queue.isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.removeFirst();
    }

    public T first() {
        if (queue.isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.getFirst();
    }
}