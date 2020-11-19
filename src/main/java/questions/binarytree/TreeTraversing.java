package questions.binarytree;

import questions.model.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeTraversing {

    public static void main(String[] args) {
        List<Integer> resultList = new ArrayList<>();
//        getInorderTraverse(constructTreeInOrder(), resultList);

        getBfsTraverse(constructBfsTree(), resultList);
        resultList.stream().forEach(System.out::println);
    }

    private static void getBfsTraverse(TreeNode node, List<Integer> results) {
        Queue<TreeNode> myQueue = new LinkedList<>();
        myQueue.add(node);

        while (myQueue.size() > 0) {
            TreeNode treeNode = myQueue.poll();
            results.add(treeNode.getKey());
            if (treeNode.getLeftNode() != null) {
                myQueue.add(treeNode.getLeftNode());
            }
            if (treeNode.getRightNode() != null) {
                myQueue.add(treeNode.getRightNode());
            }
        }
    }

    private static void getInorderTraverse(TreeNode node, List<Integer> results) {
        if (node == null) {
            return;
        }
        getInorderTraverse(node.getLeftNode(), results);
        results.add(node.getKey());
        getInorderTraverse(node.getRightNode(), results);
    }

    private static TreeNode constructBfsTree() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);
        TreeNode n9 = new TreeNode(9);

        n2.setLeftNode(n4);
        n2.setRightNode(n5);

        n1.setLeftNode(n2);
        n1.setRightNode(n3);

        n3.setLeftNode(n6);

        n4.setLeftNode(n7);
        n4.setRightNode(n8);

        n5.setLeftNode(n9);

        return n1;
    }

    private static TreeNode constructTreeInOrder() {
        TreeNode root = new TreeNode(6);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);
        TreeNode n9 = new TreeNode(9);

        n2.setLeftNode(n1);
        n2.setRightNode(n4);
        n4.setLeftNode(n3);
        n4.setRightNode(n5);

        n7.setRightNode(n9);
        n9.setLeftNode(n8);

        root.setLeftNode(n2);
        root.setRightNode(n7);

        return root;
    }
}
