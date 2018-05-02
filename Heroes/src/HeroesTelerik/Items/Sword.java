package HeroesTelerik.Items;

/**
 * Created by Joro on 27/04/2018
 */
public class Sword extends MeleeWeapon{

    public Sword(String name,int damage, int price, double weight) {
        this.setItemName(name);
        this.setAttack(damage);
        this.setPrice(price);
        this.setWeight(weight);
    }

    @Override
    public String toString() {
        return String.format("Weapon: %s, Damage: %d, Price: %d",getClass().getSimpleName(), getAttack(),getPrice());
    }

}
