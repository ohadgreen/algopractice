package questions.arrays;

import java.util.Iterator;
import java.util.Stack;

public class NextGreaterElement {
    public static void nextGreaterElement(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            if (!stack.empty()) {
                Iterator iterator = stack.iterator();
                while (iterator.hasNext()) {
                    Integer topNum = stack.peek();
                    if (array[i] > topNum) {
                        System.out.println(topNum + " --> " + array[i]);
                        stack.pop();
                    } else {
                        break;
                    }
                }
            }
            stack.push(array[i]);
        }

        if (!stack.empty()) {
            Iterator iterator =  stack.iterator();
            while (iterator.hasNext()) {
                System.out.println(stack.pop() + " --> -1");
            }
        }
    }
}
