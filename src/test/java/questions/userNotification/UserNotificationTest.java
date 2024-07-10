package questions.userNotification;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import questions.model.MyGroup;
import questions.model.MyUser;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class UserNotificationTest {

    private UserNotification userNotification = new UserNotification();

    @BeforeEach
    void initUsersAndGroups() {
        userNotification.initGroupsAndUsers();
    }
    @Test
    void notifyUsersTest1() {
        List<MyGroup> myGroups = userNotification.groups.subList(0, 2);
        List<MyUser> myUsers = userNotification.users.subList(0, 3);

        Set<MyUser> usersToNotify = userNotification.sendNotification(myUsers, myGroups);

        assertEquals(4, usersToNotify.size());
    }

    @Test
    void mapAndNotifyUsersTest() {
        List<MyGroup> myGroups = userNotification.groups.subList(0, 2);
        List<MyUser> myUsers = userNotification.users.subList(0, 3);

        Set<MyUser> usersToNotify = userNotification.mapAndSendNotifications(myUsers, myGroups);

        assertEquals(4, usersToNotify.size());
    }

    @Test
    void computeIfAbsentTest() {

        Map<MyGroup, Set<MyUser>> groupsToUsersMap = new HashMap<>();
        for (MyUser myUser : userNotification.users) {
            Set<MyGroup> groups = myUser.getGroups();
            for (MyGroup myGroup : groups) {
                groupsToUsersMap.computeIfAbsent(myGroup, k -> new HashSet<>()).add(myUser);
            }
        }

        assertEquals(3, groupsToUsersMap.size());

    }


    @Test
    void notificationTest() {
        List<MyGroup> groupsToNotifyList = userNotification.groups.subList(1, 3);
        Set<MyGroup> groupSet = new HashSet<>(groupsToNotifyList);

        Set<MyUser> userSet = new HashSet<>();

        for (MyUser user : userNotification.users) {
            for (MyGroup group : user.getGroups()) {
                if (groupSet.contains(group)) {
                    userSet.add(user);
                    break;
                }
            }
        }

        userSet.forEach(u -> System.out.println(u.getName()));
    }

    @Test
    void initGroupsMapTest() {
        Map<MyGroup, Set<MyUser>> groupsToUsersMap = new HashMap<>();

//        for (MyUser user : userNotification.users) {
//            for (MyGroup group : user.getGroups()) {
//                if (groupsToUsersMap.containsKey(group)) {
//                    groupsToUsersMap.get(group).add(user);
//                } else {
//                    Set<MyUser> newGroupSet = new HashSet<>();
//                    newGroupSet.add(user);
//                    groupsToUsersMap.put(group, newGroupSet);
//                }
//            }
//        }

        for (MyUser user : userNotification.users) {
            for (MyGroup group : user.getGroups()) {
//                groupsToUsersMap.computeIfAbsent(group, k -> new HashSet<>()).add(user);
                Set<MyUser> userSet = groupsToUsersMap.computeIfAbsent(group, k -> new HashSet<>());
                userSet.add(user);
            }
        }

        for (Map.Entry<MyGroup, Set<MyUser>> entry : groupsToUsersMap.entrySet()) {
            System.out.println(entry.getKey().getName());
            entry.getValue().forEach(u -> System.out.print(u.getName() + " | "));
            System.out.println("---");
        }

    }

}