package com.company;

import com.company.weapon.Bazooka;
import com.company.weapon.Rifle;
import com.company.weapon.Shotgun;
import com.company.weapon.Weapon;

public class Player {
    private final Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{new Rifle(), new Bazooka(), new Shotgun()};


}

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot < 0 || slot > weaponSlots.length -1) {
            System.out.println("Значение slot некорректно");
            throw new IllegalArgumentException();
        } else {
            Weapon weapon = weaponSlots[slot];
            weapon.shot();
        }
    }
}