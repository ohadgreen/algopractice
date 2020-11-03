package questions.binarytree;

public class ClimbStairs {
    private static final int OP1 = 1;
    private static final int OP2 = 2;
    private static final int OP3 = 3;

    public static void main(String[] args) {
        waysToClimbStairs(10, "");
    }

    public static void waysToClimbStairs(int stairs, String path) {
        if (stairs >= OP3) {
            String path3 = path +" - 3";
            waysToClimbStairs(stairs - 3, path3);
        }
        if (stairs >= OP2) {
            String path2 = path + " - 2";
            waysToClimbStairs(stairs - 2, path2);
        }
        if (stairs >= OP1) {
            String path1 = path + " - 1";
            waysToClimbStairs(stairs - 1, path1);
        }
        else {
            System.out.println("path: " + path);
        }
    }
}
