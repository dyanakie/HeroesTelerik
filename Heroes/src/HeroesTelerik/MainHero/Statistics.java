package HeroesTelerik.MainHero;

import HeroesTelerik.Menu;

import java.io.IOException;

public class Statistics {

    public static void heroStats(Hero hero)throws IOException{

        System.out.println("********************************************");
        System.out.println("********************************************");
        System.out.println();

        System.out.println("      _,.                             NAME: " + hero.getName());
        System.out.println("    ,` -.)");
        System.out.println("   ( _/-\\\\-._");
        System.out.println("  /,|`--._,-^|            ,           CLASS:    " + hero.getHeroClass());
        System.out.println("  \\_| |`-._/||          ,'|          ATTACK:    " + hero.getTotalAttack());
        System.out.println("    |  `-, / |         /  /           DEFENSE:   " + hero.getTotalDefence());
        System.out.println("    |     || |        /  /            GOLD:      " + hero.getGold());
        System.out.println("     `r-._||/   __   /  /");
        System.out.println(" __,-<_     )`-/  `./  /              BATTLES:   ");
        System.out.println("'  \\   `---'   \\   /  /");
        System.out.println("    |           |./  /                EQUIPED ITEMS: - "+hero.getShield());
        System.out.println("    /           //  /                                - ")/*+hero.getMainWeapon()*/;
        System.out.println("\\_/' \\         |/  /");
        System.out.println(" |    |   _,^-'/  /                   HERO BACKPACK: ");
        System.out.println(" |    , ``  (\\/  /_");
        System.out.println("  \\,.->._    \\X-=/^");
        System.out.println("  (  /   `-._//^`");
        System.out.println("   `Y-.____(__}");
        System.out.println("    |     {__)");
        System.out.println("          ()");

        Menu.pressKey();

    }
}
