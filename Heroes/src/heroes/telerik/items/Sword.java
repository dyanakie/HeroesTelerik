package heroes.telerik.items;

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
        return String.format("%s  Class: %s, Damage: %d, Price: %d",getItemName(), getClass().getSimpleName(), getAttack(),getPrice());
    }

}
