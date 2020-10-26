package questions.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertDeleteGetRandomDSTest {

    InsertDeleteGetRandomDS dsTest = new InsertDeleteGetRandomDS();

    @Test
    void insertTest() {
        dsTest.insert("Shlumper");
        dsTest.insert("Juno");
        dsTest.insert("Layka");

        boolean shlumper = dsTest.search("Shlumper");
        Object random = dsTest.getRandom();
        System.out.println("random = " + random);

        assertTrue(shlumper);
    }

    @Test
    void delete() {
        dsTest.insert("one");
        dsTest.insert("two");
        dsTest.insert("three");
        dsTest.insert("four");
        dsTest.insert("five");
        dsTest.insert("six");

        dsTest.delete("three");
        dsTest.delete("five");

        Object random = dsTest.getRandom();
        System.out.println("random = " + random);

        assertNotNull(random);
    }

    @Test
    void getRandom() {
    }
}