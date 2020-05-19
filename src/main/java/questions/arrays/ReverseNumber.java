package questions.arrays;

public class ReverseNumber {
    public static void solution(int N) {
        int enable_print = N % 10;
        while (N > 0) {
            if (enable_print == 0 ) {
                enable_print = 0;
            }
            else if (enable_print >= 1) {
                System.out.print(N % 10);
            }
            N = N / 10;
        }
    }

    public static void newSolution(int N) {
        while (N > 0) {
        int enable_print = N % 10;
            if (enable_print == 0 && N % 10 != 0) {
                enable_print = 1;
            }
            else if (enable_print >= 1) {
                System.out.print(N % 10);
            }
            N = N / 10;
        }
    }
}
