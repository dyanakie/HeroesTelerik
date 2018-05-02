package HeroesTelerik.Structures;

import HeroesTelerik.Army;
import HeroesTelerik.Coordinate;
import HeroesTelerik.Generator;

/**
 * Created by Joro on 02/05/2018
 */
public class Village extends Structure {
    private Army army;
    private String name;
    private int loot;

    public Village(Coordinate position,String name){
        this.position = position;
        this.name = name;
        this.army = Generator.Generate_Army('V');
        this.loot = Generator.generateLoot('V');
    }

}
