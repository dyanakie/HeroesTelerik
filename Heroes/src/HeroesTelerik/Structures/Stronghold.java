package HeroesTelerik.Structures;

import HeroesTelerik.Army;
import HeroesTelerik.Coordinate;
import HeroesTelerik.Generator;

/**
 * Created by Joro on 02/05/2018
 */
public class Stronghold extends Structure {
    private Army army;
    private int loot;

    public Stronghold(Coordinate position) {
        this.position = position;
        this.army = Generator.Generate_Army('A');
        this.loot = Generator.generateLoot('A');
    }
}
