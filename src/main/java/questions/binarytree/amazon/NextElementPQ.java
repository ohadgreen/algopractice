package questions.binarytree.amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class NextElementPQ implements SortListOfSortedLists {

    private List<List<Integer>> numberLists = new ArrayList<>();
    private Queue<MyNumber> nextElementQueue = new PriorityQueue();

    @Override
    public void init(List<List<Integer>> numberLists) {
        this.numberLists = numberLists;

        for (int i = 0; i < numberLists.size(); i++) {
            if (numberLists.get(i).size() > 0) {
                Integer firstNumber = numberLists.get(i).get(0);
                MyNumber myNumber = new MyNumber(firstNumber, i, 0);
                nextElementQueue.add(myNumber);
            }
        }
    }

    @Override
    public Integer getNext() {
        if (nextElementQueue.isEmpty())
            return null;

        else {
            MyNumber nextNumber = nextElementQueue.poll();
            Integer fromList = nextNumber.getFromList();
            if (numberLists.get(fromList).size() > nextNumber.getIndex() + 1) {
                Integer newNumToQueue = numberLists.get(fromList).get(nextNumber.getIndex() + 1);
                MyNumber nextMyNumberToQ = new MyNumber(newNumToQueue, fromList, nextNumber.getIndex() + 1);
                nextElementQueue.add(nextMyNumberToQ);
            }
        return nextNumber.getNumber();
        }
    }
}
