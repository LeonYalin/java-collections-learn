package com.leony.home;

public class PersonFixtures {
    // persons
    public static Person me = new Person("Leon Yalin", 32);
    public static Person nelly = new Person("Nelly Yalin", 30);
    public static Person lisa = new Person("Lisa Yalin", 0);
    public static Person mom = new Person("Inna Yalin", 55);
    public static Person defaultPerson = new Person("Default person", 99);

    // leaders
    public static GroupLeader goodLeader = new GroupLeader();
    public static GroupLeader soSoLeader = new GroupLeader();
    public static GroupLeader womenLeader = new GroupLeader();

    static {
        goodLeader.getGroup().add(me);
        goodLeader.getGroup().add(nelly);
        soSoLeader.getGroup().add(lisa);

        soSoLeader.getGroup().add(me);
        soSoLeader.getGroup().add(mom);

        womenLeader.getGroup().add(nelly);
        womenLeader.getGroup().add(lisa);
        womenLeader.getGroup().add(mom);
    }
}