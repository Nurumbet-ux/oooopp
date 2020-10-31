package com.company;

public class Warrior extends Hero{


    public Warrior(String superPower, String naming) {
        super(superPower, naming);
    }

    @Override
    public String applySuperAbility(String superAbilityType) {

        return getNaming()+" применил способность "+ superAbilityType;
    }
}
