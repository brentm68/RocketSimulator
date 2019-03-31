import java.util.LinkedList;

public class Queue {

    private static LinkedList queue = new LinkedList();

    public void enqueue(Object obj) {
        // Add an item to back of queue.
        queue.addLast(obj);
    }

    public Object dequeue() {
        // Remove the next item from the front of the queue.
        // (Note that queue.removeFirst() both removes an
        // item from the list, and returns the item that
        // was removed.)  Throws a NoSuchElementException
        // if there are no items on the queue.
        return queue.removeFirst();
    }

    public boolean isEmpty() {
        // Test if the queue is empty.
        return queue.isEmpty();
    }

} // end class Queue