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
       //  Army enemyArmy = Generator.Generate_Army('V');


         Map map = new Map();


         Menu.newGameScreen();
         Menu.mainMenuInitial();

         while(true) {

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

             if(Map.map[Conan.getCoordinate().x][Conan.getCoordinate().y] == 'V'){
                 Army enemyArmy = Generator.Generate_Army('V');
                 System.out.println("\n\n\n\n You enter an Enemy Village and you are ATTACKED!");
                 BattleScene.battleArmies(heroArmy, enemyArmy, Conan);
                 int loot = Generator.generateLoot('V');
                 System.out.println("\n\n You gain: " + loot + " loot from the village ruins!");
                 Conan.setGold(Conan.getGold()+loot);

                 Map.map[Conan.getCoordinate().x][Conan.getCoordinate().y] = ' ';
                 continue;
             }

             if(Map.map[Conan.getCoordinate().x][Conan.getCoordinate().y] == 'A'){
                 Army enemyArmy = Generator.Generate_Army('A');
                 System.out.println("\n\n\n\n You enter an Enemy Stronghold and you are ATTACKED!");
                 BattleScene.battleArmies(heroArmy, enemyArmy, Conan);
                 int loot = Generator.generateLoot('A');
                 System.out.println("\n\n You gain: " + loot + " loot from the cave ruins!");
                 Conan.setGold(Conan.getGold()+loot);

                 Map.map[Conan.getCoordinate().x][Conan.getCoordinate().y] = ' ';
                 continue;
             }

             if(Map.map[Conan.getCoordinate().x][Conan.getCoordinate().y] == 'C') {
                 Army enemyArmy = Generator.Generate_Army('C');
                 System.out.println("\n\n\n\n You enter an Enemy Stronghold and you are ATTACKED!");
                 BattleScene.battleArmies(heroArmy, enemyArmy, Conan);

                 credits();
                 Menu.mainMenuInitial();
             }

         }


    }


    public void finalBattle() throws IOException{

        System.out.println("********************************************");
        System.out.println("********************************************");
        System.out.println("        YOU REACH THE CASTLE OF THE EVIL QUEEN BEVMORDA ");
        System.out.println("                  P        ");
        System.out.println("               P /\\  P     You can see her powerful army");
        System.out.println("              /\\|  |/\\    coming out of the ramparts to greet you.");
        System.out.println("           [] ||_/\\_|| []    Her evil laugh echoes over the huge towers.");
        System.out.println("           ||_||____||_||       The final battle begins!");
        System.out.println("           ||____[]____||        ");
        System.out.println("           {::     \\__    }");
        System.out.println("       ___  \\v:    .'\"  _V ___");
        System.out.println("      (      \\_      __/  --  )_");
        System.out.println("     (__---    |::\\ :/  ---     )");
        System.out.println("        (       \\::\\/  ----- ___)");
        System.out.println("         (______  \\/     _____)");

        Menu.pressKey();

    }

    public static void credits() throws IOException{

        System.out.println("********************************************");
        System.out.println("********************************************");
        System.out.println("             CONGRATULATIONS \n");
        System.out.println("You have defeated the evil queen and restored Doncho's laptop!");
        System.out.println("You are hero of the land of Telerik !");
        System.out.println("Thank you for participating in this wonderful adventure");
        System.out.println("\n\n\n this game was made possible thanks to Drago, Joro and Misho");


        Menu.pressKey();

    }

}
