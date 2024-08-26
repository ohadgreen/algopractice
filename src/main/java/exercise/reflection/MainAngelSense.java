package exercise.reflection;

import java.util.ArrayList;
import java.util.List;

public class MainAngelSense {

        public static void main (String[] args) {

            // The object structre below should be printed by your utility
            Person father = new Person();
            father.name = "John";
            father.age = 45;

            Person child1 = new Person();
            child1.name = "Alice";
            child1.age = 20;

            Person child2 = new Person();
            child2.name = "Bob";
            child2.age = 18;

            father.children = new Person[]{child1, child2};

            List<Person> grandchildren = new ArrayList<>();
            Person grandchild1 = new Person();
            grandchild1.name = "Emily";
            grandchild1.age = 2;

            Person grandchild2 = new Person();
            grandchild2.name = "Oliver";
            grandchild2.age = 4;

            grandchildren.add(grandchild1);
            grandchildren.add(grandchild2);

            father.grandchildren = grandchildren;

            // The code below should be replaced with a single line calling your utility
            // Implement the utility in a separate class (at the top left section
            // where you see the Main and Person classes you can add your class).

            PrintObjectUtil.printObjectValues(father);

            System.out.println("Object of class Person: ");
            System.out.println("  Name: " + father.name);
            System.out.println("  Age: " + father.age);

            System.out.println("\n  children:");
            for (Person child : father.children) {
                System.out.println("    Object of class Person: ");
                System.out.println("      Name: " +  child.name);
                System.out.println("      Age: " + child.age);
            }

            System.out.println("\n  grandchildren:");
            for (Person grandchild : father.grandchildren) {
                System.out.println("    Object of class Person: ");
                System.out.println("      Name: " +  grandchild.name);
                System.out.println("      Age: " + grandchild.age);
            }
        }

    }
