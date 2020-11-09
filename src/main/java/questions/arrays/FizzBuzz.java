package questions.arrays;

public class FizzBuzz {
    private static final int M1 = 3;
    private static final int M2 = 7;

    public static void main(String[] args) {
        fizzBuzzIt(50);
    }

    public static void fizzBuzzIt(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % M1 == 0) {
                System.out.print("fizz");
            }
            if (i % M2 == 0) {
                System.out.print("buzz");
            }
            if (i % M1 > 0 && i % M2 >0) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
