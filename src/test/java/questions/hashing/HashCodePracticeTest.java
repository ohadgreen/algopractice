package questions.hashing;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class HashCodePracticeTest {

    @Test
    void hashCodeSimpleTest() {
        int id = 1;
        String name = "Alice";

        int testHash = Objects.hash(id, name);
        System.out.println("testHash = " + testHash);
    }

    @Test
    void testString() {
        String name = "Alice";
        int nameHashCode = name.hashCode();

        System.out.println("name: " + name + ", nameHashCode = " + nameHashCode);

    }

}