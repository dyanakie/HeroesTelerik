package HeroesTelerik.Items;

import HeroesTelerik.MainHero.Hero;

/**
 * Created by Joro on 30/04/2018
 */
public class ExperiencePotion extends Potion {

    public ExperiencePotion(String name, int price, double weight, int quantity){
        super();
        this.setQuantity(quantity);
        this.setItemName(name);
        this.setPrice(price);
        this.setWeight(weight);
    }

    @Override
    public void usePotion(Hero hero){
        //hero.setExperience(hero.Experience()+ quantity);
    }
    @Override
    public String toString() {
        return String.format("Potion: %s, Bonus: %d, Price: %d",getClass().getSimpleName(),getQuantity(),getPrice());
    }
}
