package questions.arrays;

public class FibonacciSequence {

    public static Integer calcFiboNumber(int num) {
        Integer prev2 = 0;
        Integer prev1 = 1;
        Integer fibo = 0;

        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }

        for (int i = 1; i <= num; i++) {
            fibo = prev2 + prev1;
            prev2 = prev1;
            prev1 = fibo;
            System.out.println("fibo = " + fibo);
        }

        return fibo;
    }
}
