package HeroesTelerik.Structures;

import HeroesTelerik.*;
import HeroesTelerik.Items.Item;
import HeroesTelerik.Items.RandomItemsFactory;

import java.util.ArrayList;

/**
 * Created by Joro on 02/05/2018
 */
public class Stronghold extends Structure {
    private String name;
    private Army army;
    private ArrayList<Item> items;
    private int loot;

    public Stronghold(){
        this.army = ArmyGenerator.generateArmy('A');
        this.loot = LootGenerator.generateLoot('A');
        this.items = (new RandomItemsFactory().generateItems());
    }

    public Stronghold(Coordinate position, String name) {
        this.name = name;
        this.position = position;
        this.army = ArmyGenerator.generateArmy('A');
        this.loot = LootGenerator.generateLoot('A');
        this.items = (new RandomItemsFactory().generateItems());
    }

    public Stronghold(Coordinate position, String name, Army army) throws EmptyArmyException{
        this.name = name;
        this.position = position;
        this.loot =LootGenerator.generateLoot('A');
        this.items = (new RandomItemsFactory().generateItems());
        if(army.getSlotOneType()==null){
            throw new EmptyArmyException("An army must contain at least one unit: "+army.getSlotOneType());
        }
    }

    public Army getArmy() {
        return army;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public int getLoot() {
        return loot;
    }

}
