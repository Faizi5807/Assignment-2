
import java.util.EmptyStackException;

public class GenericStack<T> {
    private class node {
        T data;
        node next;
    }

    node top;

    public GenericStack() {
        this.top = null;
    }

    public void push(T x) // insert at the beginning
    {
        // create new node temp and allocate memory
        node temp = new node();

        // check if stack (heap) is full. Then inserting an
        // element would lead to stack overflow
        // if (temp == null) {
        // System.out.print("\nHeap Overflow");
        // return;
        // }
        temp.data = x;
        temp.next = top;
        top = temp;
    }

    public T pop() throws EmptyStackException {
        // check for stack underflow
        if (top == null) {
            // System.out.print("\nStack Underflow");
            // return;
            throw new EmptyStackException();
        }
        node temp = new node();
        temp = top;
        // update the top pointer to point to the next node
        top = (top).next;
        return temp.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        if (top != null) {
            node temp = new node();
            temp = top;
            int Size = 0;
            while (temp != null) {
                temp = (temp).next;
                Size++;
            }
            return Size;
        } else {
            System.out.println("Empty Stack!");
            return 0;
        }
    }

}