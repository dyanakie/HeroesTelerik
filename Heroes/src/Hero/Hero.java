package Hero;

import Items.Item;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hero {
    private static final int BASE_ATTACK = 5;
    private static final int BASE_DEFENCE = 5;


    private String name;
    private HeroClass heroClass;
    private int attack;
    private int defence;
    private List<Item> items;
    private Slot slotOne;
    private Slot slotTwo;
    private Slot slotThree;

    public Hero(String name) {
        this.name = name;
        this.heroClass = HeroClass.randomHeroClass();
        this.attack = BASE_ATTACK;
        this.defence = BASE_DEFENCE;
        this.items = new ArrayList<>();
        this.slotOne = new Slot();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAtack() {
        return attack;
    }

    public void setAtack(int atack) {
        this.attack = atack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }





}
