package HeroesTelerik;

import HeroesTelerik.Creatures.Gremlin;
import HeroesTelerik.Creatures.Griffon;
import HeroesTelerik.Creatures.Pegasus;
import HeroesTelerik.Creatures.Skeleton;
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
        heroArmy.addSlot1(new Gremlin(), 10);
        heroArmy.addSlot2(new Pegasus(), 15);
        heroArmy.addSlot3(new Griffon(), 5);

        heroArmy.showWholeArmy();


    }
}
