package questions.userNotification;

import questions.model.MyGroup;
import questions.model.MyUser;

import java.util.*;

public class UserNotification {

    protected List<MyUser> users = new ArrayList<>();
    protected List<MyGroup> groups = new ArrayList<>();

    public Set<MyUser> mapAndSendNotifications(List<MyUser> usersToNotify, List<MyGroup> groupsToNotify) {
        Map<MyGroup, Set<MyUser>> groupsUsersMap = mapUsersToGroups();

        Set<MyUser> usersToNotifySet = new HashSet<>();

        for (MyGroup myGroup : groupsToNotify) {
            usersToNotifySet.addAll(groupsUsersMap.get(myGroup));
        }

        usersToNotifySet.addAll(usersToNotify);

        return usersToNotifySet;

    }

    public Set<MyUser> sendNotification(List<MyUser> usersToNotify, List<MyGroup> groupsToNotify) {
        Set<MyUser> usersToNotifySet = new HashSet<>();
        usersToNotifySet.addAll(usersToNotify);

        for (MyGroup group : groupsToNotify) {
            for (MyUser user : users) {
                if (user.getGroups().contains(group)) {
                    usersToNotifySet.add(user);
                }
            }
        }

        for (MyUser user : usersToNotifySet) {
            System.out.println("notify - " + user.getName());
        }

        return usersToNotifySet;
    }

    protected Map<MyGroup, Set<MyUser>> mapUsersToGroups() {
        Map<MyGroup, Set<MyUser>> groupsToUsersMap = new HashMap<>();
        for (MyUser myUser : users) {
            for (MyGroup myGroup : myUser.getGroups()) {
                if (groupsToUsersMap.containsKey(myGroup)) {
                    groupsToUsersMap.get(myGroup).add(myUser);
                } else {
                    Set<MyUser> newUserSet = new HashSet<>();
                    newUserSet.add(myUser);
                    groupsToUsersMap.put(myGroup, newUserSet);
                }
            }
        }

        return groupsToUsersMap;
    }

    protected void initGroupsAndUsers() {
        MyGroup group1 = new MyGroup("G1");
        MyGroup group2 = new MyGroup("G2");
        MyGroup group3 = new MyGroup("G3");

        groups.add(group1);
        groups.add(group2);
        groups.add(group3);

        MyUser user1 = new MyUser("Avi", "avi@acme.com", new HashSet<>());
        MyUser user2 = new MyUser("Ben", "ben@acmi.com", new HashSet<>(Arrays.asList(group1)));
        MyUser user3 = new MyUser("Cathy", "cathy@acme.com", new HashSet<>(Arrays.asList(group1, group2, group3)));
        MyUser user4 = new MyUser("Dan", "dan@acmi.com", new HashSet<>(Arrays.asList(group3)));
        MyUser user5 = new MyUser("Hanna", "hanna@acmi.com", new HashSet<>(Arrays.asList(group2, group3)));

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
    }
}
