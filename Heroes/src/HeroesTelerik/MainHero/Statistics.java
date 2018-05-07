package HeroesTelerik.MainHero;

import HeroesTelerik.Items.Item;
import HeroesTelerik.Items.Shield;
import HeroesTelerik.Items.Sword;
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


    private static void seeItems(Hero hero) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
        System.out.println("\n\n\n\n");
        System.out.println("********************************************");
        System.out.println("********************************************");
        System.out.println("                Items\n");

        int count = 1;

        for (Item a :
                hero.items) {

            System.out.println(count + ". " + a.getItemName() + " ");
            count++;
        }



            System.out.println("\nexit(e)");
            System.out.println("Press 1 to see shields");
            System.out.println("Press 2 to see swords");
            System.out.print("Enter your choice: ");
            char choice;

            String S = br.readLine();                               // check if its empty string
            if (S.equals("") || S.length() > 1) {
                continue;
            }
            choice = S.charAt(0);

            switch (choice) {
                case '1':
                    seeShields(hero);
                    continue;

                case '2':
                    seeSwords(hero);
                    continue;
                case 'e':
                    return;



            }
        }



    }

    private static void seeShields(Hero hero) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
        System.out.println("\n\n\n\n");
        System.out.println("********************************************");
        System.out.println("********************************************");
        System.out.println("                Shields\n");

        int count = 1;

        for (Shield a :
                hero.shields) {

            System.out.println(count + ". " + a.getItemName() + " " + a.getDefense() + " defense");
            count++;
        }


            System.out.println("\nexit(e)");
            System.out.println("Which shield would you like to equip:");
            System.out.print("Enter your choice: ");
            char choice;

            String S = br.readLine();                               // check if its empty string
            if (S.equals("") || S.length() > 1) {
                continue;
            }
            choice = S.charAt(0);

            switch (choice) {
                case '1':
                    hero.setShield(hero.shields.get(0));
                    hero.shields.remove(0);
                    continue;

                case '2':
                    hero.setShield(hero.shields.get(1));
                    hero.shields.remove(1);
                    continue;

                case '3':
                    hero.setShield(hero.shields.get(2));
                    hero.shields.remove(2);
                    continue;

                case '4':
                    hero.setShield(hero.shields.get(3));
                    hero.shields.remove(3);
                    continue;

                case '5':
                    hero.setShield(hero.shields.get(4));
                    hero.shields.remove(4);
                    continue;

                case '6':
                    hero.setShield(hero.shields.get(5));
                    hero.shields.remove(5);
                    continue;

                case '7':
                    hero.setShield(hero.shields.get(6));
                    hero.shields.remove(6);
                    continue;
                case '8':
                    hero.setShield(hero.shields.get(7));
                    hero.shields.remove(7);
                    continue;

                case '9':
                    hero.setShield(hero.shields.get(8));
                    hero.shields.remove(8);
                    continue;

                case 'e':
                    return;


            }
        }







    }

    private static void seeSwords(Hero hero) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){

        System.out.println("\n\n\n\n");
        System.out.println("********************************************");
        System.out.println("********************************************");
        System.out.println("                Swords\n");

        int count = 1;

        for (Sword a :
                hero.swords) {

            System.out.println(count + ". " + a.getItemName() + " " + a.getAttack() + " attack");
            count++;
        }



            System.out.println("\nexit(e)");
            System.out.println("Which sword would you like to equip:");
            System.out.print("Enter your choice: ");
            char choice;

            String S = br.readLine();                               // check if its empty string
            if (S.equals("") || S.length() > 1) {
                continue;
            }
            choice = S.charAt(0);

            switch (choice) {
                case '1':
                    hero.setMainWeapon(hero.swords.get(0));
                    hero.swords.remove(0);
                    continue;

                case '2':
                    hero.setMainWeapon(hero.swords.get(1));
                    hero.swords.remove(1);
                    continue;

                case '3':
                    hero.setMainWeapon(hero.swords.get(2));
                    hero.swords.remove(2);
                    continue;

                case '4':
                    hero.setMainWeapon(hero.swords.get(3));
                    hero.swords.remove(3);
                    continue;

                case '5':
                    hero.setMainWeapon(hero.swords.get(4));
                    hero.swords.remove(4);
                    continue;

                case '6':
                    hero.setMainWeapon(hero.swords.get(5));
                    hero.swords.remove(5);
                    continue;

                case '7':
                    hero.setMainWeapon(hero.swords.get(6));
                    hero.swords.remove(6);
                    continue;
                case '8':
                    hero.setMainWeapon(hero.swords.get(7));
                    hero.swords.remove(7);
                    continue;

                case '9':
                    hero.setMainWeapon(hero.swords.get(8));
                    hero.swords.remove(8);
                    continue;

                case 'e':
                    return;


            }
        }


    }



}


