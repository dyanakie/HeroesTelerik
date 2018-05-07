package HeroesTelerik;

import HeroesTelerik.Items.Item;
import HeroesTelerik.Items.RandomItemsFactory;
import HeroesTelerik.Items.Sword;
import HeroesTelerik.MainHero.Hero;
import HeroesTelerik.Structures.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartGame {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Hero Conan = new Hero("Conan");
        RandomItemsFactory randomItemsFactory = new RandomItemsFactory();
        Army heroArmy = ArmyGenerator.generateArmy('V');
        Conan.setArmy(heroArmy);

        Map map = new Map();
        /*
        Shop.shopItems.add(new Sword("Fire Brand", 20, 700, 2.5));
        Shop.shopItems.add(new Shield("Shield of Thor", 20, 700, 5));
        Shop.shopItems.add(new Sword("Sword of Song", 40, 3000, 10));
        Shop.shopItems.add(new Shield("Shield of Thor", 40, 3000, 20));
        Shop.shopItems.add(new AttackPotion("Attack Potion", 500, 10, 1));
        */
        Shop.shopItems.add(randomItemsFactory.getItem(ItemType.SWORD));
        Shop.shopItems.add(randomItemsFactory.getItem(ItemType.SWORD));
        Shop.shopItems.add(randomItemsFactory.getItem(ItemType.SWORD));
        Shop.shopItems.add(randomItemsFactory.getItem(ItemType.SHIELD));
        Shop.shopItems.add(randomItemsFactory.getItem(ItemType.SHIELD));
        Shop.shopItems.add(randomItemsFactory.getItem(ItemType.SHIELD));
        Shop.shopItems.add(new Sword("Sword of Song", 40, 3000, 10));
        Shop.shopItems.add(randomItemsFactory.getItem(ItemType.ATTACK_POTION));
        Shop.shopItems.add(randomItemsFactory.getItem(ItemType.EXP_POTION));


         Menu.newGameScreen();
         Menu.mainMenuInitial();

         while(true) {
             System.out.println("\n\n");

             map.printMap(Conan.getCoordinate().x, Conan.getCoordinate().y, heroArmy, Conan);
             System.out.println();
             System.out.println("m - Menu  e - Exit");
             System.out.print("Please enter a direction to move(w,a,s,d): ");

             String S = br.readLine();                               // check if its empty string
             if(S.equals("")){
                 continue;
             }

             char newDirection = S.charAt(0);

             if(newDirection == 'e'){
                 break;
             }

             if(newDirection == 'm'){
                 Menu.mainMenuInGame(Conan);
             }
             Conan.move(newDirection);

             if(Map.map[Conan.getCoordinate().x][Conan.getCoordinate().y] == 'V'){
                 Village village = new Village();
                 Army enemyArmy = village.getArmy();
                 System.out.println("\n\n\n\n You enter an Enemy Village and you are ATTACKED!");
                 BattleScene.battleArmies(heroArmy, enemyArmy, Conan);
                 int loot = village.getLoot();
                 System.out.println("\n\n You gain: " + loot + " loot from the village ruins!");
                 Conan.setGold(Conan.getGold()+loot);
                 int temp = ExperienceGenerator.generateExp('V');
                 Conan.setExperience(Conan.getExperience()+temp);
                 Item new_Item = randomItemsFactory.getItem(ItemType.SHIELD);
                 Conan.addItems(new_Item);
                 System.out.println("You have found a beautiful Shield called " + new_Item.getItemName());
                 System.out.println("You have gained " + temp + " experience!");

                 Map.map[Conan.getCoordinate().x][Conan.getCoordinate().y] = ' ';
                 continue;
             }

             if(Map.map[Conan.getCoordinate().x][Conan.getCoordinate().y] == 'A'){
                 Stronghold strongHold = new Stronghold();

                 Army enemyArmy = strongHold.getArmy();
                 System.out.println("\n\n\n\n You enter an Enemy Stronghold and you are ATTACKED!");
                 BattleScene.battleArmies(heroArmy, enemyArmy, Conan);
                 int loot = strongHold.getLoot();
                 System.out.println("\n\n You gain: " + loot + " loot from the cave ruins!");
                 Conan.setGold(Conan.getGold()+loot);
                 int temp = ExperienceGenerator.generateExp('A');
                 Conan.setExperience(Conan.getExperience()+temp);
                 Item newItem = randomItemsFactory.getItem(ItemType.SWORD);
                 Conan.addItems(newItem);
                 System.out.println("You have found a beautiful sword called " + newItem.getItemName());
                 System.out.println("You have gained " + temp + " experience!");

                 Map.map[Conan.getCoordinate().x][Conan.getCoordinate().y] = ' ';
                 continue;
             }

             if(Map.map[Conan.getCoordinate().x][Conan.getCoordinate().y] == 'C') {
                 Castle castle = new Castle();
                 Army enemyArmy = castle.getArmy();
                 finalBattle();
                 BattleScene.battleArmies(heroArmy, enemyArmy, Conan);

                 credits();
                 Conan.setCoordinate(new Coordinate(1,1));
                 Menu.mainMenuInitial();
             }

         }
    }

    private static void finalBattle() throws IOException{

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

    private static void credits() throws IOException{

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
