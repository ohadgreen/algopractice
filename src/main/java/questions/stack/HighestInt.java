package questions.stack;

import java.util.Stack;

public class HighestInt {

    private final Stack<Integer> myStack = new Stack<>();

    private Stack<Integer> highestIntStack = new Stack<>();

    public void pushInt(Integer integer) {
        myStack.push(integer);

        if (highestIntStack.empty()) {
            highestIntStack.push(integer);
        } else if (highestIntStack.peek() < integer) {
            highestIntStack.push(integer);
        }
    }

    public Integer popInt() {
        Integer popInt = myStack.pop();
        if (popInt != null && highestIntStack.peek().equals(popInt)) {
            highestIntStack.pop();
        }
        return popInt;
    }

    public Integer highestInt() {
        return highestIntStack.peek();
    }

}
