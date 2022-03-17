package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setUron(50);
        boss.getWeapon().setTypeOfWeapon("огнестрел");
        boss.getWeapon().setNameOfWeapon("Базука");
        Skeleton skeleton=new Skeleton();
        skeleton.setArrows(1000);
        System.out.println("info of Boss:"+"health"+ boss.getHealth()+" uron:"+boss.getUron()+" weapon:"+boss.getWeapon().getNameOfWeapon()+","+boss.getWeapon().getTypeOfWeapon());
    }

}