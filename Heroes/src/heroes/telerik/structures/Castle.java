package heroes.telerik.structures;

import heroes.telerik.Army;
import heroes.telerik.ArmyGenerator;
import heroes.telerik.Coordinate;

/**
 * Created by Joro on 02/05/2018
 */
public class Castle extends Structure{
    private Army army;
    private String name;

    public Castle(){
        this.army = ArmyGenerator.generateArmy('C');
    }

    public Castle(Coordinate position, String name){
        this.position = position;
        this.name = name;
        this.army = ArmyGenerator.generateArmy('C');
    }

    public Army getArmy() {
        return army;
    }
}
