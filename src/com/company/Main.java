package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    public static void main(String[] args) {
      Boss boss = new Boss();
      boss.setHealth(2000);
      boss.setDamage(50);
      boss.weapon.setWeaponName("MG-90");
      boss.weapon.setWeaponType("пулемет");
      System.out.println("Босс");
      System.out.println(boss.printInfo());

      System.out.println("--------------------------------");
      System.out.println("Skeleton");
      Skeleton skeleton = new Skeleton();
      skeleton.setStrel(30);
      skeleton.setHealth(1000);
      skeleton.setDamage(40);
      skeleton.weapon.setWeaponType("Лук");
      skeleton.weapon.setWeaponName("VSSSLLK");
        System.out.println(skeleton.printInfo());

      System.out.println("--------------------------------");
      System.out.println("Skeleton2");
      Skeleton skeleton2 = new Skeleton();
      skeleton2.setStrel(50);
      skeleton2.setHealth(700);
      skeleton2.setDamage(20);
      skeleton2.weapon.setWeaponType("Лук");
      skeleton2.weapon.setWeaponName("SSK");
      System.out.println(skeleton2.printInfo());


    }
}

