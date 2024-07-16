package questions.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPriorityQueueTest {

    private final MyPriorityQueue myPriorityQueue = new MyPriorityQueue();

    @Test
    void testAdd() {
        int[][] myPointsArray = {{1, 2}, {0, 3}, {3, 6}, {4, 1}, {2, 1}, {4, 2}};
        int[][] closestKPoints = myPriorityQueue.findClosestKPoints(myPointsArray, 3);

        assertEquals(3, closestKPoints.length);
    }

}