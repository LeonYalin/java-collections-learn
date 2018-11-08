package com.leony.app;

import com.leony.home.CollectionsWithIterationOrder;
import com.leony.home.CollectionsWithUniqueness;
import com.leony.home.DefiningAndIteratingCollections;
import com.leony.home.WhatAreCollections;

public class Main {

    public static void main(String[] args) {
        whatAreCollections();
        definingAndIteratingCollections();
        collectionsWithIterationOrder();
        collectionsWithUniqueness();
    }

    private static void whatAreCollections() {
        WhatAreCollections whatAreCollections = new WhatAreCollections();

        printMessage("WhatAreCollections: the problem with arrays");
        whatAreCollections.theProblemWithArrays();
    }

    private static void definingAndIteratingCollections() {
        DefiningAndIteratingCollections definingAndIteratingCollections = new DefiningAndIteratingCollections();

        printMessage("DefiningAndIteratingCollections: try collection common methods");
        definingAndIteratingCollections.tryCollectionCommonMethods();
    }

    private static void collectionsWithIterationOrder() {
        CollectionsWithIterationOrder collectionsWithIterationOrder = new CollectionsWithIterationOrder();

        printMessage("CollectionsWithIterationOrder: try list common methods");
        collectionsWithIterationOrder.tryListCommonMethods();

        printMessage("CollectionsWithIterationOrder: try TDD - try to run PersonsGroupTest class!");
    }

    private static void collectionsWithUniqueness() {
        CollectionsWithUniqueness collectionsWithUniqueness = new CollectionsWithUniqueness();

        printMessage("CollectionsWithUniqueness: play with sets");
        collectionsWithUniqueness.playWithSets();
    }

    private static void printMessage(String msg) {
        System.out.println("\n========= " + msg + " ===========\n");
    }
}
