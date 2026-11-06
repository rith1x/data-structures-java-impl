
public class LinkedList {
    class Node {
        int val;
        Node next = null;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    Node head = null;

    void insertAtBeginning(int val) {
        Node nn = new Node(val);
        if (head == null) {
            head = nn;
        } else {
            nn.next = head;
            head = nn;
        }
    }

    void insertAtEnd(int val) {
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

    void insertAtIndex(int index, int val) {
        Node temp = this.head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        Node nn = new Node(val, temp.next);
        temp.next = nn;
    }

    void insertAtPosition(int pos, int val) {
        this.insertAtIndex(pos - 1, val);
    }

    int deleteAtBeginning() {
        int deleted = this.head.val;
        this.head = this.head.next;
        return deleted;
    }

    int deleteAtEnd() {
        Node temp = this.head;
        while (temp.next.next != null)
            temp = temp.next;
        int deleted = temp.next.val;
        temp.next = null;
        return deleted;
    }

    // 1 2 3 4 5 - 2
    // ^
    int deleteAtIndex(int index) {
        Node temp = this.head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        int deleted = temp.next.val;
        temp.next = temp.next.next;
        return deleted;
    }

    int deleteAtPosition(int position) {
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

    int search(int val) {
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

    int getMiddle() {
        Node slow = this.head;
        Node fast = this.head;
        while (fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }

    int getNthNode(int n) {
        Node temp = this.head;
        for (int i = 0; i < n; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    int deleteByValue(int val) {
        int index = search(val);
        if (index == -1)
            return -1;
        return deleteAtIndex(index);
    }

}
