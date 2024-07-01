package exercise;

public class SquaresPoints {
    public int solution(int A, int B, int C, int D) {
        int maxDistance = 0;
        int[] pos = {A, B, C, D};

        for (int i = 0; i < 4; i++) {
            int pos1 = pos[i];
            for (int j = 0; j < 4; j++) {
                if (j != i) {
                    int pos2 = pos[j];
                    boolean found3 = false;
                    for (int k = 0; k < 4; k++) {
                        int pos3, pos4;
                        if (k != i && k != j) {
                            if (!found3) {
                                pos3 = pos[k];
                                found3 = true;
                            }
                            else {
                                pos4 = pos[k];
                            }
                        }
                    }
                }
            }

        }

        return maxDistance;
    }
}
