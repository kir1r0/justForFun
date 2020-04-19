package com.romanov.patterns.creational.factory.method;

public abstract class Tank {
    protected String commanderName;

    Tank(String commanderName) {
        this.commanderName = commanderName;
    }
}
