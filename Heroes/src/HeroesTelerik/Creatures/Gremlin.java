package HeroesTelerik.Creatures;

import HeroesTelerik.Creatures.Easy;

public class Gremlin extends Easy {

    private int health;
    private int damage;
    private String type;

    public Gremlin(){
        super();
        this.type = "Gremlin";

    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getDamage() {
        return damage;
    }


    public String getType(){
        return type;
    }





}
