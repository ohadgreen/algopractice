package questions.lists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiDirList2Test {

    private final BiDirList2 biDirList2 = new BiDirList2();

    @BeforeEach
    void initList() {
        biDirList2.addNodeToTail(1);
        biDirList2.addNodeToTail(2);
        biDirList2.addNodeToTail(3);
    }

    @Test
    void addNewNodeToTailTest() {
        biDirList2.addNodeToTail(7);
        assertEquals(7, biDirList2.getTail());
    }

    @Test
    void removeFromHeadTest() {
        int head = biDirList2.removeFromHead();
        assertEquals(1, head);
    }

}