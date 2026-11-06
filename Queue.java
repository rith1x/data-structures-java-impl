public class Queue {

}

class QueueUsingArray extends ArrayList {
    int dequeue() {
        return super.deleteAtBeginning();
    }

    void enqueue(int val) {
        super.insertAtEnd(val);
    }

    int peek() {
        return super.get(super.top - 1);
    }

    void offer(int val) {
        this.enqueue(val);
    }

    int poll() {
        return this.dequeue();
    }
}

class QueueUsingList extends LinkedList {
    void enqueue(int val) {
        super.insertAtEnd(val);
    }

    int dequeue() {
        return super.deleteAtBeginning();
    }

    int peek() {
        return super.getNthNode(1);
    }

    int poll() {
        return this.dequeue();
    }

    void offer(int val) {
        this.enqueue(val);
    }

}
