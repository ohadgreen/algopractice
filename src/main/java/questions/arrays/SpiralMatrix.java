package questions.arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        String[][] matrix = {
                {"a", "b", "c", "d"},
                {"l", "m", "n", "e"},
                {"k", "p", "o", "f"},
                {"j", "i", "h", "g"}
        };
        printMatrix(matrix, 4, 4);
    }

    public static void printMatrix(String[][] matrix, int width, int height) {
        int top = 0;
        int bottom = height - 1;
        int left = 0;
        int right = width - 1;

        String traverseDirection = "left-right"; // indicate the spiral current direction {left-right, top-bottom, right-left, bottom-top}

        while(top <= bottom && left <= right) {
            if (traverseDirection == "left-right") {
                for (int i = left; i <= right; i++) {
                    System.out.println(matrix[top][i]);
                }
                top++;
                traverseDirection = "top-bottom";
            }
            else if (traverseDirection == "top-bottom") {
                for (int i = top; i <= bottom; i++) {
                    System.out.println(matrix[i][right]);
                }
                right--;
                traverseDirection = "right-left";
            }
            else if (traverseDirection == "right-left") {
                for (int i = right; i >= left ; i--) {
                    System.out.println(matrix[bottom][i]);
                }
                bottom--;
                traverseDirection = "bottom-top";
            }
            else if (traverseDirection == "bottom-top") {
                for (int i = bottom; i >= top ; i--) {
                    System.out.println(matrix[i][left]);
                }
                left++;
                traverseDirection = "left-right";
            }
        }
    }
}
