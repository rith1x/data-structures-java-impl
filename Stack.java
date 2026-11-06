
public class Stack {

}

class StackUsingArray extends ArrayList {
    int pop() {
        return super.deleteAtEnd();
    }

    void push(int val) {
        super.insertAtEnd(val);
    }

    int peek() {
        return super.get(super.top - 1);
    }
}

class StackUsingList extends LinkedList {
    void push(int val) {
        super.insertAtBeginning(val);
    }

    int pop() {
        return super.deleteAtBeginning();
    }

    int peek() {
        return super.getNthNode(1);
    }

}
