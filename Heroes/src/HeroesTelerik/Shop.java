package HeroesTelerik;

import HeroesTelerik.MainHero.Hero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shop {


    public static void menu(Hero hero) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char choice = ' ';

        while(true) {

            System.out.println("********************************************");
            System.out.println("********************************************");
            System.out.println("              THE SHOP");
            System.out.println();
            System.out.println("      `'::::.                 Your Gold: " + hero.getGold());
            System.out.println("        _____A_                       ");
            System.out.println("       /      /\\                 1. Buy Forces    ");
            System.out.println("    __/__/\\__/  \\___              2. Return");
            System.out.println("---/__|\" '' \"| /___/\\----");
            System.out.println("   |''|\"'||'\"| |' '||");
            System.out.println("   `\"\"`\"\"))\"\"`\"`\"\"\"\"`");

            System.out.println();
            System.out.print("Please enter your choice: ");
            choice = br.readLine().charAt(0);

            switch (choice) {
                case '1':
                    Shop.hireForces(hero);
                    continue;

                case '2':
                    return;

                default:
                    System.out.println("Please enter valid choice!");

            }
        }

    }

    public static void hireForces(Hero hero) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {

            System.out.println("********************************************");
            System.out.println("********************************************");
            System.out.println(" You have: " + hero.getGold() + " gold");
            System.out.println();
            System.out.println(" 1. Gremlin 50g          2. Skeleton 50g         3. Centaur 50g");
            System.out.println(" 4. Vampire 200g         5. Pegasus 200g         6. Griffon 200g");
            System.out.println(" 7. Dragon 300g          8. Nightmare 300g       9. Hydra 300g");
            System.out.println();
            System.out.println("E - Exit");
            System.out.println("What would you like to buy: ");
            char choice = ' ';

            choice = br.readLine().charAt(0);

            switch (choice) {
                case 'E':
                    return;

                case '1':
                    if(hero.getGold() < 50 || checkCreature(hero, "Gremlin") == 0){                  // Checks if there is an empty slot or slot with such creature
                        System.out.println("Not enough gold or Not enough space !");                          // and if there is adds one of that type
                        continue;                                                                             // !to add later special case when its empty
                    }else{
                        hero.army.addCreature(checkCreature(hero, "Gremlin"));
                        hero.setGold(hero.getGold()-50);

                    }
                    continue;

                case '2':
                    if(hero.getGold() < 50 || checkCreature(hero, "Skeleton") == 0){
                        System.out.println("Not enough gold or Not enough space !");
                        continue;
                    }else{
                        hero.army.addCreature(checkCreature(hero, "Skeleton"));
                        hero.setGold(hero.getGold()-50);

                    }
                    continue;
                case '3':
                    if(hero.getGold() < 50 || checkCreature(hero, "Centaur") == 0){
                        System.out.println("Not enough gold or Not enough space !");
                        continue;
                    }else{
                        hero.army.addCreature(checkCreature(hero, "Centaur"));
                        hero.setGold(hero.getGold()-50);

                    }
                    continue;
                case '4':
                    if(hero.getGold() < 200 || checkCreature(hero, "Vampire") == 0){
                        System.out.println("Not enough gold or Not enough space !");
                        continue;
                    }else{
                        hero.army.addCreature(checkCreature(hero, "Vampire"));
                        hero.setGold(hero.getGold()-200);

                    }
                    continue;

                case '5':
                    if(hero.getGold() < 200 || checkCreature(hero, "Pegasus") == 0){
                        System.out.println("Not enough gold or Not enough space !");
                        continue;
                    }else{
                        hero.army.addCreature(checkCreature(hero, "Pegasus"));
                        hero.setGold(hero.getGold()-200);

                    }
                    continue;
                case '6':
                    if(hero.getGold() < 200 || checkCreature(hero, "Griffon") == 0){
                        System.out.println("Not enough gold or Not enough space !");
                        continue;
                    }else{
                        hero.army.addCreature(checkCreature(hero, "Griffon"));
                        hero.setGold(hero.getGold()-200);

                    }
                    continue;

                case '7':
                    if(hero.getGold() < 300 || checkCreature(hero, "Dragon") == 0){
                        System.out.println("Not enough gold or Not enough space !");
                        continue;
                    }else{
                        hero.army.addCreature(checkCreature(hero, "Dragon"));
                        hero.setGold(hero.getGold()-300);

                    }
                    continue;

                case '8':
                    if(hero.getGold() < 300 || checkCreature(hero, "Nightmare") == 0){
                        System.out.println("Not enough gold or Not enough space !");
                        continue;
                    }else{
                        hero.army.addCreature(checkCreature(hero, "Nightmare"));
                        hero.setGold(hero.getGold()-300);

                    }
                    continue;
                case '9':
                    if(hero.getGold() < 300 || checkCreature(hero, "Hydra") == 0){
                        System.out.println("Not enough gold or Not enough space !");
                        continue;
                    }else{
                        hero.army.addCreature(checkCreature(hero, "Hydra"));
                        hero.setGold(hero.getGold()-300);

                    }
                    continue;


                default:
                    System.out.println("Please enter valid choice!");

            }
        }

    }

    public static int checkCreature(Hero hero, String creature){

        switch (creature){

            case "Gremlin":
                return hero.army.checkSlotType("Gremlin");
            case "Skeleton":
                return hero.army.checkSlotType("Skeleton");
            case "Centaur":
                return hero.army.checkSlotType("Centaur");
            case "Vampire":
                return hero.army.checkSlotType("Vampire");
            case "Pegasus":
                return hero.army.checkSlotType("Pegasus");
            case "Griffon":
                return hero.army.checkSlotType("Griffon");
            case "Dragon":
                return hero.army.checkSlotType("Dragon");
            case "Hydra":
                return hero.army.checkSlotType("Hydra");
            case "Nightmare":
                return hero.army.checkSlotType("Nightmare");

        }

        return 0;
    }
}
