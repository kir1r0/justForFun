package com.romanov.patterns.creational.factory.method;

import org.apache.commons.lang3.RandomStringUtils;

public class TankFactory {
    Tank createTank(TankType tankType) {
        switch (tankType) {
            case MEDIUM: {
                return new MediumTank(RandomStringUtils.randomAlphabetic(15));
            }
            case HEAVY: {
                return new HeavyTank(RandomStringUtils.randomAlphabetic(15));
            }
            default:
                throw new IllegalArgumentException("Tank not found for type: " + tankType.toString());
        }
    }
}
