package main;

import model.Player;

public class Game {
    static Player player;

    public Game () {
        player = new Player("Scott", null);
        new Weapon(WeaponType.Stick);
    }

    public static void main (String[] args) {
        System.out.println("Yes");
    }
}
