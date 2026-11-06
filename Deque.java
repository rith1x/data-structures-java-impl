public class Deque {

}

class DequeUsingArray extends ArrayList {

    void offerFirst(int val) {
        super.insertAtBeginning(val);
    }

    void offerLast(int val) {
        super.insertAtEnd(val);
    }

    int pollFirst() {
        return super.deleteAtBeginning();
    }

    int pollLast() {
        return super.deleteAtEnd();
    }

    int peekFirst() {
        return super.get(0);
    }

    int peekLast() {
        return super.get(super.top - 1);
    }

    void push(int val) {
        this.offerFirst(val);
    }

    int pop() {
        return this.pollFirst();
    }

    void enqueue(int val) {
        this.offerFirst(val);
    }

    int dequeue() {
        return this.pollLast();
    }

}

class DequeUsingList extends LinkedList {
    void offerFirst(int val) {
        super.insertAtBeginning(val);
    }

    void offerLast(int val) {
        super.insertAtEnd(val);
    }

    int pollFirst() {
        return super.deleteAtBeginning();
    }

    int pollLast() {
        return super.deleteAtEnd();
    }

    int peekFirst() {
        return super.head.val;
    }

    int peekLast() {
        return super.getNthNode(super.size());
    }

    void push(int val) {
        this.offerFirst(val);
    }

    int pop() {
        return this.pollFirst();
    }

    void enqueue(int val) {
        this.offerFirst(val);
    }

    int dequeue() {
        return this.pollLast();
    }
}
