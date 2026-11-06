import java.util.Arrays;

/**
 * @author Kiruthik
 * @version 1.0.0
 * @since 2026
 *        Dynamic array implementation
 */
public class ArrayList<T> {
    T[] arr;
    int capacity = 5;
    int size = 0;

    @SuppressWarnings("unchecked")
    ArrayList() {
        this.arr = (T[]) new Object[capacity];
    }

    /*
     * Give index, get value
     */
    T get(int index) {
        if (index < 0 || index >= capacity) {
            System.out.println("Invalid index");
            return null;
        }
        return arr[index];
    }

    /**
     * adds an element into the AL
     * 
     * @param element user given element
     * @return nothing
     */
    @SuppressWarnings("unchecked")
    void add(T element) {
        if (size == capacity) {
            capacity *= 2;
            T[] temp = (T[]) new Object[capacity];
            for (int i = 0; i < size; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        arr[size] = element;
        size++;
    }

    void add(int index, T value) {
        this.arr[index] = value;
    }

    T deleteAtEnd() {
        if (size == 0) {
            System.out.println("Array Empty");
            return null;
        }
        T deleted = arr[size - 1];
        size--;
        return deleted;
    }
    // 1,2,3,4,5

    T deleteAtBeginning() {
        T deleted = arr[0];
        for (int i = 0; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return deleted;
    }

    // 1 2 3 4 5
    T deleteAtIndex(int index) {
        if (index < 0 || index >= capacity) {
            System.out.println("Invalid index");
            return null;
        }
        T deleted = arr[index];
        for (int i = index; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return deleted;
    }

    T deleteAtPosition(int pos) {
        return deleteAtIndex(pos - 1);
    }

    void insertAtEnd(T val) {
        add(val);
    }

    void insertAtIndex(int index, T val) {
        add(index, val);
    }

    void insertAtPosition(int pos, T val) {
        add(pos - 1, val);
    }

    @SuppressWarnings("unchecked")
    void insertAtBeginning(T val) {
        if (size == capacity) {
            capacity *= 2;
            T temp[] = (T[]) new Object[capacity];
            for (int i = 0; i < size; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = val;
        size++;
    }

    void insertAtBeginRecursive(T element) {
        helper(size, element);
    }

    @SuppressWarnings("unchecked")
    void helper(int ind, T el) {
        if (size == capacity) {
            capacity *= 2;
            T temp[] = (T[]) new Object[capacity];
            for (int i = 0; i < size; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        if (ind == 0) {
            arr[0] = el;
            size++;
            return;
        }
        arr[ind] = arr[ind - 1];
        helper(ind - 1, el);
    }

    void print() {
        System.out.println(Arrays.toString(arr));
    }

}
