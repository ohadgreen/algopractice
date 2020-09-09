package questions.binarytree.expressiontree;

import questions.model.ExpressionTreeNode;

public class BuildExpressionTree {
    public ExpressionTreeNode buildTreeFromString(String expressionInput) {
        for (int i = 0; i < expressionInput.length(); i++) {
            char aChar = expressionInput.charAt(i);

        }

        return null;
    }

    protected boolean isOperator(char aChar) {
        String operators = "+-*/";
        return (operators.indexOf(aChar) >= 0);
    }
}
