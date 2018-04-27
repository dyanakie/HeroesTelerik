package HeroesTelerik.Items;

/**
 * Created by Joro on 27/04/2018
 */
public class Sword extends OffensiveItem implements Wearable{

    public Sword(String name,int damage, int price, double weight)
    {
        super();
        this.setItemName(name);
        this.setDamage(damage);
        this.setPrice(price);
        this.setWeight(weight);
    }

    public void equipItem(){

    }

    public void dropItem(){

    }
}
