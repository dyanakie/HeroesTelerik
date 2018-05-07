package heroes.telerik;

import heroes.telerik.main.hero.Hero;

import java.util.Random;

public class Map {

    public static char[][] map;
    public static int turns = 0;


    public Map(){
        map = new char[][]{{'^', '^', '^','^', '^', '^', '^', '^', '^', '^'},
                          {'^', ' ', '#','#', '#', '#', '#', '#', '#', '^'},
                          {'^', ' ', '#','^', '^', '#', 'V', '#', 'C', '^'},
                          {'^', ' ', 'V','#', 'A', '#', ' ', '#', ' ', '^'},
                          {'^', ' ', ' ',' ', ' ', ' ', ' ', ' ', ' ', '^'},
                          {'^', ' ', ' ',' ', ' ', '#', ' ', ' ', '#', '^'},
                          {'^', ' ', ' ',' ', ' ', ' ', ' ', ' ', '#', '^'},
                          {'^', ' ', '#','^', '^', ' ', '#', ' ', ' ', 'A'},
                          {'A', ' ', 'V','^', '^', ' ', '#', 'V', '#', '^'},
                          {'^', ' ', '^','^', '^', 'V', '#', '^', '#', '^'}};
    }


    public void generateMap(){

        Random rand = new Random();



    }


    public void printMap(int x, int y, Army army, Hero hero){

        map[x][y] = 'H';

        System.out.println("               HEROES OF TELERIK            ");
        System.out.println("********************************************");
        System.out.printf("Player: Conan      Level %d        Gold: %d", hero.getLevel(), hero.getGold());
        System.out.println("\n********************************************");

        for(int i = 0; i < map.length; i++){
            for(int r = 0; r < map[i].length; r++){
                /*if(i == x && r == y){
                    System.out.print("H");
                    continue;
                }*/
                System.out.print(" " + map[i][r] + " ");
            }
            System.out.println();
        }

        map[x][y] = ' ';
        System.out.println("********************************************");
        System.out.println("ARMY:  |" + army.getSlot1numbers() + army.getSlotOneType() + "|" + army.getSlot2numbers()+army.getSlotTwoType() + "|" + army.getSlot3numbers()+army.getSlotThreeType() + "|");
        System.out.println("LEGEND  V - Village  A - Stronghold  C - Castle");
        System.out.println("        # - Forest   ^ - Mountain    H - Hero");
    }
}
