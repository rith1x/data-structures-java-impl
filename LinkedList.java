
public class LinkedList<T> {
    class Node {
        T val;
        Node next = null;

        Node(T val) {
            this.val = val;
        }

        Node(T val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    Node head = null;

    void insertAtBeginning(T val) {
        Node nn = new Node(val);
        if (head == null) {
            head = nn;
        } else {
            nn.next = head;
            head = nn;
        }
    }

    void insertAtEnd(T val) {
        Node nn = new Node(val);
        if (head == null) {
            this.head = nn;
        } else {
            Node temp = this.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nn;
        }
    }

    void insertAtIndex(int index, T val) {
        Node temp = this.head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        Node nn = new Node(val, temp.next);
        temp.next = nn;
    }

    void insertAtPosition(int pos, T val) {
        this.insertAtIndex(pos - 1, val);
    }

    T deleteAtBeginning() {
        T deleted = this.head.val;
        this.head = this.head.next;
        return deleted;
    }

    T deleteAtEnd() {
        Node temp = this.head;
        while (temp.next.next != null)
            temp = temp.next;
        T deleted = temp.next.val;
        temp.next = null;
        return deleted;
    }

    // 1 2 3 4 5 - 2
    // ^
    T deleteAtIndex(int index) {
        Node temp = this.head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        T deleted = temp.next.val;
        temp.next = temp.next.next;
        return deleted;
    }

    T deleteAtPosition(int position) {
        return this.deleteAtIndex(position - 1);
    }

    void reverseList() {
        Node left = null;
        Node curr = this.head;
        Node right = null;
        while (curr != null) {
            right = curr.next;
            curr.next = left;
            left = curr;
            curr = right;
        }
        this.head = left;
    }

    int size() {
        Node temp = this.head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    int search(T val) {
        Node temp = this.head;
        int index = 0;
        while (temp != null) {
            if (temp.val == val)
                return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }

    T getMiddle() {
        Node slow = this.head;
        Node fast = this.head;
        while (fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }

    T getNthNode(int n) {
        Node temp = this.head;
        for (int i = 0; i < n; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    T deleteByValue(T val) {
        int index = search(val);
        if (index == -1)
            return null;
        return deleteAtIndex(index);
    }

}
