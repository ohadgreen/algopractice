package questions.model;

import java.util.HashSet;
import java.util.Set;

public class MyUser {
    private String name;
    private String email;
    private Set<MyGroup> groups;

    public MyUser(String name, String email, Set<MyGroup> groups) {
        this.name = name;
        this.email = email;
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Set<MyGroup> getGroups() {
        return groups;
    }
}
