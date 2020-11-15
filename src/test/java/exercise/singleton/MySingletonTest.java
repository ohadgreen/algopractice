package exercise.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySingletonTest {

    @Test
    void getInstanceTest() {
        MySingleton i1 = MySingleton.getInstance("Elvis");
        System.out.println("i1 = " + i1.getName());

        MySingleton i2 = MySingleton.getInstance("Michael");
        System.out.println("i2 = " + i2.getName());

    }
}