package HeroesTelerik.Items;

/**
 * Created by Joro on 30/04/2018
 */
public class Bow extends RangeWeapon {

    public Bow(String name,int damage, int price, double weight)
    {
        super();
        this.setItemName(name);
        this.setDamage(damage);
        this.setPrice(price);
        this.setWeight(weight);
    }

    @Override
    public String toString() {
        return String.format("Weapon: %s, Damage: %d, Price: %d",getClass().getSimpleName(),getDamage(),getPrice());
    }
}
