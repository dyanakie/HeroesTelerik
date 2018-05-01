package HeroesTelerik;

import HeroesTelerik.MainHero.Hero;
import HeroesTelerik.MainHero.Statistics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

    public static void newGameScreen()throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("********************************************");
        System.out.println("********************************************");
        System.out.println("        WELCOME TO HEROES OF TELERIK        ");
        System.out.println("      created by Drago, Joro and Misho");
        System.out.println();

        System.out.println("|\\             //");
        System.out.println(" \\\\           _!_");
        System.out.println("  \\\\         /___\\");
        System.out.println("   \\\\        [+++]");
        System.out.println("    \\\\    _ _\\^^^/_ _");
        System.out.println("     \\\\/ (    '-'  ( )");
        System.out.println("     /( \\/ | {&}   /\\ \\");
        System.out.println("      \\  / \\     / _> )");
        System.out.println("       \"`   >:::;-'`\"\"'-.");
        System.out.println("            /:::/         \\");
        System.out.println("           /  /||   {&}   |");
        System.out.println("          (  / (\\         /");
        System.out.println("          / /   \\'-.___.-'");
        System.out.println("         / /     \\ \\");
        System.out.println();
        System.out.println(" THe age of heroes is here O'Brave Warrior...");
        System.out.println(" The evil queen Bevmorda has stolen Doncho's laptop! ");
        System.out.println(" What a tragedy!The magic school Telerik will face ruin if");
        System.out.println(" it is not returned in time.You have been chosen to travel to the ");
        System.out.println(" charLand where the queen reigns.\n");
        System.out.println(" O'Brave warrior will you have the strenght?All counts on you!");
        System.out.println();
        pressKey();


    }

    public static int mainMenuInitial() throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 10; i++){
            System.out.println();
        }

        char choice = ' ';
        while(choice != 'E') {
            System.out.println("********************************************");
            System.out.println("********************************************");
            System.out.println("        WELCOME TO HEROES OF TELERIK        ");
            System.out.println("                  P                   MENU:");
            System.out.println("               P /\\  P           1. New Game");
            System.out.println("              /\\|  |/\\           2. Options");
            System.out.println("           [] ||_/\\_|| []        3. Exit");
            System.out.println("           ||_||____||_||        ");
            System.out.println("           ||____[]____||        ");
            System.out.println("           {::     \\__    }");
            System.out.println("       ___  \\v:    .'\"  _V ___");
            System.out.println("      (      \\_      __/  --  )_");
            System.out.println("     (__---    |::\\ :/  ---     )");
            System.out.println("        (       \\::\\/  ----- ___)");
            System.out.println("         (______  \\/     _____)");

            System.out.println();
            System.out.print("Please enter your choice: ");
            choice = br.readLine().charAt(0);

            switch (choice) {
                case '1':
                    return 1;
                case '2':
                    System.out.println("Graphics: low medium high");
                    System.out.println("...");
                    continue;

                case '3':
                    System.exit(0);

                default:
                    System.out.println("Not a valid choice!");


            }
        }

        return 1;

    }

    public static int mainMenuInGame(Hero hero) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 10; i++){
            System.out.println();
        }

        char choice = ' ';
        while(choice != 'E') {
            System.out.println("********************************************");
            System.out.println("********************************************");
            System.out.println("        WELCOME TO HEROES OF TELERIK        ");
            System.out.println("                  P                   MENU:");
            System.out.println("               P /\\  P           1. Continue");
            System.out.println("              /\\|  |/\\           2. Inspect Hero");
            System.out.println("           [] ||_/\\_|| []        3. Inspect Forces");
            System.out.println("           ||_||____||_||        4. Shop");
            System.out.println("           ||____[]____||        5. Exit");
            System.out.println("           {::     \\__    }");
            System.out.println("       ___  \\v:    .'\"  _V ___");
            System.out.println("      (      \\_      __/  --  )_");
            System.out.println("     (__---    |::\\ :/  ---     )");
            System.out.println("        (       \\::\\/  ----- ___)");
            System.out.println("         (______  \\/     _____)");

            System.out.println();
            System.out.print("Please enter your choice: ");
            choice = br.readLine().charAt(0);

            switch (choice) {
                case '1':
                    return 1;

                case '2':
                    Statistics.heroStats(hero);
                    continue;
                case '3':
                    ArmyDetails.showForces(hero);
                    continue;

                case '4':
                    Shop.menu(hero);
                    continue;

                case '5':
                    System.exit(0);



            }
        }

        return 1;

    }

    public static void pressKey()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" Press enter to continue...");
        br.readLine();
    }
}
