public class Stack {


    private int array[];
    private int top;
    private int cap;


    public Stack(int cap) {
        this.array = new int[cap];
        this.top = -1;
        this.cap = cap;
    }

    public void push(int value) throws Exception {
        if (isFull()) {
            throw new RuntimeException("Stack has reached its capacity");
        }
        array[++top] = value;
    }


    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return array[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return array[top];
    }

    private boolean isFull() {
        return top == cap-1;
    }

    private boolean isEmpty() {
        return top == -1;
    }

}
