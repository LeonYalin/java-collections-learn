package com.leony.home;

public enum Hobbies {
    SPORT("Football", "watching"),
    MUSIC("Guitar", "playing"),
    HIKING("Climbing", "playing");

    private String name;
    private String action;

    Hobbies(String name, String action) {
        this.name = name;
        this.action = action;
    }

    public String getName() { return name; }
    public String getAction() { return action; }

    @Override
    public String toString() {
        return String.format("%s %s", action, name);
    }
}
