package questions.binarytree.amazon;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NextElementFromSortedLists {
//    k sorted lists
//    m elements in each lists
//    k << m    (eg 1000 lists with 1M elements in each)
//
//    input =
//            [
//            [1,5,7],
//            [2,3,8],
//            [4,6,9]
//            ]
//
//    int getNext(...);
//    1, 2, 3, ...

        private MyBst tree = new MyBst();
        private Map<Integer, Integer> listsIndexMap = new HashMap<>();

        public int getNext() {
            MyBst node = tree.getSmallest();
            int listNum = node.getListNum();
            node.updateTree();
            listsIndexMap.put(listNum, listsIndexMap.get(listNum) + 1);
            return node.getNumber();
        }

        public void init(List<List<Integer>> numberLists) {
            // map ->
            // 0:0; 1:0; 2:0
            // create a binary tree
            MyBst root = new MyBst();

            int listsCount = 0;
            for (List<Integer> list : numberLists) {
                for (Integer number : list) {
                    MyBst node = new MyBst(number, listsCount);
                    listsIndexMap.put(listsCount, 0);
                    // insert node to tree

                    listsCount ++;
                }
            }
        }
}
