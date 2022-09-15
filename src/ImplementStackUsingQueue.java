import java.util.*;

public class ImplementStackUsingQueue {
    Queue<Integer> que1;
    Queue<Integer> que2;

    /**
     * Initialize your data structure here.
     */
    public ImplementStackUsingQueue() {
        this.que1 = new LinkedList<Integer>();
        this.que2 = new LinkedList<Integer>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        //element push into queue2
        que2.add(x);
        //push the old element in queue1
        while (!que1.isEmpty()) {
            que2.add(que1.remove());
        }
        //swap the queue1 and queue2
        Queue<Integer> temp = que1;
        que1 = que2;
        que2 = temp;
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return que1.remove();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return que1.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {

        return que1.isEmpty();
    }
}
