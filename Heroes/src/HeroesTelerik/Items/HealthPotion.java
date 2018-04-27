package HeroesTelerik.Items;

/**
 * Created by Joro on 27/04/2018
 */
public class HealthPotion extends Potion implements Consumable{

    public HealthPotion(String name,int health, int price, double weight){
        this.setItemName(name);
        this.setHealth(health);
        this.setPrice(price);
        this.setWeight(weight);
    }


}
