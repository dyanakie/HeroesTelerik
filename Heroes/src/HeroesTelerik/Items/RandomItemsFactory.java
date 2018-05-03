package HeroesTelerik.Items;

import HeroesTelerik.ItemType;
import java.util.Random;

/**
 * Created by Joro on 03/05/2018
 *  add constraints to min max values; add random weight?;
 *
 * NOTE: length of both Strings[] much match
 */
public class RandomItemsFactory {
    private final int MIN_VALUE = 1;
    private final int MAX_VALUE = 15;
    private final int MAX_PRICE = 50;
    private String[] swordNames = {"Machete's Blade", "Death Bane","Crystal Abyss","Stick of Truth","HellRaiser","Wooden Sword"};
    private String[] shieldNames = {"Sentinel","Skull Basher","Bone Shield","Death's Shield","BladeGuard","Brown Shield"};
    private Random   random;

    public Item getItem(ItemType type){
        switch (type){
            case SHIELD:return new Shield(shieldNames[getIndex()], getValue(MAX_VALUE), getValue(MAX_PRICE),15);
                //break;
            case SWORD:return new Sword(swordNames[getIndex()], getValue(MAX_VALUE), getValue(MAX_PRICE),10);
                //break;
            case ATTACK_POTION:return new AttackPotion(getClass().toString(),getValue(MAX_PRICE),1,10);
                //break;
            default:return null;
                //break;
        }
    }

    //Returns random int to be used as value for damage or defense
    private int getValue(int value){
        random = new Random();
        return random.nextInt(value - MIN_VALUE) +1 + MIN_VALUE;
    }

    //returns random index from the names arrays
    private int getIndex(){
        random = new Random();
        return random.nextInt(shieldNames.length);
    }

}
