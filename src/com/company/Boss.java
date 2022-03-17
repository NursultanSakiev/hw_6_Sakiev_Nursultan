package com.company;

public class Boss extends GameEntity {
    public Weapon weapon = new Weapon();
    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printInfo(){
        return health + uron+ getWeapon().getTypeOfWeapon()+getWeapon().getNameOfWeapon();
    }
}
