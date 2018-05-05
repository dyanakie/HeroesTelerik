package HeroesTelerik;

import HeroesTelerik.Items.Item;
import HeroesTelerik.MainHero.Hero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Shop {

    public static List<Item> shopItems = new ArrayList<>();


    public static void menu(Hero hero) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char choice;

        while(true) {

            System.out.println("********************************************");
            System.out.println("********************************************");
            System.out.println("              THE SHOP");
            System.out.println();
            System.out.println("      `'::::.                 Your Gold: " + hero.getGold());
            System.out.println("        _____A_                       ");
            System.out.println("       /      /\\                 1. Buy Forces    ");
            System.out.println("    __/__/\\__/  \\___              2. Buy Items");
            System.out.println("---/__|\" '' \"| /___/\\----        3. Return");
            System.out.println("   |''|\"'||'\"| |' '||");
            System.out.println("   `\"\"`\"\"))\"\"`\"`\"\"\"\"`");

            System.out.println();
            System.out.print("Please enter your choice: ");

            String S = br.readLine();                               // check if its empty string
            if(S.equals("")){
                continue;
            }
            choice = S.charAt(0);

            switch (choice) {
                case '1':
                    Shop.hireForces(hero);
                    continue;

                case '2':
                    Shop.buyItems(hero);
                    continue;

                case '3':
                    return;

                default:
                    System.out.println("Please enter valid choice!");

            }
        }

    }

    private static void hireForces(Hero hero) throws IOException{

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
            System.out.println("e - Exit  a - Army Overview");
            System.out.println("What would you like to buy: ");
            char choice;

            String S = br.readLine();                               // check if its empty string
            if(S.equals("")){
                continue;
            }
            choice = S.charAt(0);

            switch (choice) {
                case 'e':
                    return;

                case '1':
                    if(hero.getGold() < 50 || checkCreature(hero, "Gremlin") == 0){                  // Checks if there is an empty slot or slot with such creature
                        System.out.println("Not enough gold or Not enough space !");                          // and if there is adds one of that type
                        continue;                                                                             // !to add later special case when its empty
                    }else{
                        hero.army.addCreature(checkCreature(hero, "Gremlin"), "Gremlin");
                        hero.setGold(hero.getGold()-50);

                    }
                    continue;

                case '2':
                    if(hero.getGold() < 50 || checkCreature(hero, "Skeleton") == 0){
                        System.out.println("Not enough gold or Not enough space !");
                        continue;
                    }else{
                        hero.army.addCreature(checkCreature(hero, "Skeleton"), "Skeleton");
                        hero.setGold(hero.getGold()-50);

                    }
                    continue;
                case '3':
                    if(hero.getGold() < 50 || checkCreature(hero, "Centaur") == 0){
                        System.out.println("Not enough gold or Not enough space !");
                        continue;
                    }else{
                        hero.army.addCreature(checkCreature(hero, "Centaur"), "Centaur");
                        hero.setGold(hero.getGold()-50);

                    }
                    continue;
                case '4':
                    if(hero.getGold() < 200 || checkCreature(hero, "Vampire") == 0){
                        System.out.println("Not enough gold or Not enough space !");
                        continue;
                    }else{
                        hero.army.addCreature(checkCreature(hero, "Vampire"), "Vampire");
                        hero.setGold(hero.getGold()-200);

                    }
                    continue;

                case '5':
                    if(hero.getGold() < 200 || checkCreature(hero, "Pegasus") == 0){
                        System.out.println("Not enough gold or Not enough space !");
                        continue;
                    }else{
                        hero.army.addCreature(checkCreature(hero, "Pegasus"), "Pegasus");
                        hero.setGold(hero.getGold()-200);

                    }
                    continue;
                case '6':
                    if(hero.getGold() < 200 || checkCreature(hero, "Griffon") == 0){
                        System.out.println("Not enough gold or Not enough space !");
                        continue;
                    }else{
                        hero.army.addCreature(checkCreature(hero, "Griffon"), "Griffon");
                        hero.setGold(hero.getGold()-200);

                    }
                    continue;

                case '7':

                    if(hero.getGold() < 300 || checkCreature(hero, "Dragon") == 0){
                        System.out.println("Not enough gold or Not enough space !");
                        continue;
                    }else{
                        hero.army.addCreature(checkCreature(hero, "Dragon"), "Dragon");
                        hero.setGold(hero.getGold()-300);

                    }
                    continue;

                case '8':
                    if(hero.getGold() < 300 || checkCreature(hero, "Nightmare") == 0){
                        System.out.println("Not enough gold or Not enough space !");
                        continue;
                    }else{
                        hero.army.addCreature(checkCreature(hero, "Nightmare"), "Nightmare");
                        hero.setGold(hero.getGold()-300);

                    }
                    continue;
                case '9':
                    if(hero.getGold() < 300 || checkCreature(hero, "Hydra") == 0){
                        System.out.println("Not enough gold or Not enough space !");
                        continue;
                    }else{
                        hero.army.addCreature(checkCreature(hero, "Hydra"), "Hydra");
                        hero.setGold(hero.getGold()-300);

                    }
                    continue;

                case 'a':
                    ArmyDetails.showForces(hero);
                    continue;



                default:
                    System.out.println("Please enter valid choice!");

            }
        }

    }

    private static void buyItems(Hero hero) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {

            System.out.println("********************************************");
            System.out.println("********************************************");
            System.out.println(" You have: " + hero.getGold() + " gold");
            System.out.println();
            int count = 1;
            for (Item A:
                 Shop.shopItems) {
                System.out.println(count + ". " + A.toString());
                count++;
            }
            System.out.println();
            System.out.println("e - Exit  a - Army Overview");
            System.out.println("What would you like to buy: ");
            char choice;

            String S = br.readLine();                               // check if its empty string
            if(S.equals("") || S.length() > 1){
                continue;
            }
            choice = S.charAt(0);

            if(Character.isDigit(S.charAt(0))) {
                if (shopItems.size() < Integer.parseInt(S)) {
                    System.out.println("No such item!");
                    continue;
                }
            }

            switch (choice) {

                case 'e':
                    return;

                case '1':
                    if(hero.getGold() < shopItems.get(0).getPrice() ){                  // Checks if there is an empty slot or slot with such creature
                        System.out.println("Not enough gold");                          // and if there is adds one of that type
                        continue;                                                                             // !to add later special case when its empty
                    }else{
                        hero.addItems(shopItems.get(0));
                        hero.setGold(hero.getGold()-shopItems.get(0).getPrice());
                        shopItems.remove(0);
                        continue;

                    }

                case '2':
                    if(hero.getGold() < shopItems.get(1).getPrice() ){
                        System.out.println("Not enough gold");
                        continue;
                    }else{
                        hero.addItems(shopItems.get(1));
                        hero.setGold(hero.getGold()-shopItems.get(1).getPrice());
                        shopItems.remove(1);
                        continue;

                    }

                case '3':
                    if(hero.getGold() < shopItems.get(2).getPrice() ){
                        System.out.println("Not enough gold");
                        continue;
                    }else{
                        hero.addItems(shopItems.get(2));
                        hero.setGold(hero.getGold()-shopItems.get(2).getPrice());
                        shopItems.remove(2);
                        continue;

                    }
                case '4':
                    if(hero.getGold() < shopItems.get(3).getPrice() ){
                        System.out.println("Not enough gold");
                        continue;
                    }else{
                        hero.addItems(shopItems.get(3));
                        hero.setGold(hero.getGold()-shopItems.get(3).getPrice());
                        shopItems.remove(3);
                        continue;

                    }

                case '5':
                    if(hero.getGold() < shopItems.get(4).getPrice() ){
                        System.out.println("Not enough gold");
                        continue;
                    }else{
                        hero.addItems(shopItems.get(4));
                        hero.setGold(hero.getGold()-shopItems.get(4).getPrice());
                        shopItems.remove(4);
                        continue;

                    }
                case '6':
                    if(hero.getGold() < shopItems.get(5).getPrice() ){
                        System.out.println("Not enough gold");
                        continue;
                    }else{
                        hero.addItems(shopItems.get(5));
                        hero.setGold(hero.getGold()-shopItems.get(5).getPrice());
                        shopItems.remove(5);
                        continue;

                    }

                case '7':

                    if(hero.getGold() < shopItems.get(6).getPrice() ){
                        System.out.println("Not enough gold");
                        continue;
                    }else{
                        hero.addItems(shopItems.get(6));
                        hero.setGold(hero.getGold()-shopItems.get(6).getPrice());
                        shopItems.remove(6);
                        continue;

                    }

                case '8':
                    if(hero.getGold() < shopItems.get(7).getPrice() ){
                        System.out.println("Not enough gold");
                        continue;
                    }else{
                        hero.addItems(shopItems.get(7));
                        hero.setGold(hero.getGold()-shopItems.get(7).getPrice());
                        shopItems.remove(7);
                        continue;

                    }
                case '9':
                    if(hero.getGold() < shopItems.get(8).getPrice() ){
                        System.out.println("Not enough gold");
                        continue;
                    }else{
                        hero.addItems(shopItems.get(8));
                        hero.setGold(hero.getGold()-shopItems.get(8).getPrice());
                        shopItems.remove(8);
                        continue;

                    }

                case 'a':
                    ArmyDetails.showForces(hero);
                    continue;



                default:
                    System.out.println("Please enter valid choice!");

            }
        }

    }

    private static int checkCreature(Hero hero, String creature){             // Checks do you have empty slot or same creature in slot


        int slot = 0;

        switch (creature){                                                         // checks if you have slot with the same creature

            case "Gremlin":
                slot = hero.army.checkSlotType("Gremlin");
                break;
            case "Skeleton":
                slot = hero.army.checkSlotType("Skeleton");
                break;
            case "Centaur":
                slot = hero.army.checkSlotType("Centaur");
                break;
            case "Vampire":
                slot = hero.army.checkSlotType("Vampire");
                break;
            case "Pegasus":
                slot = hero.army.checkSlotType("Pegasus");
                break;
            case "Griffon":
                slot = hero.army.checkSlotType("Griffon");
                break;
            case "Dragon":
                slot = hero.army.checkSlotType("Dragon");
                break;
            case "Hydra":
                slot = hero.army.checkSlotType("Hydra");
                break;
            case "Nightmare":
                slot = hero.army.checkSlotType("Nightmare");
                break;

        }

        if(slot == 1 && hero.army.getSlot1numbers() >= 1){
            return slot;
        }else if(slot == 2 && hero.army.getSlot2numbers() >= 1){
            return slot;
        }else if(slot == 3 && hero.army.getSlot3numbers() >= 1){
            return slot;
        }else {

            if (hero.army.checkSlotEmpty(1)) {                               // checks if you have an empty slot so you can put your purchase there
                return 1;
            }

            if (hero.army.checkSlotEmpty(2)) {
                return 2;
            }

            if (hero.army.checkSlotEmpty(3)) {
                return 3;
            }

        }



        return slot;
    }
}
