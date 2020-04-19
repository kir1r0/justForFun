package com.romanov.patterns.creational.factory.abstracted;

import org.apache.commons.lang3.RandomStringUtils;

public class HeavyTankFactory implements TankFactory {

    @Override
    public Tank createTank() {
        return new HeavyTank(RandomStringUtils.randomAlphabetic(15));
    }
}
