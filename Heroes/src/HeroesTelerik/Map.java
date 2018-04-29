package HeroesTelerik;

import java.util.Random;

public class Map {

    private char[][] map;
    public static int turns = 0;


    public Map(){
        map = new char[][]{{'^', '^', '^','^', '^', '^', '^', '^', '^', '^'},
                          {'^', ' ', '#','#', '#', '#', '#', '#', '#', '^'},
                          {'^', ' ', '#','^', '^', '#', 'V', '#', 'C', '^'},
                          {'^', ' ', 'V','#', '#', '#', ' ', '#', ' ', '^'},
                          {'^', ' ', ' ',' ', ' ', ' ', ' ', ' ', ' ', '^'},
                          {'^', ' ', ' ',' ', ' ', '#', ' ', ' ', '#', '^'},
                          {'^', ' ', ' ',' ', ' ', ' ', ' ', ' ', '#', '^'},
                          {'^', ' ', '#','^', '^', ' ', '#', ' ', '#', '^'},
                          {'^', ' ', 'V','^', '^', ' ', '#', 'V', '#', '^'},
                          {'^', ' ', '^','^', '^', 'V', '#', '^', '#', '^'}};
    }


    public void generateMap(){

        Random rand = new Random();



    }


    public void printMap(int x, int y, Army army){

        System.out.println("               HEROES OF TELERIK            ");
        System.out.println("********************************************");
        System.out.println("Player: Conan      Level 1        Turns: " + turns);
        System.out.println("********************************************");

        for(int i = 0; i < map.length; i++){
            for(int r = 0; r < map[i].length; r++){
                if(i == x && r == y){
                    System.out.print("H");
                    continue;
                }
                System.out.print(" " + map[i][r] + " ");
            }
            System.out.println();
        }
        System.out.println("********************************************");
        System.out.println("ARMY:  |" + army.getSlot1numbers() + army.getSlot1Type() + "|" + army.getSlot2numbers()+army.getSlot2Type() + "|" + army.getSlot3numbers()+army.getSlot3Type() + "|");
        System.out.println("x: " + x + " y: " + y);
    }
}