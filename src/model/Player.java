package model;

import model.item.Item;
import model.talents.Talent;
import java.util.ArrayList;
import java.util.List;

public class Player {
    public String name;
    public int level = 1;
    public Talent talent;
    public List<Item> inventory;

    public Player(String name, Talent t) {
        this.name = name;
        this.talent = t;
        this.inventory = new ArrayList<>();
    }
}
