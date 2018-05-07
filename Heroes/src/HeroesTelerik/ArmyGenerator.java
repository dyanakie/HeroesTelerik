package HeroesTelerik;

import HeroesTelerik.Creatures.*;

import java.util.Random;

public class ArmyGenerator {
    public static Army generateArmy(char fightType) {


        Random random = new Random();
        Army army = new Army();

        switch (fightType) {

            case 'V':

                int number = random.nextInt(60) + 15;
                army.addSlot1(new Skeleton(), number);

                number = random.nextInt(40) + 5;
                army.addSlot2(new Gremlin(), number);

                number = random.nextInt(35) + 5;
                army.addSlot3(new Centaur(), number);

                return army;


            case 'A':

                number = random.nextInt(45) + 15;
                army.addSlot1(new Vampire(), number);

                number = random.nextInt(45) + 15;
                army.addSlot2(new Griffon(), number);

                number = random.nextInt(45) + 15;
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
}
