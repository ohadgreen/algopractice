package questions.binarytree;

import questions.model.TreeNode;

public class SearchTreeBasic {
    private TreeNode root;

    public void insertNodeToTree(Integer key) {
        root = insertNode(key, root);
    }

    private TreeNode insertNode(Integer key, TreeNode treeNode) {
        if (treeNode == null) {
            return new TreeNode(key);
        }
        if (key < treeNode.getKey()) {
            treeNode.setLeftNode(insertNode(key, treeNode.getLeftNode()));
        }
        if (key > treeNode.getKey()) {
            treeNode.setRightNode(insertNode(key, treeNode.getRightNode()));
        }
        return treeNode;
    }

    public TreeNode searchValueInTree(int key) {
        return searchNode(root, key);
    }

    private TreeNode searchNode(TreeNode treeNode, Integer key) {
        if (treeNode == null) return null;
        if (treeNode.getKey() == key) return treeNode;

        if (key < treeNode.getKey()){
            return searchNode(treeNode.getLeftNode(), key);
        }
        return searchNode(treeNode.getRightNode(), key);
    }

    public void printInOrder() {
        printNodes(root);
    }

    private void printNodes(TreeNode treeNode) {
        if (treeNode != null) {
            printNodes(treeNode.getLeftNode());
            System.out.println(treeNode.getKey());
            printNodes(treeNode.getRightNode());
        }
    }

    public void printOnlyLeafs() {
        printLeafs(root);
    }

    private void printLeafs(TreeNode treeNode) {
        if (treeNode != null && treeNode.getLeftNode() == null && treeNode.getRightNode() == null) {
            System.out.println(treeNode.getKey());
        }
        if (treeNode != null) {
            printLeafs(treeNode.getLeftNode());
            printLeafs(treeNode.getRightNode());
        }
    }

}
