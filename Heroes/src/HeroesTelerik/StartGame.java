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
        heroArmy.addSlot1(new Gremlin(), 40);
        heroArmy.addSlot2(new Pegasus(), 30);
        heroArmy.addSlot3(new Griffon(), 10);

      //  heroArmy.showWholeArmy();
         Army enemyArmy = new Army();

         enemyArmy.addSlot1(new Centaur(), 55);
         enemyArmy.addSlot2(new Vampire(), 7);
         enemyArmy.addSlot3(new Dragon(), 5);

         Map map = new Map();

         map.printMap(Conan.getCoordinate().x, Conan.getCoordinate().y);

         Conan.move('w');

         map.printMap(Conan.getCoordinate().x, Conan.getCoordinate().y);


       //  BattleScene.battleArmies(heroArmy, enemyArmy);

    }

}
