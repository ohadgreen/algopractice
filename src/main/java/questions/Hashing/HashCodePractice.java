package questions.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class HashCodePractice {

    public static void main(String[] args) {
        Person p1 = new Person(1, "Alice");
        Person p2 = new Person(1, "Alice");
        Person p3 = new Person(2, "Bob");

        Map<Person, String> personsMap = new HashMap<>();
        personsMap.put(p1, "I am Alice");
        personsMap.put(p2, "I am also Alice");
        personsMap.put(p3, "I am Bob");

        System.out.println("p1 hashcode: " + p1.hashCode());
        System.out.println("p2 hashcode: " + p2.hashCode());
        System.out.println("p3 hashcode: " + p3.hashCode());

        Set<Person> people = personsMap.keySet();
        people.forEach(p -> System.out.println(personsMap.get(p)));
    }

}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
}