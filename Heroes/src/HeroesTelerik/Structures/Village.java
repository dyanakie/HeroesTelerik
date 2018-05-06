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
public class Village extends Structure{
    private Army army;
    private String name;
    private ArrayList<Item> items;
    private int loot;

    public Village(Coordinate position,String name){
        this.position = position;
        this.name = name;
        this.army = Generator.Generate_Army('V');
        this.loot = Generator.generateLoot('V');
        this.items = (new RandomItemsFactory().generateItems());
    }

    public Village(Coordinate position,String name,Army army) throws EmptyArmyException{
        this.position = position;
        this.name = name;
        this.loot = Generator.generateLoot('V');
        this.items = (new RandomItemsFactory().generateItems());
        if(army.getSlotOneType()==null){
            throw new EmptyArmyException("An army must contain at least one unit: "+army.getSlotOneType());
        }
        this.army = army;
    }

    public Army getArmy() {
        return army;
    }

    public void setArmy(Army army) {
        this.army = army;
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
