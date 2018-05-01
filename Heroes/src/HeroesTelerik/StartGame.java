package HeroesTelerik;

import HeroesTelerik.Creatures.*;
import HeroesTelerik.MainHero.Hero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StartGame {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Hero Conan = new Hero("Conan");


        Army heroArmy = new Army();
        Conan.setArmy(heroArmy);
        heroArmy.addSlot1(new Skeleton(), 47);
        heroArmy.addSlot2(new Pegasus(), 30);
        heroArmy.addSlot3(new Dragon(), 7);

      //  heroArmy.showWholeArmy();
         Army enemyArmy = new Army();

         enemyArmy.addSlot1(new Centaur(), 55);
         enemyArmy.addSlot2(new Vampire(), 7);
         enemyArmy.addSlot3(new Nightmare(), 10);

         Map map = new Map();


         Menu.newGameScreen();
         Menu.mainMenuInitial();

         /*while(true) {

             map.printMap(Conan.getCoordinate().x, Conan.getCoordinate().y, heroArmy);
             System.out.println();
             System.out.println("M - Menu  E - Exit");
             System.out.print("Please enter a direction to move(w,a,s,d): ");
             char newDirection = br.readLine().charAt(0);


             if(newDirection == 'E'){
                 break;
             }

             if(newDirection == 'M'){
                 Menu.mainMenuInGame(Conan);
             }
             Conan.move(newDirection);

         }*/


         BattleScene.battleArmies(heroArmy, enemyArmy);

    }

}
