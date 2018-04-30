package HeroesTelerik.Items;

/**
 * Created by Joro on 27/04/2018
 */
public abstract class OffensiveItem extends Item implements Wearable{
    int damage;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

}
