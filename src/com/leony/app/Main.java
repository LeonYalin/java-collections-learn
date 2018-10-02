package com.leony.app;

import com.leony.home.WhatAreCollections;

public class Main {

    public static void main(String[] args) {
        whatAreCollections();
    }

    private static void whatAreCollections() {
        WhatAreCollections whatAreCollections = new WhatAreCollections();

        printMessage("WhatAreCollections: the problem with arrays");
        whatAreCollections.theProblemWithArrays();
    }

    private static void printMessage(String msg) {
        System.out.println("\n========= " + msg + " ===========\n");
    }
}
