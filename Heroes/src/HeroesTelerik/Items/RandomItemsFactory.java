package HeroesTelerik.Items;

import HeroesTelerik.ItemType;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Joro on 03/05/2018
 *  Item Price = value*2; (*3 for weapons)
 *  Item Weight = value/10;
 *
 * NOTE: length of both Strings[] much match!!
 */
public class RandomItemsFactory {
    private final int MIN_VALUE = 1;
    private final int MAX_VALUE = 30;
    private final int POTION_QUANTITY = 30;
    private String[] swordNames = {"Machete's Blade", "Death Bane","Crystal Abyss","Stick of Truth","HellRaiser","Wooden Sword"};
    private String[] shieldNames = {"Sentinel","Skull Basher","Bone Shield","Death's Shield","BladeGuard","Brown Shield"};
    private Random   random;
    private int      value;

    public Item getItem(ItemType type){
        switch (type){
            case SHIELD: value = getValue(MAX_VALUE);
                         return new Shield(shieldNames[getIndex()], value, value*2,value/2);

            case SWORD: value = getValue(MAX_VALUE);
                        return new Sword(swordNames[getIndex()], value, value*3,value/3);

            case ATTACK_POTION: value = getValue(POTION_QUANTITY);
                        return new AttackPotion(getClass().toString(),value*2,1,value);

            case EXP_POTION: value = getValue(POTION_QUANTITY);
                        return new ExperiencePotion(getClass().toString(),value*2,1,value);

            default:return null;
        }
    }

    //Returns random int(value), used to calculate damage price weight and defense
    private int getValue(int value){
        random = new Random();
        return random.nextInt(value - MIN_VALUE) +1 + MIN_VALUE;
    }

    //returns random index from the names arrays
    private int getIndex(){
        random = new Random();
        return random.nextInt(shieldNames.length);
    }

    public ArrayList<Item> generateItems(){
        ArrayList<Item> items= new ArrayList<>();
        items.add(getItem(ItemType.SHIELD));
        items.add(getItem(ItemType.SWORD));
        items.add(getItem(ItemType.EXP_POTION));

        return items;
    }

}
