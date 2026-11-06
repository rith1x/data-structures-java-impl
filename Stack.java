
public class Stack {

}

class StackUsingArray<T> extends ArrayList<T> {
    T pop() {
        return super.deleteAtEnd();
    }

    void push(T val) {
        super.insertAtEnd(val);
    }

    T peek() {
        return super.get(super.size - 1);
    }
}

class StackUsingList<T> extends LinkedList<T> {
    void push(T val) {
        super.insertAtBeginning(val);
    }

    T pop() {
        return super.deleteAtBeginning();
    }

    T peek() {
        return super.getNthNode(1);
    }

}
