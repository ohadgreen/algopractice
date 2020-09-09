package questions.model;

public class ExpressionTreeNode {
    private char aChar;
    private ExpressionTreeNode leftNode;
    private ExpressionTreeNode rightNode;

    public char getaChar() {
        return aChar;
    }

    public void setaChar(char aChar) {
        this.aChar = aChar;
    }

    public ExpressionTreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(ExpressionTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public ExpressionTreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(ExpressionTreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
