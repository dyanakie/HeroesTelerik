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
        heroArmy.addSlot1(new Gremlin(), 10);
        heroArmy.addSlot2(new Pegasus(), 15);
        heroArmy.addSlot3(new Griffon(), 5);

      //  heroArmy.showWholeArmy();
         Army enemyArmy = new Army();

         enemyArmy.addSlot1(new Griffon(), 5);
         enemyArmy.addSlot2(new Vampire(), 7);
         enemyArmy.addSlot3(new Centaur(), 3);


         battleArmies(heroArmy, enemyArmy);


    }

    public static void battleArmies(Army army1, Army army2) throws IOException{                    // Main method for battling armies

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(!army1.checkDefeated() && !army2.checkDefeated()) {                                   // Checks both armies slots if they are empty


            int[] choice = battleOverview(army1, army2);                                            // gets your choice of attacking creatures and who will they attack

            if(!checkValidAttack(choice, army1, army2)){                                           // if the target stack is empty or your stack slot is empty prints error
                System.out.println("INVALID CHOICE ! Check Forces sir!");
                continue;
            }

            int damage = army1.inflictDamage(choice[0]);


            switch (choice[1]){

                case 1:
                       army2.setSlot1(damage);
                       break;
                case 2:
                       army2.setSlot2(damage);
                       break;
                case 3:
                       army2.setSlot3(damage);
                       break;

            }


        }

        if(army2.checkDefeated()){
            System.out.println("CONGRATULATIONS YOUR FORCES HAVE PREVAILED!");
        }else{
            System.out.println("YOUR FORCES HAVE BEEN CRUSHED!");
        }



    }

    public static int[] battleOverview(Army army1, Army army2)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println();
        System.out.println();
        System.out.println("          YOUR FORCES ENGAGE THE ENEMY    ");
        System.out.println();
        System.out.println("          HERE IS THE BATTLE ORDER COMMANDER  ");
        System.out.println();
        System.out.println("     YOUR ARMY                          ENEMY ARMY     ");
        System.out.println();
        System.out.printf(" 1.  %d %s                              1.  %d %s          \n", army1.getSlot1numbers(), army1.getSlot1Type(), army2.getSlot1numbers(), army2.getSlot1Type());
        System.out.printf(" 2.  %d %s                              2.  %d %s          \n", army1.getSlot2numbers(), army1.getSlot2Type(), army2.getSlot2numbers(), army2.getSlot2Type());
        System.out.printf(" 3.  %d %s                              3.  %d %s          \n", army1.getSlot3numbers(), army1.getSlot3Type(), army2.getSlot3numbers(), army2.getSlot3Type());
        System.out.println();
        System.out.println();
        System.out.println("It is your turn..");
        System.out.println("Which of your forces would you like to use: ");
        int[] choice = new int[2];

        choice[0] = Integer.parseInt(br.readLine());
        System.out.println("And which enemy force would you like to attack: ");
        choice[1] = Integer.parseInt(br.readLine());

        return choice;
    }

    public static void battleInfo(int damage_maker, int damaged_enemy, int damage){

        System.out.println();


    }

    public static boolean checkValidAttack(int[] choice, Army army1, Army army2){

        if(army1.checkSlotEmpty(choice[0])){                         // if returns true then the slot is empty and is not valid attack
            return false;
        }

        if(army2.checkSlotEmpty(choice[1])){                        // same
            return false;
        }

        return true;

    }
}
