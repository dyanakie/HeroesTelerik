package HeroesTelerik.Items;

import HeroesTelerik.MainHero.Hero;

/**
 * Created by Joro on 27/04/2018
 */
public abstract class Potion extends Item implements Consumable{
    int quantity;

    public Potion(){

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract void usePotion(Hero hero);
}
