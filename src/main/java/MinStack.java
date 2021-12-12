import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack {

    Deque<Integer> stack = new ArrayDeque<>();
    Deque<Integer> stackMin = new ArrayDeque<>();

    public void pop() {
        int number = stack.pop();
        if (number == peekMin()) {
            stackMin.pop();
        }
    }

    public void push(Integer number) {
        if (stackMin.isEmpty() || number <= peekMin()) {
            stackMin.push(number);
        }
        stack.push(number);
    }

    public Integer peekMin() {
        return stackMin.peek();
    }
}
