package HeroesTelerik.MainHero;

import HeroesTelerik.Items.*;
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
            System.out.println("    ,` -.)                            LEVEL: " + hero.getLevel());
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

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {

            System.out.println("\n\n\n\n");
            System.out.println("********************************************");
            System.out.println("********************************************");
            System.out.println("                Items\n");

            int count = 1;

            for (Item a :
                    hero.items) {


                System.out.println(count + ". " + a.getItemName() + " " + showProperty(a));
                count++;
            }


            System.out.println("(e) for exit");
            System.out.print("Please enter what would you like to equip or use:");
            char choice;

            String S = br.readLine();                               // check if its empty string
            if (S.equals("") || S.length() > 1) {
                continue;
            }
            choice = S.charAt(0);

            switch (choice) {
                case '1':

                    equipItem(hero.items.get(0), hero);
                    hero.items.remove(0);
                    continue;

                case '2':
                    equipItem(hero.items.get(1), hero);
                    hero.items.remove(1);
                    continue;

                case '3':
                    equipItem(hero.items.get(2), hero);
                    hero.items.remove(2);
                    continue;

                case '4':
                    equipItem(hero.items.get(3), hero);
                    hero.items.remove(3);
                    continue;

                case '5':
                    equipItem(hero.items.get(4), hero);
                    hero.items.remove(4);
                    continue;

                case '6':
                    equipItem(hero.items.get(5), hero);
                    hero.items.remove(5);
                    continue;

                case '7':
                    equipItem(hero.items.get(6), hero);
                    hero.items.remove(6);
                    continue;

                case '8':
                    equipItem(hero.items.get(7), hero);
                    hero.items.remove(7);
                    continue;

                case '9':
                    equipItem(hero.items.get(8), hero);
                    hero.items.remove(8);
                    continue;

                case 'e':
                    return;

            }


        }




    }

    private static void equipItem(Item item, Hero hero){

        System.out.println(item.getClass().getName());

        if(item.getClass().getSimpleName().equals("Shield")){
            Shield temp = (Shield) item;
            hero.items.add(hero.getShield());
            hero.setShield(temp);
            return;
        }

        if(item.getClass().getSimpleName().equals("Sword")){
            Sword temp = (Sword) item;
            hero.items.add(hero.getMainWeapon());
            hero.setMainWeapon(temp);
            return;
        }

        if(item.getClass().getSimpleName().equals("AttackPotion")){

            AttackPotion temp = (AttackPotion) item;
            temp.usePotion(hero);
            return;
        }

        if(item.getClass().getSimpleName().equals("ExperiencePotion")){

            ExperiencePotion temp = (ExperiencePotion) item;
            temp.usePotion(hero);
            return;
        }


    }

    public static int showProperty(Item item){

        if(item.getClass().getSimpleName().equals("Shield")){
            Shield temp = (Shield) item;
            return temp.getDefense();
        }

        if(item.getClass().getSimpleName().equals("Sword")){
            Sword temp = (Sword) item;
            return temp.getAttack();
        }

        if(item.getClass().getSimpleName().equals("AttackPotion")){

            AttackPotion temp = (AttackPotion) item;System.out.print(temp.getQuantity());
            return temp.getQuantity();
        }

        if(item.getClass().getSimpleName().equals("ExperiencePotion")){

            AttackPotion temp = (AttackPotion) item;
            return temp.getQuantity();
        }

        return 0;

    }



}


