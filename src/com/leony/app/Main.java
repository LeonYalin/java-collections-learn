package com.leony.app;

import com.leony.home.*;

public class Main {

    public static void main(String[] args) {
        whatAreCollections();
        definingAndIteratingCollections();
        collectionsWithIterationOrder();
        collectionsWithUniqueness();
        collectionsWithModificationOrder();
        collectionsOfPairs();
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

        printMessage("CollectionsWithIterationOrder: -= TDD =- try to run PersonsGroupTest class!");
    }

    private static void collectionsWithUniqueness() {
        CollectionsWithUniqueness collectionsWithUniqueness = new CollectionsWithUniqueness();

        printMessage("CollectionsWithUniqueness: play with sets");
        collectionsWithUniqueness.playWithSets();
    }

    private static void collectionsWithModificationOrder() {
        CollectionsWithModificationOrder collectionsWithModificationOrder = new CollectionsWithModificationOrder();

        printMessage("CollectionsWithModificationOrder: play with queues");
        collectionsWithModificationOrder.playWithQueues();

        printMessage("CollectionsWithModificationOrder: play with deques");
        collectionsWithModificationOrder.playWithDeques();
    }

    private static void collectionsOfPairs() {
        CollectionsOfPairs collectionsOfPairs = new CollectionsOfPairs();

        printMessage("CollectionsOfPairs: -= TDD =- try to run PersonOrdersTest class!");

        printMessage("CollectionsOfPairs: play with maps");
        collectionsOfPairs.playWithMaps();

        printMessage("CollectionsOfPairs: play with sorted maps");
        collectionsOfPairs.playWithSortedMaps();

        printMessage("CollectionsOfPairs: Java 8 enhancements");
        collectionsOfPairs.java8Enhancements();
    }

    private static void printMessage(String msg) {
        System.out.println("\n========= " + msg + " ===========\n");
    }
}
