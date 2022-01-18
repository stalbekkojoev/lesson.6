package com.company;

public class Skeleton extends Boss {
    private int strel;

    public int getStrel() {
        return strel;
    }

    public void setStrel(int strel) {
        this.strel = strel;
    }
    public String printInfo(){
        return "Жизнь: "+ getHealth() + "\nУрон: " + getDamage()
                + "\nНазвание: "+weapon.getWeaponName()+"\nТип: "+weapon.getWeaponType()+"\nCтрела: "+getStrel();
    }
}
