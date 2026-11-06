public class Queue {

}

class QueueUsingArray<T> extends ArrayList<T> {
    T dequeue() {
        return super.deleteAtBeginning();
    }

    void enqueue(T val) {
        super.insertAtEnd(val);
    }

    T peek() {
        return super.get(super.size - 1);
    }

    void offer(T val) {
        this.enqueue(val);
    }

    T poll() {
        return this.dequeue();
    }
}

class QueueUsingList<T> extends LinkedList<T> {
    void enqueue(T val) {
        super.insertAtEnd(val);
    }

    T dequeue() {
        return super.deleteAtBeginning();
    }

    T peek() {
        return super.getNthNode(1);
    }

    T poll() {
        return this.dequeue();
    }

    void offer(T val) {
        this.enqueue(val);
    }

}
