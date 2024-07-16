package questions.queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MyPriorityQueue {

    public int[][] findClosestKPoints(int[][] points, int k) {
        PriorityQueue<Point> myQueue = new PriorityQueue<>((a, b) -> b.distance - a.distance);

        for (int[] point : points) {
            int distance = point[0] * point[0] + point[1] * point[1];
            Point myPoint = new Point();
            myPoint.point = point;
            myPoint.distance = distance;

            myQueue.add(myPoint);

            if (myQueue.size() > k) {
                myQueue.poll();
            }
        }

//        while (!myQueue.isEmpty()) {
//            Point point = myQueue.poll();
//            System.out.println(point.distance);
//        }

        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            Point point = myQueue.poll();
            if (point == null) {
                break;
            }
            result[i] = point.point;
        }

        return result;
    }

    static class Point {
        int[] point;
        int distance;
    }

}
