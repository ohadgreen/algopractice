package exercise.reflection;

public class MyUtils {
    private static int doubleNum(int num) {
        return num*2;
    }

    public static Double divideNumbers(int a, int b) {
        try {
            return (double) (a / b);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero!");
            return null;
        }
    }
}
