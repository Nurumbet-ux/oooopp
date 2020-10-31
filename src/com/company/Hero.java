package com.company;

import java.io.OptionalDataException;


public abstract class Hero implements HavingSuperAbility {
    private String damage;
    private String Type;
    private String superPower;
    private String Naming;
    public Hero(String superPower,String naming){
        this.superPower= superPower;
        this.Naming = naming;
    }


    public String getNaming() {
        return Naming;
    }

    public void setNaming(String naming) {
        Naming = naming;
    }

    public String getDamage() {

        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getSuperPower() {

        return superPower;

    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }
}


