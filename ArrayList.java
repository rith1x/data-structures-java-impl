import java.util.Arrays;

/**
 * @author Kiruthik
 * @version 1.0.0
 * @since 2026
 *        Dynamic array implementation
 */
public class ArrayList {
    int[] arr;
    int capacity = 5;
    int top = 0;

    ArrayList() {
        this.arr = new int[capacity];
    }

    /*
     * Give index, get value
     */
    int get(int index) {
        if (index < 0 || index >= capacity) {
            System.out.println("Invalid index");
            return -1;
        }
        return arr[index];
    }

    /**
     * adds an element into the AL
     * 
     * @param element user given element
     * @return nothing
     */
    void add(int element) {
        if (top == capacity) {
            capacity *= 2;
            int[] temp = new int[capacity];
            for (int i = 0; i < top; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        arr[top] = element;
        top++;
    }

    void add(int index, int value) {
        this.arr[index] = value;
    }

    int deleteAtEnd() {
        if (top == 0) {
            System.out.println("Array Empty");
            return -1;
        }
        int deleted = arr[top - 1];
        top--;
        return deleted;
    }
    // 1,2,3,4,5

    int deleteAtBeginning() {
        int deleted = arr[0];
        for (int i = 0; i < top; i++) {
            arr[i] = arr[i + 1];
        }
        top--;
        return deleted;
    }

    // 1 2 3 4 5
    int deleteAtIndex(int index) {
        if (index < 0 || index >= capacity) {
            System.out.println("Invalid index");
            return -1;
        }
        int deleted = arr[index];
        for (int i = index; i < top; i++) {
            arr[i] = arr[i + 1];
        }
        top--;
        return deleted;
    }

    int deleteAtPosition(int pos) {
        return deleteAtIndex(pos - 1);
    }

    void insertAtEnd(int val) {
        add(val);
    }

    void insertAtIndex(int index, int val) {
        add(index, val);
    }

    void insertAtPosition(int pos, int val) {
        add(pos - 1, val);
    }

    void insertAtBeginning(int val) {
        if (top == capacity) {
            capacity *= 2;
            int temp[] = new int[capacity];
            for (int i = 0; i < top; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        for (int i = top; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = val;
        top++;
    }

    void insertAtBeginRecursive(int element) {
        helper(top, element);
    }

    void helper(int ind, int el) {
        if (top == capacity) {
            capacity *= 2;
            int temp[] = new int[capacity];
            for (int i = 0; i < top; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        if (ind == 0) {
            arr[0] = el;
            top++;
            return;
        }
        arr[ind] = arr[ind - 1];
        helper(ind - 1, el);
    }

    void print() {
        System.out.println(Arrays.toString(arr));
    }

}

class Driver {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.print();
        al.insertAtBeginRecursive(5);
        al.print();
        al.insertAtBeginRecursive(6);
        al.print();
    }
}