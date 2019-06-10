package questions.binarytree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import questions.model.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SearchTreeBasicTest {
    private SearchTreeBasic searchTree = new SearchTreeBasic();

    @BeforeEach
    public void initNodes() {
        searchTree.insertNodeToTree(30);
        searchTree.insertNodeToTree(10);
        searchTree.insertNodeToTree(50);
        searchTree.insertNodeToTree(40);
        searchTree.insertNodeToTree(20);
        searchTree.insertNodeToTree(70);
        searchTree.insertNodeToTree(60);
    }

    @Test
    public void printTree() {
        searchTree.printInOrder();
        assertEquals(1, 1);
    }

    @Test
    public void printLeafs() {
        searchTree.printOnlyLeafs();
        assertEquals(1, 1);
    }

    @Test
    public void searchKey() {
        int keyToFind = 30;
        TreeNode searchResult = searchTree.searchValueInTree(keyToFind);
        assertEquals(keyToFind, searchResult.getKey());
    }

    @Test
    public void searchKeyNotExist() {
        int keyToFind = 100;
        TreeNode searchResult = searchTree.searchValueInTree(keyToFind);
        assertNull(searchResult);
    }

}