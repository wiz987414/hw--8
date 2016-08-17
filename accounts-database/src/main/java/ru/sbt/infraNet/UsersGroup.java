package ru.sbt.infraNet;

import java.util.Calendar;
import java.util.List;

public class UsersGroup {
    private final List<UserAccount> groupConsists;
    private final String groupTitle;
    private final Calendar groupCreateDate;

    public UsersGroup(List<UserAccount> groupConsists,
                      String groupTitle,
                      Calendar groupCreateDate) {
        this.groupConsists = groupConsists;
        this.groupTitle = groupTitle;
        this.groupCreateDate = groupCreateDate;
    }

    public UsersGroup addUser(UserAccount addedAccount) {
        List<UserAccount> resultGroup = this.getGroupConsists();
        resultGroup.add(addedAccount);
        return new UsersGroup(resultGroup,
                this.getGroupTitle(),
                this.getGroupCreateDate());
    }

    public List<UserAccount> getGroupConsists() {
        return groupConsists;
    }

    public String getGroupTitle() {
        return groupTitle;
    }

    public Calendar getGroupCreateDate() {
        return groupCreateDate;
    }
}
