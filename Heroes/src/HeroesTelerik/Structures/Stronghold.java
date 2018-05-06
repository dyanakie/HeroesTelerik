package HeroesTelerik.Structures;

import HeroesTelerik.Army;
import HeroesTelerik.Coordinate;
import HeroesTelerik.EmptyArmyException;
import HeroesTelerik.Generator;
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
        this.army = Generator.Generate_Army('A');
        this.loot = Generator.generateLoot('A');
        this.items = (new RandomItemsFactory().generateItems());
    }

    public Stronghold(Coordinate position, String name) {
        this.name = name;
        this.position = position;
        this.army = Generator.Generate_Army('A');
        this.loot = Generator.generateLoot('A');
        this.items = (new RandomItemsFactory().generateItems());
    }

    public Stronghold(Coordinate position, String name, Army army) throws EmptyArmyException{
        this.name = name;
        this.position = position;
        this.loot = Generator.generateLoot('A');
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
