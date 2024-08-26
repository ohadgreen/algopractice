package exercise.reflection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExploreObjectTest {
    private final ExploreObject exploreObject = new ExploreObject();

    @Test
    void exploreObjectTest() throws NoSuchFieldException, IllegalAccessException {
        PersonA personA = new PersonA("John", 25, null);
        personA.family = "Doe";
        personA.setIsAdult();
        exploreObject.printClassAttributes(personA);
    }

    @Test
    void createObjectInstanceTest() {
        Object objectInstance = exploreObject.createObjectInstance("exercise.reflection.PersonA");
        assertTrue(objectInstance instanceof PersonA);

        PersonA personA = (PersonA) objectInstance;
        personA.setName("John");

        assertEquals("John", personA.getName());
    }

    @Test
    void invokeMethodTest() {
        PersonA personA = new PersonA("John", 25, null);
        personA.setIsAdult();
        exploreObject.invokeMethod(personA, "setIsAdult");

        assertTrue(personA.isAdult());
    }

    @Test
    void invokeDoubleNumMethodTest() {
        Object doubleNum = exploreObject.invokeMethod(new MyUtils(), "doubleNum", 2);
        assertEquals(4, doubleNum);

    }

    @Test
    void invokeDivideNumbersMethodTest() {
        Object divideNumbers = exploreObject.invokeMethod(new MyUtils(), "divideNumbers", 1, 2);
        assertEquals(0.5, divideNumbers);
    }

}