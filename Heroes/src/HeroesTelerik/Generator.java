package HeroesTelerik;

import HeroesTelerik.Creatures.*;

import java.util.Random;

public class Generator {

    public static Army Generate_Army(char A) {


        Random random = new Random();
        Army army = new Army();

        switch (A) {

            case 'V':

                int number = random.nextInt(60) + 15;
                army.addSlot1(new Skeleton(), number);

                number = random.nextInt(40) + 5;
                army.addSlot2(new Gremlin(), number);

                number = random.nextInt(35) + 5;
                army.addSlot3(new Centaur(), number);

                return army;


            case 'A':

                number = random.nextInt(35) + 5;
                army.addSlot1(new Vampire(), number);

                number = random.nextInt(35) + 5;
                army.addSlot2(new Griffon(), number);

                number = random.nextInt(35) + 5;
                army.addSlot3(new Pegasus(), number);

                return army;

            case 'C':

                number = random.nextInt(40) + 15;
                army.addSlot1(new Dragon(), number);

                number = random.nextInt(40) + 15;
                army.addSlot2(new Nightmare(), number);

                number = random.nextInt(50) + 20;
                army.addSlot3(new Hydra(), number);

                return army;

        }

        return army;
    }

    public static int generateLoot(char A){

        int loot = 0;
        Random random = new Random();

        switch (A) {

            case 'V':

                loot = random.nextInt(1500) + 500;

                return loot;


            case 'A':

                loot = random.nextInt(3000) + 2000;

                return loot;

        }

        return loot;

    }

}
