public class Deque {

}

class DequeUsingArray<T> extends ArrayList<T> {

    void offerFirst(T val) {
        super.insertAtBeginning(val);
    }

    void offerLast(T val) {
        super.insertAtEnd(val);
    }

    T pollFirst() {
        return super.deleteAtBeginning();
    }

    T pollLast() {
        return super.deleteAtEnd();
    }

    T peekFirst() {
        return super.get(0);
    }

    T peekLast() {
        return super.get(super.size - 1);
    }

    void push(T val) {
        this.offerFirst(val);
    }

    T pop() {
        return this.pollFirst();
    }

    void enqueue(T val) {
        this.offerFirst(val);
    }

    T dequeue() {
        return this.pollLast();
    }

}

class DequeUsingList<T> extends LinkedList<T> {
    void offerFirst(T val) {
        super.insertAtBeginning(val);
    }

    void offerLast(T val) {
        super.insertAtEnd(val);
    }

    T pollFirst() {
        return super.deleteAtBeginning();
    }

    T pollLast() {
        return super.deleteAtEnd();
    }

    T peekFirst() {
        return super.head.val;
    }

    T peekLast() {
        return super.getNthNode(super.size());
    }

    void push(T val) {
        this.offerFirst(val);
    }

    T pop() {
        return this.pollFirst();
    }

    void enqueue(T val) {
        this.offerFirst(val);
    }

    T dequeue() {
        return this.pollLast();
    }
}
