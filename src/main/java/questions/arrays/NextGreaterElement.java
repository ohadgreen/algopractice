package questions.arrays;

import java.util.Iterator;
import java.util.Stack;

public class NextGreaterElement {
    public static void nextGreaterElement(int[] array) {

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            if (stack.empty()) {
                stack.push(array[i]);
            }

            Integer topNum = stack.peek();
            if (array[i] > topNum) {
                Iterator iterator =  stack.iterator();
                while (iterator.hasNext()) {

                }
            }

        }
    }
}
