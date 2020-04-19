package com.romanov.patterns.creational.factory.abstracted;

public abstract class Tank {
    protected String commanderName;

    Tank(String commanderName) {
        this.commanderName = commanderName;
    }
}
