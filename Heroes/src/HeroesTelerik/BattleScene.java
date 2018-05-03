package HeroesTelerik;

import HeroesTelerik.MainHero.Hero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class BattleScene {

  //  This is where the battles are held between two armies that are given at input

    public static void battleArmies(Army army1, Army army2, Hero hero) throws IOException {                    // Main method for battling armies

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(!army1.checkDefeated() && !army2.checkDefeated()) {                                   // Checks both armies slots if they are empty


            int[] choice = battleOverview(army1, army2);                                            // gets your choice of attacking creatures and who will they attack

            if(!checkValidAttack(choice, army1, army2)){                                           // if the target stack is empty or your stack slot is empty prints error
                System.out.println("INVALID CHOICE ! Check Forces sir!");
                continue;
            }

            int damage = army1.inflictDamage(choice[0]);                                             // adds % to damage equal to Attack SKill

            int damage2 = (int)(damage*hero.getTotalAttack()/100.0);
            damage += damage2;
            System.out.println("Damage increased by " + damage2 + " from Hero Attack Skill");


            switch (choice[1]){

                case 1:
                    army2.setSlotOne(damage);
                    break;
                case 2:
                    army2.setSlotTwo(damage);
                    break;
                case 3:
                    army2.setSlotThree(damage);
                    break;

            }

            if(army2.checkDefeated()){
                break;
            }
            System.out.println("ENEMY ATTACKS!");
            computerAttacks(army1, army2, hero);


        }

        if(army2.checkDefeated()){
            System.out.println("CONGRATULATIONS YOUR FORCES HAVE PREVAILED!");
        }else{
            System.out.println("YOUR FORCES HAVE BEEN CRUSHED!");
            System.exit(0);
        }



    }

    public static int[] battleOverview(Army army1, Army army2)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println();
        System.out.println();
        System.out.println("          YOUR FORCES ENGAGE THE ENEMY    ");
        System.out.println();
        System.out.println("     YOUR ARMY                          ENEMY ARMY     ");
        System.out.println();
        System.out.printf(" 1.  %d %s                              1.  %d %s          \n", army1.getSlot1numbers(), army1.getSlotOneType(), army2.getSlot1numbers(), army2.getSlotOneType());
        System.out.printf(" 2.  %d %s                              2.  %d %s          \n", army1.getSlot2numbers(), army1.getSlotTwoType(), army2.getSlot2numbers(), army2.getSlotTwoType());
        System.out.printf(" 3.  %d %s                              3.  %d %s          \n", army1.getSlot3numbers(), army1.getSlotThreeType(), army2.getSlot3numbers(), army2.getSlotThreeType());
        System.out.println();
        System.out.println();
        System.out.println("It is your turn..");

        int temp = 0;
        int[] choice = new int[2];
        while(true) {
            System.out.println("Which of your forces would you like to use: ");

            String S = br.readLine();
            if(S == null || S.equals("") || S.equals(" ")){
                continue;
            }
            choice[0] = Integer.parseInt(S);
            if(choice[0] == 1 || choice[0] == 2 || choice[0] ==3){
                break;
            }
            else{
                System.out.println("Wrong input!");
                continue;
            }

        }

        while(true) {
            System.out.println("And which enemy force would you like to attack: ");

            String S = br.readLine();
            if(S == null || S.equals("") || S.equals(" ")){
                continue;
            }
            choice[1] = Integer.parseInt(S);


            if(choice[1] == 1 || choice[1] == 2 || choice[1] == 3){
                break;
            }else{
                System.out.println("Wrong input!");
                continue;
            }
        }
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

    public static void computerAttacks(Army army1, Army army2, Hero hero){

        boolean valid_attack = false;
        while(!valid_attack) {
            int[] choice = new int[2];                                                                // gets computer choice of attacking creatures and who will they attack
            Random random = new Random();

            choice[0] = random.nextInt(3) + 1;
            choice[1] = random.nextInt(3) + 1;

            if (!checkValidAttack(choice, army2, army1)) {                                           // if the target stack is empty or your stack slot is empty repeats
                //   System.out.println("INVALID CHOICE ! Check Forces sir!");
                continue;
            }
            valid_attack = true;

            int damage = army2.inflictDamage(choice[0]);

            int damage2 = (int)(damage*hero.getTotalDefence()/100.0);                                     // takes % of damage equal to Defense Skill
            damage -= damage2;
            System.out.println("Damage decreased by " + damage2 + " from Hero Defence Skill");



            switch (choice[1]) {

                case 1:
                    army1.setSlotOne(damage);
                    break;
                case 2:
                    army1.setSlotTwo(damage);
                    break;
                case 3:
                    army1.setSlotThree(damage);
                    break;

            }
        }
    }


}
