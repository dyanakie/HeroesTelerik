package HeroesTelerik.Items;

/**
 * Created by Joro on 27/04/2018
 */
public class Shield extends DefensiveItem {

    public Shield(String name, int defense, int price,double weight){
        this.setItemName(name);
        this.setDefense(defense);
        this.setPrice(price);
        this.setWeight(weight);

    }

    public void equipItem(){

    }

    public void dropItem(){

    }
}
