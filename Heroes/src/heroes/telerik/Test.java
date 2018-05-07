package heroes.telerik;

import heroes.telerik.items.RandomItemsFactory;
import heroes.telerik.structures.Village;
import heroes.telerik.items.Item;

/**
 * Created by Joro on 02/05/2018
 *          fix random Id bug
 *          items after battle
 *          implement consumePotion
 *          remove potion after consumption
 *          fix wearable interface
 */
public class Test {

    public static void main(String[] args) {

        RandomItemsFactory itemsFactory = new RandomItemsFactory();
        Item Item = itemsFactory.getItem(ItemType.SHIELD);
        System.out.println(itemsFactory.getItem(ItemType.ATTACK_POTION));
        System.out.println(itemsFactory.getItem(ItemType.SHIELD));
        Army army = new Army();
        Army armyGen = ArmyGenerator.generateArmy('A');
        try {

            Village selo = new Village(new Coordinate(5, 5), "selo", armyGen);
        }catch(EmptyArmyException ex){System.out.println(ex);
        }

        //System.out.println(new RandomItemsFactory().generateItems().toString());

    }
}