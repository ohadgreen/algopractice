package questions.numbers;

public class SumDigits {
    public static void main(String[] args) {
        int number = 9876;
        System.out.println(number + " sum digits: " + sumDigitsToSingleDigits(number));
    }

    protected static int sumDigitsToSingleDigits(int n) {
        while (n >= 10) {
            n = sumDigits(n);
            System.out.println(n);
        }
        return n;
    }

    protected static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int v = n % 10;
//            System.out.println(v);
            int newNumber = ((n - v) / 10);
            sum += v;
            n = newNumber;
        }

        return sum;
    }
}
