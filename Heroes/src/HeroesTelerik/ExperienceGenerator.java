package HeroesTelerik;

import HeroesTelerik.Creatures.*;

import java.util.Random;

public class ExperienceGenerator {





    public static int generateExp(char fightType){

        int exp = 0;
        Random random = new Random();

        switch (fightType) {

            case 'V':

                exp = random.nextInt(800) + 500;

                return exp;


            case 'A':

                exp = random.nextInt(500) + 1000;

                return exp;

        }

        return exp;

    }

}
