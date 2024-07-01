package exercise.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySingleton2Test {

    @Test
    void getInstanceTest() {
        MySingleton2 first = MySingleton2.getInstance("first");
        System.out.println("Instance: " + first + " name = " + first.getName());

        MySingleton2 second = MySingleton2.getInstance("second");

        System.out.println("second = " + second + " name = " + second.getName());

        Assertions.assertEquals(first, second);
    }

}