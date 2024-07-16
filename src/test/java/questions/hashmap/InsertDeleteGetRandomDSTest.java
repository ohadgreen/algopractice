package questions.hashmap;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    void arrayListTest() {
        List<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        list.remove(2);

        list.stream().forEach(System.out::println);
    }
}