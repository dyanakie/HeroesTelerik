package heroes.telerik;

import java.util.Random;

public class LootGenerator {
    public static int generateLoot(char fightType){

        int loot = 0;
        Random random = new Random();

        switch (fightType) {

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
