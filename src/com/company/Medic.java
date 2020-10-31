package com.company;

public class Medic extends Hero {


    public Medic(String superPower, String naming) {
        super(superPower, naming);
    }


    @Override
    public String applySuperAbility(String superAbilityType) {
        return getNaming()+" применил способность "+ superAbilityType;
    }
}
