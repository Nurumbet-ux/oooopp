package com.company;

public class Magic extends Hero {


    public Magic(String superPower, String naming) {
        super(superPower, naming);
    }

    @Override
    public String applySuperAbility(String superAbilityType) {

        return getNaming()+" применил способность "+ superAbilityType;
    }
}
