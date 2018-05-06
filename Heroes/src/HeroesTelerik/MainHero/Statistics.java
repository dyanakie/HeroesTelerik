package HeroesTelerik.MainHero;

import HeroesTelerik.Items.Item;
import HeroesTelerik.Menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Statistics {

    public static void heroStats(Hero hero) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            System.out.println("********************************************");
            System.out.println("********************************************");
            System.out.println();

            System.out.println("      _,.                             NAME: " + hero.getName());
            System.out.println("    ,` -.)");
            System.out.println("   ( _/-\\\\-._");
            System.out.println("  /,|`--._,-^|            ,           CLASS:    " + hero.getHeroClass());
            System.out.println("  \\_| |`-._/||          ,'|           ATTACK:    " + hero.getTotalAttack());
            System.out.println("    |  `-, / |         /  /           DEFENSE:   " + hero.getTotalDefence());
            System.out.println("    |     || |        /  /            GOLD:      " + hero.getGold());
            System.out.println("     `r-._||/   __   /  /");
            System.out.println(" __,-<_     )`-/  `./  /              BATTLES:   ");
            System.out.println("'  \\   `---'   \\   /  /");
            System.out.println("    |           |./  /                EQUIPED SWORD: " + hero.getMainWeapon().getItemName() + " damage: " + hero.getMainWeapon().getAttack());
            System.out.println("    /           //  /   ");
            System.out.println("\\_/' \\         |/  /");
            System.out.println(" |    |   _,^-'/  /                   EQUIPRED SHIELD: " + hero.getShield().getItemName() + " defense: " + hero.getShield().getDefense());
            System.out.println(" |    , ``  (\\/  /_  ");
            System.out.println("  \\,.->._    \\X-=/^");
            System.out.println("  (  /   `-._//^`                     1. See/Equip Items");
            System.out.println("   `Y-.____(__}                       2. Exit");
            System.out.println("    |     {__) ");
            System.out.println("          ()");

            System.out.print("Please enter your choice:");
            char choice;

            String S = br.readLine();                               // check if its empty string
            if (S.equals("") || S.length() > 1) {
                continue;
            }
            choice = S.charAt(0);

            switch (choice) {
                case '1':
                    seeItems(hero);
                    continue;

                case '2':
                    return;


            }

        }

    }


    private static void seeItems(Hero hero) throws IOException{

        System.out.println("\n\n\n\n");
        System.out.println("********************************************");
        System.out.println("********************************************");
        System.out.println("                Items\n");

        int count = 1;

        for (Item a:
            hero.items ) {

            System.out.println(count + ". " + a.getItemName() + " ");
        }

        Menu.pressKey();



    }



}


