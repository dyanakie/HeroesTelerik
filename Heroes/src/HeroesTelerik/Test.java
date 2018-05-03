package HeroesTelerik;

import HeroesTelerik.Items.*;

/**
 * Created by Joro on 02/05/2018
 *          implement comparable
 *          move potion size to enum?
 *          exception  custom class
 *          fix random Id bug
 *          move Factory names to Enum
 *          add item name toString()
 */
public class Test {

    public static void main(String[] args) {
        Sword s = new Sword("s",5,5,5);
        System.out.println(s);
        System.out.print(s.getItemId());

        Shield shield = new Shield("shield",10,10,3);
        System.out.println(shield);
        System.out.println(shield.getItemId());

        System.out.println(new AttackPotion("aatck",5,5,5));

        ExperiencePotion potion = new ExperiencePotion("health",12,1,5);
        System.out.println(potion.isConsumed());

        RandomItemsFactory itemsFactory= new RandomItemsFactory();
        System.out.println(itemsFactory.getItem(ItemType.ATTACK_POTION));
        System.out.println(itemsFactory.getItem(ItemType.SHIELD));

    }
}