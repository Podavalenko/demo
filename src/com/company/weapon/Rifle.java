package com.company.weapon;

import com.company.weapon.Weapon;

public class Rifle extends Weapon {
    @Override
    public void shot() {
        System.out.println("Бу-у-ух!");
    }
}
