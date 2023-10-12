
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

    public T pop() throws ExceptionHandling.EmptyStackException {
        // check for stack underflow
        if (top == null) {
            // System.out.print("\nStack Underflow");
            // return;
            throw new ExceptionHandling.EmptyStackException();
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

    public int size() throws ExceptionHandling.EmptyStackException {
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
            throw new ExceptionHandling.EmptyStackException();
        }
    }

    public static void main(String[] args) {
        GenericStack<Integer> intg = new GenericStack<>();
        try {
            intg.push(9);
            intg.push(54);
            intg.push(11);
            intg.push(6);
            System.out.println("Popped Element: " + intg.pop());
            System.out.println("New Stack size: " + intg.size());
        } catch (ExceptionHandling.EmptyStackException e) {
            System.err.println(e.getMessage());
        }

        GenericStack<String> strg = new GenericStack<>();
        try {
            strg.push("Itadori Yuji");
            strg.push("Panda Senpai");
            strg.push("Ryoumen Sukuna");
            strg.push("Light Yagami");
            System.out.println("Popped: " + strg.pop());
            System.out.println("Stack size: " + strg.size());
        } catch (ExceptionHandling.EmptyStackException e) {
            System.err.println(e.getMessage());
        }
    }
}