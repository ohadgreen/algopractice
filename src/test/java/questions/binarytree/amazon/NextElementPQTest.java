package questions.binarytree.amazon;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class NextElementPQTest {

    @Test
    void priorityQueueTest() {
        MyNumber n5 = new MyNumber(5, 1, 0);
        MyNumber n1 = new MyNumber(1, 2, 0);
        MyNumber n8 = new MyNumber(8, 3, 0);
        MyNumber n2 = new MyNumber(2, 4, 0);
        MyNumber n3 = new MyNumber(3, 5, 0);
        MyNumber n7 = new MyNumber(7, 6, 0);

        List<MyNumber> myNumberList = Arrays.asList(n5, n1, n8, n2, n3, n7).stream().collect(Collectors.toList());

        Queue<MyNumber> queue = new PriorityQueue();
        myNumberList.stream().forEach(myNumber -> queue.add(myNumber));

        Iterator<MyNumber> iterator = queue.iterator();
        while (iterator.hasNext()) {
            MyNumber mn = queue.poll();
            System.out.println(mn.getNumber());
        }

        MyNumber first = queue.poll();
        assertEquals(1, first.getNumber());

        MyNumber n4 = new MyNumber(4, 7, 0);
        queue.add(n4);
        MyNumber second = queue.poll();
        assertEquals(3, second.getNumber());
    }

    @Test
    void initTest() {
        SortListOfSortedLists nextElement = new NextElementPQ();
        nextElement.init(initLists(10));
    }

    @Test
    void getNextSmokeTest() {
        SortListOfSortedLists nextElement = new NextElementPQ();
        nextElement.init(initLists(10));
        for (int i = 0; i < 30; i++) {
            System.out.println(nextElement.getNext());

        }
    }

    private List<List<Integer>> initLists(int count) {
        List<List<Integer>> listOfLists = new ArrayList<>();
        List l3 = new ArrayList();
        List l5 = new ArrayList();
        List l8 = new ArrayList();

        for (int i = 1; i <= count; i++) {
            l3.add(3 * i);
            l5.add(5 * i);
            l8.add(8 * i);
        }

        listOfLists.add(l3);
        listOfLists.add(l5);
        listOfLists.add(l8);
        return listOfLists;
    }
}