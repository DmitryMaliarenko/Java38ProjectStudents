package com.company.repository;

import com.company.model.Group;

import java.util.ArrayList;
import java.util.List;

public class GroupRepository {
    private List<Group> groups = new ArrayList<>();

    public void removeGroups(List<Group> removeGroups) {
        groups.remove(removeGroups);
    }

    public void addGroups(List<Group> addGroups) {
        groups.addAll(addGroups);
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<Group> getGroups() {
        return groups;
    }

}
