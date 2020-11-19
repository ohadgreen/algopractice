package questions.binarytree;

import java.util.ArrayList;
import java.util.List;

public class PickSticksGame {

    private static List<String> pathList = new ArrayList<String>();

    public static void main(String[] args) {
        int[] moves = {1, 2, 4};
        int sticks = 5;
        System.out.println(isWinPossible(sticks, moves));
    }

    public static boolean isWinPossible(int sticks, int[] possibleMoves) {
        turn("", sticks, possibleMoves);
        return isWinnerPathExists();
    }

    private static boolean isWinnerPathExists() {
        for (String path : pathList) {
            if (path.toCharArray().length % 2 == 1) { // if exists path with non even length then it can win
                System.out.println(path);
                return true;
            }
        }
        return false;
    }

    private static void turn(String path, int sticks, int[] moves){
        boolean winner = false;
        for (int i = 0; i < moves.length; i++) {
            if (sticks == moves[i]) {
                pathList.add(path + moves[i]);
                winner = true;
                break;
            }
        }
        if (!winner) {
            for (int i = 0; i < moves.length; i++) {
                int remainSticks = sticks - moves[i];
                if (remainSticks > 0) {
                    turn(path + moves[i], remainSticks, moves);
                }
            }
        }
    }
}
