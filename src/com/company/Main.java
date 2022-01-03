package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        int slot = scanner.nextInt();
        while (slot != -1) {
            switch (slot) {
                case 0:
                    player.shotWithWeapon(0);
                    break;
                case 1:
                    player.shotWithWeapon(1);
                    break;
                case 2:
                    player.shotWithWeapon(2);
                    break;

                default:
                    System.out.println("Неверный номер! Выберите оружие от 0 до 2");
                    break;
            }
            slot = scanner.nextInt();
        }


        System.out.println("Game Over!");

    }
}

