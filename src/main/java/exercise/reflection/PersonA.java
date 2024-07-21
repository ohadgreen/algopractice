package exercise.reflection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonA {

    private String name;
    private int age;
    private boolean isAdult;
    private LocalDate birthDate;
    private List<PersonA> siblings = new ArrayList<>();

//    public PersonA() {
//    }

    public PersonA(String name, int age, LocalDate birthDate) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<PersonA> getSiblings() {
        return siblings;
    }

    public void setSiblings(List<PersonA> siblings) {
        this.siblings = siblings;
    }

    public void setIsAdult() {
        if (age >= 18) {
            isAdult = true;
        } else {
            isAdult = false;
        }
    }
}
