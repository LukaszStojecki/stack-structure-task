public class Main {

    public static void main(String[] args) {

        MinStack getMinStack = new MinStack();
        getMinStack.push(4);
        getMinStack.push(6);
        getMinStack.push(2);
        System.out.println(getMinStack.stack);
        System.out.println(getMinStack.peekMin());
        getMinStack.pop();
        System.out.println(getMinStack.stack);
        System.out.println(getMinStack.peekMin());

    }
}
