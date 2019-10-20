package by.epam.training.errorexception;

import java.util.ArrayList;
import java.util.List;

public class Faculty {

    List<Group> groups;

    public Faculty() {
        this.groups = new ArrayList<Group>();
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public List<Group> getGroups() throws Exception {
        if (groups.size() == 0) {
            throw new Exception("No groups");
        }
        return groups;
    }
}
