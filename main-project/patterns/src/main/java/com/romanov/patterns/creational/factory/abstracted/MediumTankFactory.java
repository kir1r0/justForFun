package com.romanov.patterns.creational.factory.abstracted;

import org.apache.commons.lang3.RandomStringUtils;

public class MediumTankFactory implements TankFactory {
    @Override
    public Tank createTank() {
        return new MediumTank(RandomStringUtils.randomAlphabetic(15));
    }
}
