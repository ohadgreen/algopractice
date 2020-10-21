package questions.binarytree;

import questions.model.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class LeafPathDistinctNodes {

    public static void main(String[] args) {
        Set<Integer> pathSet = new HashSet<>();
        int longestPath = 0;
        TreeNode root = createTree();
//        calculatePath(root, (HashSet<Integer>) pathSet, longestPath);
        printPaths(root, "");

    }

    private static void printPaths(TreeNode node, String currentPath) {
        currentPath += " -> " + node.getKey().toString();
        if (node.getLeftNode() != null) {
            printPaths(node.getLeftNode(),currentPath);
        }
        if (node.getRightNode() != null) {
            printPaths(node.getRightNode(), currentPath);
        }
        if (node.getLeftNode() == null && node.getRightNode() == null) {
            System.out.println("leaf " + node.getKey() + " path: " + currentPath);
        }
    }

    private static void calculatePath(TreeNode node, HashSet<Integer> pathSet, int longestPath) {
        pathSet.add(node.getKey());

        if (node.getLeftNode() != null) {
            calculatePath(node.getLeftNode(), pathSet, longestPath);
        }
        if (node.getRightNode() != null) {
            calculatePath(node.getRightNode(), pathSet, longestPath);
        }
        if (node.getLeftNode() == null && node.getRightNode() == null) {
            longestPath = Math.max(pathSet.size(), longestPath);
            System.out.println("node:" + node.getKey());
            System.out.println(pathSet);
            System.out.println(longestPath);
//            pathSet.clear();
        }

    }

    public static TreeNode createTree() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n3r = new TreeNode(3);
        TreeNode n8 = new TreeNode(8);
        TreeNode n9 = new TreeNode(9);

        n2.setLeftNode(n4);
        n2.setRightNode(n5);

        n6.setLeftNode(n7);
        n6.setRightNode(n8);

        n3r.setRightNode(n9);

        n3.setLeftNode(n6);
        n3.setRightNode(n3r);

        n1.setLeftNode(n2);
        n1.setRightNode(n3);

        return n1;
    }
}
