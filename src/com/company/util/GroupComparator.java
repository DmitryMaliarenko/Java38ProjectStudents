package com.company.util;

import com.company.model.Group;

import java.util.Comparator;

public class GroupComparator implements Comparator<Group> {
    @Override
    public int compare(Group o1, Group o2) {
        return o1.getGroupName() - o2.getGroupName();
    }
}
