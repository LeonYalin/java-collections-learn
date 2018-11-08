package com.leony.home;

import java.util.ArrayList;
import java.util.List;

public class GroupLeader {
    List<Person> group = new ArrayList<>();

    public GroupLeader() {}

    public GroupLeader(List<Person> persons) {
        this.group = persons;
    }

    public List<Person> getGroup() {return group;}

    public void setGroup(List<Person> group) {this.group = group;}
}
