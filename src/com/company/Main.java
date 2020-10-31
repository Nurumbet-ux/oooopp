package com.company;

public class Main {


    public static void main(String[] args) {

        Hero MedicBrat  = new Medic("healing","Megic Brat");
        Hero MagicBrat = new Magic("firing like a dragon","Magic Brat");
        Hero WarriorEje = new Warrior("Critical Damage","Warrior Eje");
        Hero[] Avakarrot = {MedicBrat,MagicBrat,WarriorEje};
        for (int i = 0; i < Avakarrot.length; i++) {
            System.out.println(Avakarrot[i].applySuperAbility(Avakarrot[i].getSuperPower()));
        }

    }
}
